package ita.kangaroo.benchmarks;

import ita.kangaroo.model.AddressBean;
import org.openjdk.jmh.annotations.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class AddressMappingBenchmark {

    private List<Map<String, String>> mockDbData;

    @Setup
    public void setup() {
        mockDbData = new ArrayList<>();
        for (int i = 0; i < 200; i++) {
            Map<String, String> row = new HashMap<>();
            row.put("id", String.valueOf(i));
            // Simuliamo un mix di valori reali e null per testare il metodo nn()
            row.put("via", (i % 5 == 0) ? null : "Via delle Prove, " + i);
            row.put("citta", "Castellammare");
            row.put("cap", (i % 10 == 0) ? null : "80053");
            row.put("username", "user_test");
            mockDbData.add(row);
        }
    }

    // Simulazione del metodo utility del DAO
    private String nn(String s) {
        return (s == null) ? "" : s;
    }

    @Benchmark
    public List<AddressBean> benchmarkAddressNormalization() {
        ArrayList<AddressBean> addresses = new ArrayList<>();

        for (Map<String, String> rs : mockDbData) {
            AddressBean bean = new AddressBean();
            bean.setId(Integer.parseInt(rs.get("id")));

            // Focus del benchmark: normalizzazione massiva
            bean.setVia(nn(rs.get("via")));
            bean.setCitta(nn(rs.get("citta")));
            bean.setCAP(nn(rs.get("cap")));
            bean.setUsername(nn(rs.get("username")));

            addresses.add(bean);
        }
        return addresses;
    }
}