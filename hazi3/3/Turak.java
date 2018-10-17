package iskola;

import java.util.Date;

public class Turak {
    private Date datum;
    private String nev;
    private int hossz;

    public Turak(Date datum, String nev, int hossz) {
        this.datum = datum;
        this.nev = nev;
        this.hossz = hossz;
    }

    public Date getDatum() {
        return datum;
    }

    public String getNev() {
        return nev;
    }

    public int getHossz() {
        return hossz;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setHossz(int hossz) {
        this.hossz = hossz;
    }

    @Override
    public String toString() {
        return this.datum + ";" + this.nev + ";" +this.hossz;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) return false;
            else return this.datum == ((Turak) obj).datum;
    }
}
