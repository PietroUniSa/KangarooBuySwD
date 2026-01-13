package ita.kangaroo.model;

public class AddressBean {

    public int id;

    /*@ nullable @*/ public String via;
    /*@ nullable @*/ public String citta;
    /*@ nullable @*/ public String CAP;
    /*@ nullable @*/ public String username;

    public AddressBean() {
        // costruttore vuoto
    }

    /*@ pure @*/ public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    /*@ pure nullable @*/ public String getVia() { return via; }
    public void setVia(String via) { this.via = via; }

    /*@ pure nullable @*/ public String getCitta() { return citta; }
    public void setCitta(String citta) { this.citta = citta; }

    /*@ pure nullable @*/ public String getCAP() { return CAP; }
    public void setCAP(String CAP) { this.CAP = CAP; }

    /*@ pure nullable @*/ public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    // Non vale la pena far “dimostrare” equals con le specs di String/CharSequence.
    //@ skipesc
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AddressBean)) return false;

        AddressBean other = (AddressBean) obj;

        if (this.username == null || other.username == null) return false;
        return this.id == other.id && this.username.equals(other.username);
    }
}
