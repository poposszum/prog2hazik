package com.company;

import java.util.Date;

public class Pekseg extends KereskedelmiEgyseg {
    private String pekAruk;

    public Pekseg(String nev, String cim, Date megnyitasDatuma, String pekAruk) {
        super(nev, cim, megnyitasDatuma);
        this.pekAruk = pekAruk;
    }

    public String getPekAruk() {
        return pekAruk;
    }

    @Override
    public String toString() {
        return "Pékáru:" + this.pekAruk;
    }
}
