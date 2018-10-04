package com.company;

import java.util.Date;

public class KereskedelmiEgyseg {
    private String nev;
    private String cim;
    private Date megnyitasDatuma;

    public KereskedelmiEgyseg(String nev, String cim, Date megnyitasDatuma){
        this.cim = cim;
        this.megnyitasDatuma = megnyitasDatuma;
        this.nev = nev;
    }

    public String getNev() {
        return nev;
    }

    public String getCim() {
        return cim;
    }

    public Date getMegnyitasDatuma() {
        return megnyitasDatuma;
    }

    public void setCim(String cim) {
        this.cim = cim;
    }

    @Override
    public String toString() {
        return "A kereskedelmi egység neve: " + this.nev + ", címe: " + this.cim + " " + this.megnyitasDatuma + " dátumon jött létre.";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj.getClass() != getClass()) return false;
        KereskedelmiEgyseg ke = (KereskedelmiEgyseg) obj;
        return this.nev == ke.getNev() && this.cim == ke.cim;
    }
}
