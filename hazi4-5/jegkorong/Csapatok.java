package hazifeladat;

public class Csapatok {
    private String csapatNev;
    private int pont;
    private int golok;

    public Csapatok(String csapatNev, int pont, int golok) {
        this.csapatNev = csapatNev;
        this.pont = pont;
        this.golok = golok;
    }

    public String getCsapatNev() {
        return csapatNev;
    }

    public void setCsapatNev(String csapatNev) {
        this.csapatNev = csapatNev;
    }

    public int getPont() {
        return pont;
    }

    public void setPont(int pont) {
        this.pont = pont;
    }

    public int getGolok() {
        return golok;
    }

    public void setGolok(int golok) {
        this.golok = golok;
    }
}
