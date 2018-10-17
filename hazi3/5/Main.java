package iskola;

/*
6 Debrecen
Budapest:19
Debrecen:24
Esztergom:25
Miskolc:26
Szeged:20
Szolnok:25
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Telepules> listaTelepules = new ArrayList<>();

        String beolvas = scanner.nextLine();
        String[] szetszed = beolvas.split(" ");

        int n = Integer.parseInt(szetszed[0]);

        String xVaros = szetszed[1];

        for (int i = 0; i < n; i++){
            beolvas = scanner.nextLine();
            szetszed = beolvas.split(":");
            listaTelepules.add(new Telepules(szetszed[0],Integer.parseInt(szetszed[1])));
        }

        System.out.println("");

       // for (int i = 0; i < listaTelepules.size(); i++)
         //   System.out.println(listaTelepules.get(i));


        kiirTelepules(listaTelepules,xVaros);

    }

    public static void kiirTelepules(List<Telepules> telepulesList, String xTelepules){
        int indit = 0;
        int index = 0;
        List<Telepules> lista = new ArrayList<>();

        for (int i = 0; i < telepulesList.size(); i++)
            if (xTelepules.equals(telepulesList.get(i).getNev())) {
                indit++;
                index = i;
            }

            if (indit == 0) System.out.println("Missing data");
                else{
                    for (int i = 0; i < telepulesList.size(); i++)
                        if (telepulesList.get(i).getHomerseklet() > telepulesList.get(index).getHomerseklet())
                            lista.add(telepulesList.get(i));
            }

            for (int i = 0; i < lista.size()-1; i++) {
                for (int j = i+1; j < lista.size(); j++) {
                    if (lista.get(i).getHomerseklet() < lista.get(j).getHomerseklet())
                        Collections.swap(lista,i,j);
                }
            }

        for (int i = 0; i < lista.size()-1; i++) {
            for (int j = i + 1; j < lista.size(); j++) {
                if (lista.get(i).getHomerseklet() == lista.get(j).getHomerseklet()){
                  if (lista.get(i).getNev().compareTo(lista.get(j).getNev()) > 0)
                      Collections.swap(lista,i,j);
                }
            }
        }

        for (int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i));
    }
}
