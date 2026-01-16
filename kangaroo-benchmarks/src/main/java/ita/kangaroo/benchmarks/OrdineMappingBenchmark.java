package ita.kangaroo.benchmarks;

import ita.kangaroo.model.OrdineBean;
import ita.kangaroo.model.utenteBean;
import org.openjdk.jmh.annotations.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class OrdineMappingBenchmark {

    // Simuliamo i dati grezzi dal DB
    private List<MockOrderData> rawData;

    @Setup
    public void setup() {
        rawData = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            rawData.add(new MockOrderData(i));
        }
    }

    @Benchmark
    public List<OrdineBean> benchmarkOrderComposition() {
        ArrayList<OrdineBean> orders = new ArrayList<>();

        for (MockOrderData data : rawData) {
            OrdineBean bean = new OrdineBean();
            bean.setId(data.id);

            // Simula il risultato di userModel.doRetrieveByKey
            utenteBean client = new utenteBean();
            client.setUsername(data.username);
            client.setNome("User_" + data.id);
            // Non chiamiamo setPassword qui per isolare solo il costo di composizione
            bean.setClient(client);

            bean.setPrezzo_totale(data.prezzo);
            bean.setDestinatario(data.destinatario);
            bean.setMetodo_di_pagamento("Carta di Credito");
            bean.setIndirizzo_di_spedizione("Via Esempio, 10");
            bean.setData(new java.sql.Date(System.currentTimeMillis()));

            orders.add(bean);
        }
        return orders;
    }

    // Classe helper interna per il mock dei dati
    private static class MockOrderData {
        int id;
        String username;
        float prezzo;
        String destinatario;

        MockOrderData(int i) {
            this.id = i;
            this.username = "user" + i;
            this.prezzo = 10.5f+i;
            this.destinatario = "Destinatario " + i;
        }
    }
}