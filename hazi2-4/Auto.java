package com.company;

import java.util.Date;

public class Auto {
    private String rendszam;
    private int teljesitmeny;
    private Date gyartasDatuma;

    public Auto(){
        this.gyartasDatuma = new Date();
    }

    public Auto(String rendszam, int teljesitmeny) {
        this.rendszam = rendszam;
        this.teljesitmeny = teljesitmeny;
    }

    public String getRendszam() {
        return rendszam;
    }

    public int getTeljesitmeny() {
        return teljesitmeny;
    }

    public Date getGyartasDatuma() {
        return gyartasDatuma;
    }

    public void setRendszam(String rendszam) {
        this.rendszam = rendszam;
    }

    @Override
    public String toString() {
        return "Az alábbi járműnek a rendszáma: " + this.rendszam + ", teljesítménye: " + this.teljesitmeny + ", gyártási dátuma: " + this.gyartasDatuma;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != getClass()) return false;
        Auto auto = (Auto) obj;
        return this.rendszam == auto.getRendszam() && this.teljesitmeny == auto.getTeljesitmeny() && this.gyartasDatuma == auto.getGyartasDatuma();
    }
}
