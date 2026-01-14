package ita.kangaroo.model;

public class AddressBean {

    /*@ spec_public @*/ private int id;
    /*@ spec_public @*/ private String via;
    /*@ spec_public @*/ private String citta;
    /*@ spec_public @*/ private String CAP;
    /*@ spec_public @*/ private String username;

    //@ public invariant id >= 0;
    //@ public invariant via != null;
    //@ public invariant citta != null;
    //@ public invariant CAP != null;
    //@ public invariant username != null;

    //@ public invariant (CAP.length() == 0) || (CAP.length() == 5);

    /*@
      @ public normal_behavior
      @   assignable \everything;
      @   ensures id == 0;
      @   ensures via.equals("");
      @   ensures citta.equals("");
      @   ensures CAP.equals("");
      @   ensures username.equals("");
      @*/
    public AddressBean() {
        this.id = 0;
        this.via = "";
        this.citta = "";
        this.CAP = "";
        this.username = "";
    }

    /*@
      @ public normal_behavior
      @   requires id >= 0;
      @   requires via != null;
      @   requires citta != null;
      @   requires CAP != null;
      @   requires username != null;
      @   requires isValidCAP(CAP);
      @   assignable \everything;
      @   ensures this.id == id;
      @   ensures this.via == via;
      @   ensures this.citta == citta;
      @   ensures this.CAP == CAP;
      @   ensures this.username == username;
      @*/
    public AddressBean(int id, String via, String citta, String CAP, String username) {
        this.id = id;
        this.via = via;
        this.citta = citta;
        this.CAP = CAP;
        this.username = username;
    }

    /*@
      @ public normal_behavior
      @   ensures \result == id;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ int getId() { return id; }

    /*@
      @ public normal_behavior
      @   requires id >= 0;
      @   assignable this.id;
      @   ensures this.id == id;
      @*/
    public void setId(int id) { this.id = id; }

    /*@
      @ public normal_behavior
      @   ensures \result == via;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ String getVia() { return via; }

    /*@
      @ public normal_behavior
      @   requires via != null;
      @   assignable this.via;
      @   ensures this.via == via;
      @*/
    public void setVia(String via) { this.via = via; }

    /*@
      @ public normal_behavior
      @   ensures \result == citta;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ String getCitta() { return citta; }

    /*@
      @ public normal_behavior
      @   requires citta != null;
      @   assignable this.citta;
      @   ensures this.citta == citta;
      @*/
    public void setCitta(String citta) { this.citta = citta; }

    /*@
      @ public normal_behavior
      @   ensures \result == CAP;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ String getCAP() { return CAP; }

    /*@
      @ public normal_behavior
      @   requires CAP != null;
      @   requires isValidCAP(CAP);
      @   assignable this.CAP;
      @   ensures this.CAP == CAP;
      @*/
    public void setCAP(String CAP) { this.CAP = CAP; }

    /*@
      @ public normal_behavior
      @   ensures \result == username;
      @   assignable \nothing;
      @*/
    public /*@ pure @*/ String getUsername() { return username; }

    /*@
      @ public normal_behavior
      @   requires username != null;
      @   assignable this.username;
      @   ensures this.username == username;
      @*/
    public void setUsername(String username) { this.username = username; }

    /*@
      @ public normal_behavior
      @   assignable \nothing;
      @   ensures \result <==>
      @      (cap.length() == 0) ||
      @      (cap.length() == 5 &&
      @        cap.charAt(0) >= '0' && cap.charAt(0) <= '9' &&
      @        cap.charAt(1) >= '0' && cap.charAt(1) <= '9' &&
      @        cap.charAt(2) >= '0' && cap.charAt(2) <= '9' &&
      @        cap.charAt(3) >= '0' && cap.charAt(3) <= '9' &&
      @        cap.charAt(4) >= '0' && cap.charAt(4) <= '9');
      @*/
    public static /*@ pure @*/ boolean isValidCAP(String cap) {
        if (cap.length() == 0) return true;
        if (cap.length() != 5) return false;
        return (cap.charAt(0) >= '0' && cap.charAt(0) <= '9' &&
                cap.charAt(1) >= '0' && cap.charAt(1) <= '9' &&
                cap.charAt(2) >= '0' && cap.charAt(2) <= '9' &&
                cap.charAt(3) >= '0' && cap.charAt(3) <= '9' &&
                cap.charAt(4) >= '0' && cap.charAt(4) <= '9');
    }

    /*@
      @ also
      @ public normal_behavior
      @   assignable \nothing;
      @   ensures \result <==>
      @     (obj == this) ||
      @     (obj instanceof AddressBean &&
      @       this.id == ((AddressBean)obj).id &&
      @       this.username.equals(((AddressBean)obj).username)
      @     );
      @*/
    //@ skipesc
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof AddressBean)) return false;
        AddressBean other = (AddressBean) obj;
        return this.id == other.id && this.username.equals(other.username);
    }
}