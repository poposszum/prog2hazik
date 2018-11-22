package hazifeladat;

public class SzeszesItal extends Ital {
    private double alkoholTartalom;

    public SzeszesItal(String nev, String kiszereles, int ar, int alkoholTartalom) {
        super(nev, kiszereles, ar);
        this.alkoholTartalom = alkoholTartalom;
    }

    public double getAlkoholTartalom() {
        return alkoholTartalom;
    }

    @Override
    public String toString() {
        return this.alkoholTartalom + "% alkoholtartalmú " + this.nev + ", " + this.kiszereles + ", " + this.ar + " Ft";
    }
}
