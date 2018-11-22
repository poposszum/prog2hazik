package hazifeladat;

public class Osztalypenz implements Comparable<Osztalypenz> {
    private String tanuloNeve;
    private int penzBefizetve;

    public Osztalypenz(String tanuloNeve) {
        this.tanuloNeve = tanuloNeve;
        this.penzBefizetve = 0;
    }

    public String getTanuloNeve() {
        return tanuloNeve;
    }

    public int getPenzBefizetve() {
        return penzBefizetve;
    }

    public void setPenzBefizetve(int penzBefizetve) {
        this.penzBefizetve += penzBefizetve;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Osztalypenz))
            return false;
        else return this.tanuloNeve.equals(((Osztalypenz) obj).getTanuloNeve());
    }

    @Override
    public String toString() {
        return this.tanuloNeve + ";" + this.penzBefizetve;
    }


    @Override
    public int compareTo(Osztalypenz o) {
        if (this.penzBefizetve == o.getPenzBefizetve())
            return this.tanuloNeve.compareTo(o.getTanuloNeve());
        else {
                return (-1) * Integer.compare(this.penzBefizetve, o.getPenzBefizetve());
        }
    }
}
