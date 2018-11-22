package hazifeladat;


public class Parkolo implements Comparable<Parkolo> {
    private String nev;
    private double terulet;
    private int kapacitas;
    private int foglaltparkolok;


    public Parkolo(String nev, double terulet, int kapacitas, int foglaltparkolok) {
        this.nev = nev;
        this.terulet = terulet;
        this.kapacitas = kapacitas;
        this.foglaltparkolok = foglaltparkolok;
    }

    public String getNev() {
        return nev;
    }

    public int getUresParkolok(){
        return this.kapacitas - this.foglaltparkolok;
    }

    @Override
    public int compareTo(Parkolo o) {
            if (this.getUresParkolok() == o.getUresParkolok())
                return this.nev.compareTo(o.getNev());
            else {
                return (-1) * Integer.compare(this.getUresParkolok(), o.getUresParkolok());
            }
    }

    @Override
    public String toString() {
        return this.nev + ": " + this.getUresParkolok() + " szabad hely";
    }
}
