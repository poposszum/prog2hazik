package com.company;

public class VendeglatoipariEgyseg {
    private String nev;
    private int ferohelyekSzama;
    private boolean dohanyzo;

    public VendeglatoipariEgyseg(String nev, int ferohelyekSzama, boolean dohanyzo) {
        this.nev = nev;
        this.ferohelyekSzama = ferohelyekSzama;
        this.dohanyzo = dohanyzo;
    }

    public String getNev() {
        return nev;
    }

    public int getFerohelyekSzama() {
        return ferohelyekSzama;
    }

    public void setFerohelyekSzama(int ferohelyekSzama) {
        this.ferohelyekSzama = ferohelyekSzama;
    }

    public boolean isDohanyzo() {
        return dohanyzo;
    }

    @Override
    public String toString() {
        if (dohanyzo == true)
            return "A " + this.nev + " nevű vendéglátói ipar dohányzó, és férőhelyeinek száma: " + this.ferohelyekSzama;
            else return "A " + this.nev + " nevű vendéglátói ipar nem dohányzó, és férőhelyeinek száma: " + this.ferohelyekSzama;
    }
}
