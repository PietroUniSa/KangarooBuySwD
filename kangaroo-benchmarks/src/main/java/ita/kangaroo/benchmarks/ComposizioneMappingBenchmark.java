package ita.kangaroo.benchmarks;

import ita.kangaroo.model.OrderProductBean;
import org.openjdk.jmh.annotations.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.Throughput) // Misuriamo quante "liste prodotti" processiamo al secondo
@OutputTimeUnit(TimeUnit.SECONDS)
public class ComposizioneMappingBenchmark {

    private List<Map<String, Object>> mockOrderRows;

    @Setup
    public void setup() {
        mockOrderRows = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            Map<String, Object> row = new HashMap<>();
            row.put("id_ordine", 1001);
            row.put("id_prodotto", i);
            row.put("prezzo", 25.50f);
            row.put("quantita", 2);
            row.put("IVA", 22.0f);
            mockOrderRows.add(row);
        }
    }

    @Benchmark
    public List<OrderProductBean> benchmarkLargeOrderMapping() {
        ArrayList<OrderProductBean> products = new ArrayList<>();

        for (Map<String, Object> rs : mockOrderRows) {
            OrderProductBean product = new OrderProductBean();

            // Mapping di tipi primitivi (molto veloce, ma ripetuto)
            product.setId_ordine((Integer) rs.get("id_ordine"));
            product.setId_prodotto((Integer) rs.get("id_prodotto"));
            product.setPrezzo((Float) rs.get("prezzo"));
            product.setQuantita((Integer) rs.get("quantita"));
            product.setIVA((Float) rs.get("IVA"));

            products.add(product);
        }
        return products;
    }
}