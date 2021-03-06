package com.company;

public class Kocsma extends VendeglatoipariEgyseg {
    private String sorlap;

    public Kocsma(String nev, int ferohelyekSzama, String sorlap) {
        super(nev, ferohelyekSzama, true);
        this.sorlap = sorlap;
    }

    public String getSorlap() {
        return sorlap;
    }

    @Override
    public String toString() {
        return "Az alábbi kocsma sörlapja: " + this.sorlap;
    }
}
