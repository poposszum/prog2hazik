package hazifeladat;

import javafx.print.Collation;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Szallitmany> szallitmanyList = new ArrayList<>();

        beolvas(szallitmanyList, args);

        Collections.sort(szallitmanyList);

        for (int i = 0; i < szallitmanyList.size(); i++)
            System.out.println(szallitmanyList.get(i));



    }

    public static void beolvas(List<Szallitmany> szallitmanyList, String[] args){

        try {
            FileReader fileReader = new FileReader(new File("sample.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String sor;

            while ((sor = bufferedReader.readLine()) != null){

                String[] szetszed = sor.split(":");

                Szallitmany szallitmany = new Szallitmany(Integer.parseInt(szetszed[1]));

                if (szallitmanyList.contains(szallitmany)){
                    szallitmanyList.get(szallitmanyList.indexOf(szallitmany)).addCimzettNev(szetszed[0]);
                    szallitmanyList.get(szallitmanyList.indexOf(szallitmany)).addCsomagErtek(Integer.parseInt(szetszed[5]));
                    szallitmanyList.get(szallitmanyList.indexOf(szallitmany)).addHazszam(Integer.parseInt(szetszed[4]));
                    szallitmanyList.get(szallitmanyList.indexOf(szallitmany)).addUtcaNev(szetszed[3]);
                    szallitmanyList.get(szallitmanyList.indexOf(szallitmany)).addTelepulesNev(szetszed[2]);
                }

                else {
                    szallitmany.addCimzettNev(szetszed[0]);
                    szallitmany.addCsomagErtek(Integer.parseInt(szetszed[5]));
                    szallitmany.addHazszam(Integer.parseInt(szetszed[4]));
                    szallitmany.addUtcaNev(szetszed[3]);
                    szallitmany.addTelepulesNev(szetszed[2]);
                    szallitmanyList.add(szallitmany);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
