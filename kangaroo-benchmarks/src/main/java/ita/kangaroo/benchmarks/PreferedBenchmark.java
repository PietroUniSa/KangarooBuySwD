package ita.kangaroo.benchmarks;

import ita.kangaroo.model.Prefered;
import ita.kangaroo.model.ProdottoBean;
import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS) // Usiamo i nanosecondi per la massima precisione
public class PreferedBenchmark {

    private Prefered listaPreferiti;
    private ProdottoBean nuovoProdotto;

    @Param({"10", "100", "1000"}) // Testa diverse dimensioni della lista
    public int numeroProdottiEsistenti;

    @Setup
    public void setup() {
        listaPreferiti = new Prefered();
        // Riempiamo la lista per simulare un carico "demanding"
        for (int i = 0; i < numeroProdottiEsistenti; i++) {
            ProdottoBean p = new ProdottoBean();
            p.setId(i);
            listaPreferiti.addPreferito(p);
        }

        // Prodotto da aggiungere (non presente, per forzare la scansione completa)
        nuovoProdotto = new ProdottoBean();
        nuovoProdotto.setId(-1); 
    }

    @Benchmark
    public void benchmarkAddPreferito() {
        // Misura l'efficienza della ricerca e dell'aggiunta nella lista
        listaPreferiti.addPreferito(nuovoProdotto);

        // Cleanup per non saturare la memoria durante le iterazioni di JMH
        listaPreferiti.removePreferito(nuovoProdotto);
    }
}