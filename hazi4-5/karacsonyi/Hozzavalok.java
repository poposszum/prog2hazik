package hazifeladat;

public class Hozzavalok implements Comparable<Hozzavalok> {
    private String nev;
    private int mennyiseg;

    public Hozzavalok(String nev) {
        this.nev = nev;
        this.mennyiseg = 0;
    }

    public void setMennyiseg(int mennyiseg) {
        this.mennyiseg += mennyiseg;
    }

    public String getNev() {
        return nev;
    }

    public int getMennyiseg() {
        return mennyiseg;
    }

    @Override
    public String toString() {
        return this.nev + ";" + this.mennyiseg;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Hozzavalok))
            return false;
                else return this.nev.equals(((Hozzavalok) obj).getNev());
    }

    @Override
    public int compareTo(Hozzavalok o) {
        if (this.mennyiseg == o.getMennyiseg())
            return this.getNev().compareTo(o.getNev());
        else {
            return (-1) * Integer.compare(this.mennyiseg,o.getMennyiseg());
        }
    }
}
