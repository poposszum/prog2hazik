package hazifeladat;

/*
Tisza;Duna
Duna;Fekete-tenger
Sio csatorna;Duna
Zala;Balaton
Csendes-Ocean
Bodrog;Tisza
Don;Fekete-tenger
Raba;Duna
Dnyeper;Fekete-tenger
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Folyok> folyokList = new ArrayList<>();

        beolvas(folyokList);

        System.out.println(folyokList);
    }

    public static void beolvas(List<Folyok> folyokList){
        Scanner scanner = new Scanner(System.in);
        String beolvas;
        String alapertemezett;
        String[] darabol;

        beolvas = scanner.nextLine();

        while (beolvas.length() > 0){
            alapertemezett = "sehova";

            darabol = beolvas.split(";");

            if (darabol.length == 2)
                alapertemezett = darabol[1];

            folyokList.add(new Folyok(darabol[0],alapertemezett));

            beolvas = scanner.nextLine();
        }
    }
}
