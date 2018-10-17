package iskola;

public class Turista {
    private String nev;
    private int kek;
    private int piros;
    private int sarga;
    private int zold;

    public Turista(String nev, int kek, int piros, int sarga, int zold) {
        this.nev = nev;
        this.kek = kek;
        this.piros = piros;
        this.sarga = sarga;
        this.zold = zold;
    }

    public String getNev() {
        return nev;
    }

    public int getKek() {
        return kek;
    }

    public int getPiros() {
        return piros;
    }

    public int getSarga() {
        return sarga;
    }

    public int getZold() {
        return zold;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKek(int kek) {
        this.kek = kek;
    }

    public void setPiros(int piros) {
        this.piros = piros;
    }

    public void setSarga(int sarga) {
        this.sarga = sarga;
    }

    public void setZold(int zold) {
        this.zold = zold;
    }

    @Override
    public String toString() {
        return this.nev;
    }
}
