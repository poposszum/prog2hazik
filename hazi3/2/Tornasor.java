package iskola;

public class Tornasor {
    private String nev;
    private String kiutan;

    public Tornasor(String nev, String kiutan) {
        this.nev = nev;
        this.kiutan = kiutan;
    }

    public String getNev() {
        return nev;
    }

    public String getKiutan() {
        return kiutan;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKiutan(String kiutan) {
        this.kiutan = kiutan;
    }
}
