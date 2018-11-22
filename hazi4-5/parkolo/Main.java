package hazifeladat;

/*
Debrecen;300.25;20
Budapest;500.0;30;ABC123;CXK962
Miskolc;140.5;2;CHI299

 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Parkolo> parkoloList = new ArrayList<>();

        beolvas(parkoloList);

        Collections.sort(parkoloList);

       for (int i = 0; i < parkoloList.size(); i++)
           if (parkoloList.get(i).getUresParkolok() >= 3)
               System.out.println(parkoloList.get(i));

    }

    public static void beolvas(List<Parkolo> parkoloList){
        Scanner scanner = new Scanner(System.in);
        String beolvas;
        String[] darabol;
        int db;

        beolvas = scanner.nextLine();

        while (beolvas.length() > 0){

            db = 0;
            for (int i = 0; i < beolvas.length(); i++)
                if (beolvas.charAt(i) == ';')
                    db++;

            darabol = beolvas.split(";");

            parkoloList.add(new Parkolo(darabol[0], Double.parseDouble(darabol[1]), Integer.parseInt(darabol[2]),db-2));

            beolvas = scanner.nextLine();
        }
    }
}
