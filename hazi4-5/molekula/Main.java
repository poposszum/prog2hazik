package hazifeladat;

/*
H:hidrogen
O:oxigen
Na:natrium
Cl:klor
-
viz:H,O,H
konyhaso:Na,Cl
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<String> molekulaList = new ArrayList<>();
        List<Molekula> vegyuletList = new ArrayList<>();

        beolvas(molekulaList, vegyuletList);
        for (int i = 0; i < vegyuletList.size(); i++)
            vegyuletList.get(i).szamolMolekula();

        System.out.println(molekulaList);
        System.out.println(vegyuletList);


    }

    public static void beolvas(List<String> molekulaList, List<Molekula> vegyuletList) {
        Scanner scanner = new Scanner(System.in);
        String beolvas;
        String[] szetszed;

        beolvas = scanner.nextLine();

        while (!beolvas.equals("-")){

            szetszed = beolvas.split(":");

            molekulaList.add(szetszed[0]);
            molekulaList.add(szetszed[1]);

            beolvas = scanner.nextLine();
        }

        beolvas = scanner.nextLine();

        while (beolvas.length() > 0){

            szetszed = beolvas.split(":");

            vegyuletList.add(new Molekula(szetszed[0] ,szetszed[1]));

            beolvas = scanner.nextLine();
        }
    }
}
