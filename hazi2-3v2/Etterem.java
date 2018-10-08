package com.company;

public class Etterem extends VendeglatoipariEgyseg {
    private String etlap;

    public Etterem(String nev, int ferohelyekSzama, String etlap) {
        super(nev, ferohelyekSzama, false);
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
