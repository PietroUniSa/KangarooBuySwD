package ita.kangaroo.model;

public class ProdottoBean {

    //@ spec_public
    private int id;
    //@ spec_public
    private String descrizione;
    //@ spec_public
    private String nome;
    //@ spec_public
    private String immagine;
    //@ spec_public
    private float prezzo;
    //@ spec_public
    private int quantita;
    //@ spec_public
    private float iva;

    /*@ spec_public nullable @*/
    private tipo tipo;

    /*@
      public invariant id >= 0;
      public invariant prezzo >= 0.0f;
      public invariant quantita >= 0;
      public invariant iva >= 0.0f;

      // per evitare null-return / null-deref nei getter
      public invariant descrizione != null;
      public invariant nome != null;
      public invariant immagine != null;
    @*/

    /*@
      ensures id == 0;
      ensures prezzo == 0.0f;
      ensures quantita == 0;
      ensures iva == 0.0f;

      ensures descrizione != null;
      ensures nome != null;
      ensures immagine != null;
    @*/
    public ProdottoBean() {
        this.id = 0;
        this.prezzo = 0.0f;
        this.quantita = 0;
        this.iva = 0.0f;
        this.descrizione = "";
        this.nome = "";
        this.immagine = "";
        this.tipo = null; // ammesso
    }

    /*@
      requires id >= 0;
      requires prezzo >= 0.0f;
      requires quantita >= 0;
      requires iva >= 0.0f;

      requires descrizione != null;
      requires nome != null;
      requires immagine != null;
      requires tipo != null;

      ensures this.id == id;
      ensures this.descrizione == descrizione;
      ensures this.nome == nome;
      ensures this.immagine == immagine;
      ensures this.prezzo == prezzo;
      ensures this.quantita == quantita;
      ensures this.iva == iva;
      ensures this.tipo == tipo;
    @*/
    public ProdottoBean(int id, String descrizione, String nome, String immagine,
                        float prezzo, int quantita, float iva, tipo tipo) {
        this.id = id;
        this.descrizione = descrizione;
        this.nome = nome;
        this.immagine = immagine;
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.iva = iva;
        this.tipo = tipo;
    }
    /*@
      @ public normal_behavior
      @   ensures \result == id;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ int getId() {
        return id;
    }


    /*@
      requires id >= 0;
      ensures this.id == id;
      assignable this.id;
    @*/
    public void setId(int id) { this.id = id; }

    /*@ ensures \result == descrizione; assignable \nothing; @*/
    /*@ pure @*/ public String getDescrizione() { return descrizione; }

    /*@
      requires descrizione != null;
      ensures this.descrizione == descrizione;
      assignable this.descrizione;
    @*/
    public void setDescrizione(String descrizione) { this.descrizione = descrizione; }

    /*@ ensures \result == nome; assignable \nothing; @*/
    /*@ pure @*/ public String getNome() { return nome; }

    /*@
      requires nome != null;
      ensures this.nome == nome;
      assignable this.nome;
    @*/
    public void setNome(String nome) { this.nome = nome; }

    /*@ ensures \result == immagine; assignable \nothing; @*/
    /*@ pure @*/ public String getImmagine() { return immagine; }

    /*@
      requires immagine != null;
      ensures this.immagine == immagine;
      assignable this.immagine;
    @*/
    public void setImmagine(String immagine) { this.immagine = immagine; }

    /*@ ensures \result == prezzo; assignable \nothing; @*/
    /*@ pure @*/ public float getPrezzo() { return prezzo; }

    /*@
      requires prezzo >= 0.0f;
      ensures this.prezzo == prezzo;
      assignable this.prezzo;
    @*/
    public void setPrezzo(float prezzo) { this.prezzo = prezzo; }

    /*@ ensures \result == quantita; assignable \nothing; @*/
    /*@ pure @*/ public int getQuantita() { return quantita; }

    /*@
      requires quantita >= 0;
      ensures this.quantita == quantita;
      assignable this.quantita;
    @*/
    public void setQuantita(int quantita) { this.quantita = quantita; }

    /*@ ensures \result == iva; assignable \nothing; @*/
    /*@ pure @*/ public float getIva() { return iva; }

    /*@
      requires iva >= 0.0f;
      ensures this.iva == iva;
      assignable this.iva;
    @*/
    public void setIva(float iva) { this.iva = iva; }

    /*@
      ensures \result == tipo;
      assignable \nothing;
    @*/
    /*@ pure nullable @*/
    public tipo getTipo() { return tipo; }

    /*@
      requires tipo != null;
      ensures this.tipo == tipo;
      assignable this.tipo;
    @*/
    public void setTipo(tipo tipo) { this.tipo = tipo; }

}
