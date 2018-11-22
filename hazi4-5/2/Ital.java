package hazifeladat;

public class Ital implements Comparable<Ital> {
    protected String nev;
    protected String kiszereles;
    protected int ar;

    public Ital(String nev, String kiszereles, int ar) {
        this.nev = nev;
        this.kiszereles = kiszereles;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public String getKiszereles() {
        return kiszereles;
    }

    public int getAr() {
        return ar;
    }

    @Override
    public String toString() {
        return this.nev + ", " + this.kiszereles + ", " + this.ar + " Ft";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Ital)) return false;
        Ital ital = (Ital) obj;
        return this.nev.equals(ital.nev) && this.kiszereles.equals(ital.kiszereles);
    }

    @Override
    public int compareTo(Ital o) {
        return Integer.compare(this.ar, o.getAr());
    }
}
