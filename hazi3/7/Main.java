package iskola;

/*
5
take:visz
dove:galamb
take:vesz
pigeon:galamb
take:fog
 */


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String beolvas = scanner.nextLine();

        String[] szetszed = beolvas.split(":");

        int n = Integer.parseInt(szetszed[0]);

        List<Szotar> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            beolvas = scanner.nextLine();
            szetszed = beolvas.split(":");

            list.add(new Szotar(szetszed[0], szetszed[1]));
        }

            System.out.println("");

            rendez(list);



    }

    public static void rendez(List<Szotar> lista) {

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++)
                if (lista.get(i).getAngolSzo().compareTo(lista.get(j).getAngolSzo()) > 0)
                    Collections.swap(lista, i, j);
        }

        for (int i = 0; i < lista.size() - 1; i++) {
            for (int j = i + 1; j < lista.size(); j++)
                if (lista.get(i).getAngolSzo().equals(lista.get(j).getAngolSzo()))
                    if (lista.get(i).getMagyarSzo().compareTo(lista.get(j).getMagyarSzo()) > 0)
                        Collections.swap(lista, i, j);
        }

        for (int i = 0; i < lista.size(); i++)
            System.out.println(lista.get(i));
    }
}
