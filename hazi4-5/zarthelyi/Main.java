package hazifeladat;

/*
Edit;18
Alex;9
Csilla;13
Kelemen;20
Edit;3
Kelemen;1
Csilla;7
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Zarthelyi> zarthelyiList = new ArrayList<>();

        beolvas(zarthelyiList);

        Collections.sort(zarthelyiList);

        System.out.println(zarthelyiList);
    }

    public static void beolvas(List<Zarthelyi> zarthelyiList) {
        Scanner scanner = new Scanner(System.in);
        String beolvas;
        String[] darabol;

        beolvas = scanner.nextLine();

        while (beolvas.length() > 0){

            darabol = beolvas.split(";");

            Zarthelyi zarthelyi = new Zarthelyi(darabol[0]);

            if (zarthelyiList.contains(zarthelyi)){
                zarthelyiList.get(zarthelyiList.indexOf(zarthelyi)).setEredmeny(Integer.parseInt(darabol[1]));
            }
            else {
                zarthelyi.setEredmeny(Integer.parseInt(darabol[1]));
                zarthelyiList.add(zarthelyi);
            }
            beolvas = scanner.nextLine();
        }
    }
}
