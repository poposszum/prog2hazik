package csoki;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws SilanyMinosegExeption {

        List<Csokigyar> csokigyarList = new ArrayList<>();

        beolvas(csokigyarList);

        Collections.sort(csokigyarList);

        megjelenit(csokigyarList);

        kiir(csokigyarList);


    }

    public static void beolvas(List<Csokigyar> csokigyarList) {

        try {

            FileReader fileReader = new FileReader(new File("in.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String sor;

            while ((sor = bufferedReader.readLine()) != null) {

                String[] szetszed = sor.split(";");
                String[] tmpStr = new String[szetszed.length - 2];

                Csokigyar tmpCsoki = new Csokigyar(szetszed[0], Integer.parseInt(szetszed[1]), szetszed.length - 2);

                for (int i = 0; i < szetszed.length - 2; i++)
                    tmpStr[i] = szetszed[i + 2];

                if (csokigyarList.contains(tmpCsoki)) {
                    csokigyarList.get(csokigyarList.indexOf(tmpCsoki)).setFelhasznaltAlapanyagok(tmpStr);
                } else {
                    tmpCsoki.setFelhasznaltAlapanyagok(tmpStr);
                    csokigyarList.add(tmpCsoki);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    public static void kiir(List<Csokigyar> csokigyarList) {

        try {
            FileWriter fileWriter = new FileWriter("out.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            for (int i = 0; i < csokigyarList.size(); i++) {
                if (csokigyarList.get(i).getFelhasznaltAlapanyagok().length >= 2)
                    bufferedWriter.write(String.valueOf(csokigyarList.get(i)));
            }

            bufferedWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void megjelenit(List<Csokigyar> csokigyarList) throws SilanyMinosegExeption {

        Scanner scanner = new Scanner(System.in);
        String beolvas;
        ArrayList<Integer> ertekek = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            beolvas = scanner.nextLine();
            ertekek.add(Integer.parseInt(beolvas));
        }

        try {

            FileReader fileReader = new FileReader(new File("in.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            int i = -1;
            String sor;

            while ((sor = bufferedReader.readLine()) != null) {

                String[] szetszed = sor.split("[;' ']");
                i++;

                if (szetszed.length-2 > ertekek.get(0) && szetszed.length-2 < ertekek.get(1)) {
                    System.out.println(csokigyarList.get(i));
                    System.out.println(csokigyarList.get(i).megfeleloMinoseg());
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
