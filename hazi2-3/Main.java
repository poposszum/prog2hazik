package com.company;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat datum = new SimpleDateFormat("yyyy-mm-dd");

        java.util.Date myDate = datum.parse("2015-05-25");

        KereskedelmiEgyseg[] tomb = new KereskedelmiEgyseg[5];

        tomb[0] = new Pekseg("ABC","ABC utca",myDate,"kenyer");
        tomb[1] = new Pekseg("CBA","CBA utca",myDate,"kalacs");
        tomb[2] = new Pekseg("Spar","CBA utca",myDate,"kenyer");
        tomb[3] = new Pekseg("Tesco","CBA utca",myDate,"teszta");
        tomb[4] = new Pekseg("Aldi","CBA utca",myDate,"semmi");
        //tomb[5] = new NemzetiDohanybolt("cigi","cigi utca",myDate,",malboro");
        Pekseg[] pks = adottPekarutArusitoPekseg("kenyer", tomb);
        for (int i = 0; i < Array.getLength(pks); i++)
            System.out.println(pks[i].getNev());


    }

    public static Pekseg[] adottPekarutArusitoPekseg(String peksuti, KereskedelmiEgyseg[] ker){
        List<Pekseg> list = new ArrayList<>();
        for (int i = 0; i < Array.getLength(ker); i++)
            if (ker[i].getClass() == Pekseg.class){
                Pekseg pk = (Pekseg) ker[i];
                if (pk.getPekAruk() == peksuti){
                    list.add(pk);
                }
            }
        Pekseg[] stockArr = new Pekseg[list.size()];
        stockArr = list.toArray(stockArr);
            return stockArr;
    }
}
