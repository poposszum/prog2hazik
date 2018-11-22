package hazifeladat;

/*
Sweden-Latvia:1-0,0-0,0-1,1-0
Czech Republic-Russia:1-0,1-0,1-0
Latvia-Czech Republic:0-2,1-2,2-1,0-0,0-1
Kazakhstan-Russia:3-3,0-1,1-2
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Meccsek> meccsekList = new ArrayList<>();

        beolvas(meccsekList);

        System.out.println(meccsekList);
    }

    public static void beolvas(List<Meccsek> meccsekList){
        Scanner scanner = new Scanner(System.in);
        String beolvas;
        String[] szetvag;

        beolvas = scanner.nextLine();

        while (beolvas.length() > 0){

            szetvag = beolvas.split(":");

            meccsekList.add(new Meccsek(szetvag[0],szetvag[1]));

            beolvas = scanner.nextLine();
        }
    }
}
