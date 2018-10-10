package iskola;

public class Orarend {
    private String melyikNap;
    private Ora[] orak;
    private int orakSzama;

    public Orarend(String melyikNap){
        this.melyikNap = melyikNap;
        this.orakSzama = 0;
        this.orak = new Ora[12];
    }

    public String getMelyikNap() {
        return melyikNap;
    }

    public Ora[] getOrak() {
        return orak;
    }

    public int getOrakSzama() {
        return orakSzama;
    }

    public void setMelyikNap(String melyikNap) {
        this.melyikNap = melyikNap;
    }

    public void setOrak(Ora[] orak) {
        this.orak = orak.clone();
    }

    public void setOrakSzama(int orakSzama) {
        this.orakSzama = orakSzama;
    }

    @Override
    public String toString() {
        return this.melyikNap + "i napon " + this.orakSzama + " óra van.";
    }

    public boolean oratHozzaad(Ora hozzaadOra){
        boolean logic = true;
        int db = 0;
        if (this.orakSzama > 12) logic = false;
            else {
                for (int i = 0; i < this.orak.length; i++)
                    if (this.orak[0] == null) {
                        db++;
                    }
                        if (db == this.orak.length)
                            logic = true;
            else {
                for (int j = 0; j < this.orak.length; j++)
                    if (this.orak[j].getOraKezdete() == hozzaadOra.getOraKezdete()) {
                        logic = false;
                        break;
                    }
            }
        }
        return logic;
    }
}
