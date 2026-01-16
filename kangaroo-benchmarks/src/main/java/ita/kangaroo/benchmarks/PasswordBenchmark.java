package ita.kangaroo.benchmarks;

import ita.kangaroo.model.utenteBean;
import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime) // Misura il tempo medio per operazione
@OutputTimeUnit(TimeUnit.MICROSECONDS) // Risultati in microsecondi
public class PasswordBenchmark {

    private utenteBean user;
    private String passwordTest;

    @Setup
    public void setup() {
        user = new utenteBean();
        passwordTest = "UnaPasswordMoltoLungaEComplessa123!";
    }

    @Benchmark
    public void benchmarkPasswordHashing() {
        // Questo è il componente "demanding": calcolo SHA-1 e formattazione String
        user.setPassword(passwordTest);
    }
}