package egyetem;


/*
2
25 igen
25 igen
 */

import zh.Hallgato;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String beolvas = scanner.nextLine();

        int n = Integer.parseInt(beolvas);

        List<Hallgato> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boolean bool;
            beolvas = scanner.nextLine();
            String[] szetszed = beolvas.split(" ");

            if (szetszed[1].equals("igen"))
                bool = true;
            else bool = false;

            list.add(new Hallgato(Integer.parseInt(szetszed[0]), bool));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
            System.out.println(list.get(i).dolgozatotIr());

            if (list.get(i).dolgozatotIr().megfelelt())
                System.out.println("megfelelt");
            else System.out.println("nem felelt meg");
        }
    }
}
