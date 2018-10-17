package iskola;

/*
4
Teszt Elek;K.K.K
Gipsz Jakap;.Z.PK..S.SKZ...P.Z..P.K.S
Vizi Palma;KSKPKZK
Bodon Odon;...K....K....K...
 */


import org.apache.commons.lang3.StringUtils;

import javax.swing.text.Utilities;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String beolvas = scanner.nextLine();

        int n = Integer.parseInt(beolvas);

        List<Turista> list = new ArrayList<>();

        for (int i = 0; i < n; i++){
            beolvas = scanner.nextLine();
            String[] szetszed = beolvas.split(";");

            int kek = StringUtils.countMatches(szetszed[1],"K");
            int piros = StringUtils.countMatches(szetszed[1],"P");
            int sarga = StringUtils.countMatches(szetszed[1],"S");
            int zold = StringUtils.countMatches(szetszed[1],"Z");

            list.add(new Turista(szetszed[0],kek,piros,sarga,zold));
        }


        System.out.println("");

       // for (int i = 0; i < list.size(); i++)
          // System.out.println(list.get(i));

        rangsor(list);

    }

    public static void rangsor(List<Turista> lista) {

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++)
                if (lista.get(i).getKek() < lista.get(j).getKek())
                    Collections.swap(lista, i, j);
        }

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++)
                if (lista.get(i).getKek() == lista.get(j).getKek())
                    if (lista.get(i).getPiros() < lista.get(j).getPiros())
                        Collections.swap(lista, i, j);
        }

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++)
                if (lista.get(i).getPiros() == lista.get(j).getPiros())
                    if (lista.get(i).getSarga() < lista.get(j).getSarga())
                        Collections.swap(lista, i, j);
        }

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++)
                if (lista.get(i).getSarga() == lista.get(j).getSarga())
                    if (lista.get(i).getZold() < lista.get(j).getZold())
                        Collections.swap(lista, i, j);
        }

        for (int i = 0; i < lista.size()-1; i++) {
            for (int j = i + 1; j < lista.size(); j++)
                if (lista.get(i).getZold() == lista.get(j).getZold())
                    if (lista.get(i).getNev().compareTo(lista.get(j).getNev()) > 0)
                        Collections.swap(lista, i, j);
        }
        for (int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i));
    }
}
