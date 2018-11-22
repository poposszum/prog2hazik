package hazifeladat;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
5425903142657353
5425903142657354
 */

public class Main {

    public static void main(String[] args) {
        List<Bankkartya> bankkartyaList = new ArrayList<>();

        beolvas(bankkartyaList);

        for (int i = 0; i < bankkartyaList.size(); i++)
        if (bankkartyaList.get(i).ellenoriz())
            System.out.println("YES");
                else System.out.println("NO");
    }

    public static void beolvas(List<Bankkartya> bankkartyaList){
        Scanner scanner = new Scanner(System.in);
        String beolvas;
        char[] cArray;

                beolvas = scanner.nextLine();

        while (beolvas.length() > 0){

            cArray = beolvas.toCharArray();

            System.out.println("alma");

            bankkartyaList.add(new Bankkartya(cArray));

            beolvas = scanner.nextLine();
        }
    }
}
