package com.company;

import java.util.Date;

public class NemzetiDohanybolt extends KereskedelmiEgyseg {
    private String cigarettak;

    public NemzetiDohanybolt(String nev, String cim, Date megnyitasDatuma, String cigarettak) {
        super(nev, cim, megnyitasDatuma);
        this.cigarettak = cigarettak;
    }

    public String getCigarettak() {
        return cigarettak;
    }

    @Override
    public String toString() {
        return "Cigaretták:" + this.cigarettak;
    }
}
