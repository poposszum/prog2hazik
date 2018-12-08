package hazifeladat;

public class Cegek implements Comparable<Cegek> {
    private String cegNev;
    private String cegTelephely;
    private int arbevetel;
    private int evekSzama;

    public Cegek(String cegNev, String cegTelephely) {
        this.cegNev = cegNev;
        this.cegTelephely = cegTelephely;
        this.arbevetel = 0;
        this.evekSzama = 0;
    }

    public String getCegTelephely() {
        return cegTelephely;
    }

    public void setCegTelephely(String cegTelephely) {
        this.cegTelephely = this.cegTelephely;
    }

    public String getCegNev() {
        return cegNev;
    }

    public void setCegNev(String cegNev) {
        this.cegNev = cegNev;
    }

    public int getArbevetel() {
        return arbevetel;
    }

    public void setArbevetel(int arbevetel) {
        this.arbevetel = arbevetel;
    }

    public int getEvekSzama() {
        return evekSzama;
    }

    public void setEvekSzama() {
        this.evekSzama = evekSzama + 1;
    }

    @Override
    public String toString() {
        return this.cegNev + " (" + this.cegTelephely + "): " + this.arbevetel;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Cegek))
            return false;

        return this.cegNev.equals(((Cegek) obj).getCegNev()) && this.cegTelephely.equals(((Cegek) obj).getCegTelephely());
    }

    @Override
    public int compareTo(Cegek o) {
        if (this.arbevetel == o.getArbevetel()) {
            if (this.evekSzama == o.getEvekSzama()) {
                return this.cegNev.compareTo(o.getCegNev());
            } else return Integer.compare(this.evekSzama, o.getEvekSzama());
        }
        else return (-1) * Integer.compare(this.arbevetel, o.getArbevetel());
    }
}
