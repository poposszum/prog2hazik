package iskola;

/*
5
2017;05;14;Budaorsi dolomitok;5;4;3;5;5
2017;02;04;Kitaibel Pal emlektura;2;3;2;3
2017;04;01;Baba;3;3;3;4;3;3;3
2017;01;21;Toldi Miklos emlektura;6;4;6;4
2017;04;01;Pipi;4;4;4

 */

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Turak> turakList = new ArrayList<>();

        for (int i = 0; i < n; i++){
            String beOlvas = scanner.nextLine();
            String[] szetszed = beOlvas.split(";");

            String datumStr = szetszed[0]+"-"+szetszed[1]+"-"+szetszed[2];

            DateFormat format = new SimpleDateFormat("yyyy-mm-dd");

            Date date = format.parse(datumStr);

            int sum = 0;
            for (int j = 4; j < szetszed.length; j++)
                sum+= Integer.parseInt(szetszed[j]);

            turakList.add(new Turak(date,szetszed[3],sum));
        }

        System.out.println("");

       // for (int i = 0; i < n; i++)
        //    System.out.println(turakList.get(i));


        sort(turakList);

    }

    public static void sort(List<Turak> lista) {
        int max = -1;
        List<Turak> turakList = new ArrayList<>();

        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).getHossz() > max)
                max = lista.get(i).getHossz();

        for (int i = 0; i < lista.size(); i++)
            if (lista.get(i).getHossz() == max)
                turakList.add(lista.get(i));



        for (int i = 0; i < turakList.size() - 1; i++) {
            for (int j = i + 1; j < turakList.size(); j++) {
                if (turakList.get(i).getHossz() == turakList.get(j).getHossz()) {
                    if (turakList.get(i).getDatum().after(turakList.get(j).getDatum()))
                        Collections.swap(turakList, i, j);
                }
            }
        }
        for (int i = 0; i < turakList.size() - 1; i++) {
            for (int j = i + 1; j < turakList.size(); j++) {
                if (turakList.get(i).getDatum().equals(turakList.get(j).getDatum())) {
                    if (turakList.get(i).getNev().compareTo(turakList.get(j).getNev()) < 0)
                        Collections.swap(turakList, i, j);
                }
            }
        }
        for (int i = 0; i < turakList.size(); i++)
            System.out.println(turakList.get(i));
    }
}