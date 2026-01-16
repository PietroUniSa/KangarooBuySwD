package ita.kangaroo.benchmarks;

import org.openjdk.jmh.annotations.*;
import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@Warmup(iterations = 3)
@Measurement(iterations = 3)
@Fork(1)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
public class SmokeBenchmark {

    @Benchmark
    public int add() {
        return 1 + 2;
    }
}
