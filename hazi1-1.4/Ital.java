package com.company;

import java.util.Date;
import java.util.zip.DataFormatException;

public class Ital {
    protected String nev;
    protected String kiszereles;
    private static int ar = 10;
    protected Date gyartasiDatum;

    public Ital(String nev, String kiszereles) {
        this.nev = nev;
        this.kiszereles = kiszereles;
    }

    public Ital(){
        this.gyartasiDatum = new Date();
    }

    public String getNev(){
        return nev;
    }

    public String getKiszereles(){
        return kiszereles;
    }

    public static int getAr() {
        return ar;
    }

    public Date getGyartasiDatum() {
        return gyartasiDatum;
    }

    public static void setAr(int bear){
          ar = bear;
    }

    @Override
    public String toString() {
        return this.nev + ", " + this.kiszereles + ", " + ar + " Ft";
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(obj.getClass() != getClass()) return false;
        Ital ital = (Ital) obj;
        return this.nev == ital.getNev() && this.kiszereles == ital.getKiszereles();
    }

    public static double getArEuroban(){
        double arEuroban = (double) this.ar;
        return arEuroban / 300;
    }
}
