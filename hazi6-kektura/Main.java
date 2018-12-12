package hazifeladat;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Tura> turaList = new ArrayList<>();

        beolvas(turaList);

        Collections.sort(turaList);
        
        for (int i = 0; i < turaList.size(); i++)
            if (turaList.get(i).turazoOK())
                System.out.println(turaList.get(i).getTurazoNeve());

    }

    public static void beolvas(List<Tura> turaList){

        try {
            FileReader fileReader = new FileReader("sample.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String sor;

            while ((sor = bufferedReader.readLine()) != null){

                String[] szetszed = sor.split("[:-]");

                Tura turazo = new Tura(szetszed[0]);

                if (turaList.contains(turazo)){
                    turaList.get(turaList.indexOf(turazo)).addTurakLista(szetszed[1]);
                    turaList.get(turaList.indexOf(turazo)).addTurakLista(szetszed[2]);
                }

                else {
                    turazo.addTurakLista(szetszed[1]);
                    turazo.addTurakLista(szetszed[2]);
                    turaList.add(turazo);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
