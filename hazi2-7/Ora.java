package iskola;

public class Ora {
    private int oraID;
    private String nev;
    private int oraKezdete;

    public Ora(int oraID, String nev, int oraKezdete) {
        this.oraID = oraID;
        this.nev = nev;
        if (oraKezdete < 8)
            this.oraKezdete = 8;
            else if (oraKezdete > 19)
                this.oraKezdete = 18;
    }

    public int getOraID() {
        return oraID;
    }

    public String getNev() {
        return nev;
    }

    public int getOraKezdete() {
        return oraKezdete;
    }

    public void setOraID(int oraID) {
        this.oraID = oraID;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setOraKezdete(int oraKezdete) {
        this.oraKezdete = oraKezdete;
    }

    @Override
    public String toString() {
        return "A " + this.nev + " nevű óra (ID: " + this.oraID + ") " + this.oraKezdete + " órakor kezdődik.";
    }
}
