package hazifeladat;

public class Zarthelyi implements Comparable<Zarthelyi> {
    private String nev;
    private int eredmeny;

    public Zarthelyi(String nev) {
        this.nev = nev;
        this.eredmeny = 0;
    }

    public String getNev() {
        return nev;
    }

    public int getEredmeny() {
        return eredmeny;
    }

    public void setEredmeny(int eredmeny) {
        this.eredmeny += eredmeny;
    }

    @Override
    public String toString() {
        return this.nev + ": " + this.eredmeny + " pont";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Zarthelyi))
            return false;
        else return this.nev.equals(((Zarthelyi) obj).getNev());
    }

    @Override
    public int compareTo(Zarthelyi o) {
        if (this.eredmeny == o.getEredmeny())
            return this.nev.compareTo(o.getNev());
        else {
            return (-1) * Integer.compare(this.eredmeny, o.getEredmeny());
        }
    }
}
