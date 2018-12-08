package hazifeladat;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Cegek> cegekList = new ArrayList<>();

        beolvas(cegekList, args);

        Collections.sort(cegekList);

        for (int i = 0; i < cegekList.size(); i++)
            System.out.println(cegekList.get(i));
    }

    public static void beolvas(List<Cegek> cegekList, String[] args){


        try {
            FileReader fileReader = new FileReader(new File("be.txt"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String sor;

            while ((sor = bufferedReader.readLine()) != null){

                String[] szetszed = sor.split(":");

                Cegek ceg = new Cegek(szetszed[0],szetszed[1]);

                if (cegekList.contains(ceg)){
                    cegekList.get(cegekList.indexOf(ceg)).setArbevetel(cegekList.get(cegekList.indexOf(ceg)).getArbevetel() + Integer.parseInt(szetszed[3]));
                    cegekList.get(cegekList.indexOf(ceg)).setEvekSzama();
                }
                else {
                    ceg.setArbevetel(Integer.parseInt(szetszed[3]));
                    cegekList.add(ceg);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
