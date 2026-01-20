package ita.kangaroo.model;

public class ciboBean extends ProdottoBean {

    private double peso;

    public ciboBean(int id, double peso) {
        super.setId(id);      // oppure super(id, ...)
        this.peso = peso;
    }

    public ciboBean(
            int id,
            String descrizione,
            String nome,
            String immagine,
            float prezzo,
            int quantita,
            float iva,
            tipo tipo,
            double peso
    ) {
        super(id, descrizione, nome, immagine, prezzo, quantita, iva, tipo);
        this.peso = peso;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
