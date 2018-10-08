package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    VendeglatoipariEgyseg[] tomb = new VendeglatoipariEgyseg[3];

	    tomb[0] = new Kocsma("Kocsma1",100,true, "feher");
	    tomb[1] = new Kocsma("Kocsma2",150,true,"barna");
	    tomb[2] = new Kocsma("Kocsma3",100,false,"palinka");

	    Kocsma[] kcsma = AdottItaltKinaloKocsmak("feher",tomb);

        for (int i = 0; i < Array.getLength(kcsma); i++)
            System.out.println(tomb[i].getNev());

    }

    public static Kocsma[] AdottItaltKinaloKocsmak(String ital, VendeglatoipariEgyseg[] t){
        List<Kocsma> list = new ArrayList<>();

        for (int i = 0; i < Array.getLength(t); i++) {
             if (t[i].getClass() == Kocsma.class) {
            Kocsma kcsm = (Kocsma) t[i];
             if (kcsm.getSorlap() == ital)
            list.add(kcsm);
            }


        }
        Kocsma[] itl = new Kocsma[list.size()];
            itl = list.toArray(itl);
                return itl;
    }
}
