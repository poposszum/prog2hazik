package hazifeladat;

/*
Pisti;500
Feri;1000
Peti;200
Feri;300
Pisti;800
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Osztalypenz> osztalypenzList = new ArrayList<>();

        beolvas(osztalypenzList);

        Collections.sort(osztalypenzList);

        System.out.println(osztalypenzList);
    }

    public static void beolvas(List<Osztalypenz> osztalypenzList){
        Scanner scanner = new Scanner(System.in);
        String beolvas;
        String[] szetszed;

        beolvas = scanner.nextLine();

        while (beolvas.length() > 0){

            szetszed = beolvas.split(";");

            Osztalypenz tanulo = new Osztalypenz(szetszed[0]);

            if (osztalypenzList.contains(tanulo)){
                osztalypenzList.get(osztalypenzList.indexOf(tanulo)).setPenzBefizetve(Integer.parseInt(szetszed[1]));
            }
            else {
                tanulo.setPenzBefizetve(Integer.parseInt(szetszed[1]));
                osztalypenzList.add(tanulo);
            }
            beolvas = scanner.nextLine();
        }
    }
}
