package hazifeladat;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Meresek> meresekList = new ArrayList<>();

        beolvas(meresekList);

    }

    public static void beolvas(List<Meresek> meresekList) {

        try {
            FileReader fileReader = new FileReader("sample.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            List<Meresek> tmpList = new ArrayList<>();

            String sor;

            while ((sor = bufferedReader.readLine()) != null) {

                if (sor.equals("END")) {

                    kiir(meresekList);
                    meresekList.clear();
                }

                else {
                    String[] szetszed = sor.split(":");

                    meresekList.add(new Meresek(szetszed[1].toCharArray()));
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void kiir(List<Meresek> meresekList){

        List<Integer> tmp = meresekList.get(0).pozicioSzamolas();

        for (Meresek i:meresekList)
            tmp.retainAll(i.pozicioSzamolas());

        System.out.println(tmp.size());
    }

}
