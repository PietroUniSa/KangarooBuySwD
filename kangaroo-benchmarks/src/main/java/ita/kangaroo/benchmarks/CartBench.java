package ita.kangaroo.benchmarks;


import ita.kangaroo.model.Cart;
import ita.kangaroo.model.ProdottoBean;
import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.infra.Blackhole;

import java.util.concurrent.TimeUnit;

@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.NANOSECONDS)
@Warmup(iterations = 5, time = 1, timeUnit = TimeUnit.SECONDS)
@Measurement(iterations = 8, time = 1, timeUnit = TimeUnit.SECONDS)
@Fork(value = 2)
@State(Scope.Thread)
public class CartBench {

  /** Quanti prodotti distinti metto nel carrello prima di misurare */
  @Param({"5", "10", "50"})
  public int distinctItems;

  /** Target per operazioni (esistente / nuovo) */
  private ProdottoBean existing;
  private ProdottoBean missing;

  /** Array di prodotti per popolare il carrello */
  private ProdottoBean[] products;

  @Setup(Level.Trial)
  public void trialSetup() {
    products = new ProdottoBean[distinctItems];
    for (int i = 0; i < distinctItems; i++) {
      products[i] = prodotto(i + 1); // id > 0
    }
    existing = products[distinctItems / 2];      // sicuramente presente
    missing  = prodotto(1_000_000 + distinctItems); // sicuramente non presente
  }

  /** Ricrea il carrello ad ogni iterazione per evitare “stato sporco” */
  private Cart freshCartFilled() {
    Cart c = new Cart();
    for (ProdottoBean p : products) c.addProduct(p);
    return c;
  }

  // -------------------------
  // addProduct
  // -------------------------

  /** Caso: prodotto già presente -> scan + incrementa quantità */
  @Benchmark
  public Cart add_existing_incrementsQuantity() {
    Cart c = freshCartFilled();
    c.addProduct(existing);
    return c;
  }

  /** Caso: prodotto mancante -> scan completo + append */
  @Benchmark
  public Cart add_missing_appendsNewEntry() {
    Cart c = freshCartFilled();
    c.addProduct(missing);
    return c;
  }

  /**
   * Caso: resize -> misura Arrays.copyOf + append.
   * Nota: la tua capacity iniziale è 10. Qui forziamo a superarla.
   */
  @Benchmark
  public Cart add_triggersResize() {
    Cart c = new Cart();
    // riempi fino a capacity iniziale (10)
    for (int i = 0; i < 10; i++) c.addProduct(prodotto(i + 1));
    // prossimo add -> resize
    c.addProduct(prodotto(999_999));
    return c;
  }

  // -------------------------
  // removeProduct
  // -------------------------

  /** Rimuove il primo elemento: shift massimo */
  @Benchmark
  public Cart remove_first_maxShift() {
    Cart c = freshCartFilled();
    c.removeProduct(products[0]);
    return c;
  }

  /** Rimuove in mezzo: shift medio */
  @Benchmark
  public Cart remove_middle_mediumShift() {
    Cart c = freshCartFilled();
    c.removeProduct(existing);
    return c;
  }

  /** Rimuove l’ultimo: shift quasi nullo */
  @Benchmark
  public Cart remove_last_minShift() {
    Cart c = freshCartFilled();
    c.removeProduct(products[distinctItems - 1]);
    return c;
  }

  // -------------------------
  // getProducts
  // -------------------------

  /**
   * getProducts alloca sempre una nuova ArrayList e copia i riferimenti:
   * qui misuri principalmente allocazioni + loop.
   */
  @Benchmark
  public void getProducts_allocatesAndCopies(Blackhole bh) {
    Cart c = freshCartFilled();
    bh.consume(c.getProducts());
  }

  // -------------------------
  // Helper: costruzione ProdottoBean
  // -------------------------

  private static ProdottoBean prodotto(int id) {
    ProdottoBean p = new ProdottoBean();
    p.setId(id); // IMPORTANT: il tuo Cart richiede getId() > 0
    return p;
  }
}
