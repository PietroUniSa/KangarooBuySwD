package ita.kangaroo.benchmarks;

import ita.kangaroo.model.MetodoPagamentoBean;
import org.openjdk.jmh.annotations.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS) // Usiamo i nanosecondi per vedere la differenza logica
public class PagamentoMappingBenchmark {

    private List<Map<String, String>> mockResultSet;

    @Setup
    public void setup() {
        mockResultSet = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Map<String, String> row = new HashMap<>();
            row.put("id", String.valueOf(i));
            row.put("numero_di_carta", "1234-5678-9012-" + i);
            row.put("cvv", "123");
            row.put("data_scadenza", "12/28");
            row.put("circuito", "VISA");

            // Simuliamo il caso critico: 'username' è null, deve cercare 'Username'
            row.put("username", null); 
            row.put("Username", "usertest" + i);

            mockResultSet.add(row);
        }
    }

    @Benchmark
    public List<MetodoPagamentoBean> benchmarkRetrieveByClientMapping() {
        ArrayList<MetodoPagamentoBean> beans = new ArrayList<>();

        for (Map<String, String> rs : mockResultSet) {
            MetodoPagamentoBean bean = new MetodoPagamentoBean();

            bean.setId(Integer.parseInt(rs.get("id")));
            bean.setNumero_carta(rs.get("numero_di_carta"));
            bean.setCvv(rs.get("cvv"));
            bean.setData_scadenza(rs.get("data_scadenza"));
            bean.setCircuito(rs.get("circuito"));

            // LOGICA CRITICA SOTTO TEST
            String u = rs.get("username");
            if (u == null) {
                u = rs.get("Username");
            }
            bean.setUsername(u);

            beans.add(bean);
        }
        return beans;
    }
}