package hazifeladat;

/*
A tegla (2006):Leonardo DiCaprio,Matt Damon,Jack Nicholson,Mark Wahlberg,Martin Sheen


paradicsom;4
paprika;3
zeller;5
paradicsom;4
paprika;5
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Hozzavalok> hozzavalokList = new ArrayList<>();

        beolvas(hozzavalokList);

        Collections.sort(hozzavalokList);

        System.out.println(hozzavalokList);

    }

    public static void beolvas(List<Hozzavalok> hozzavalokList){
        Scanner scanner = new Scanner(System.in);
        String beolvas;
        String[] szetszed;

        beolvas = scanner.nextLine();

        while (beolvas.length() > 0){
            szetszed = beolvas.split(";");
            Hozzavalok hozzavalok = new Hozzavalok(szetszed[0]);

            if (hozzavalokList.contains(hozzavalok)){
                hozzavalokList.get(hozzavalokList.indexOf(hozzavalok)).setMennyiseg(Integer.parseInt(szetszed[1]));
            }
            else {
                hozzavalok.setMennyiseg(Integer.parseInt(szetszed[1]));
                hozzavalokList.add(hozzavalok);
            }
            beolvas = scanner.nextLine();
        }
    }
}
