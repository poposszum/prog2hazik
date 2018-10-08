package com.company;

public class Etterem extends VendeglatoipariEgyseg {
    private String etlap;

    public Etterem(String nev, int ferohelyekSzama, boolean dohanyzo, String etlap) {
        super(nev, ferohelyekSzama, dohanyzo);
        this.etlap = etlap;
    }

    public String getEtlap() {
        return etlap;
    }

    @Override
    public String toString() {
        return "Az étterem étlapja: " + this.etlap;
    }
}
