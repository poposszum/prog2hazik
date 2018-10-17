package iskola;

public class Telepules {
    private String nev;
    private int homerseklet;

    public Telepules(String nev, int homerseklet) {
        this.nev = nev;
        this.homerseklet = homerseklet;
    }

    public String getNev() {
        return nev;
    }

    public int getHomerseklet() {
        return homerseklet;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setHomerseklet(int homerseklet) {
        this.homerseklet = homerseklet;
    }

    @Override
    public String toString() {
        return this.nev + " (" + this.homerseklet + ")";
    }
}
