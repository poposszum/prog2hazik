package iskola;

import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String inputLine = scanner.nextLine();
        String[] splitN = inputLine.split(";");



        int n = Integer.parseInt(splitN[0]);

        Tornasor[] tornasor = new Tornasor[n];

        tornasor[0] = new Tornasor(splitN[1],"");
        String xSzemely = splitN[2];

        for (int i = 1; i < n; i++) {
            inputLine = scanner.nextLine();
            splitN = inputLine.split(";");
            tornasor[i] = new Tornasor(splitN[0],splitN[1]);
        }

        rendez(tornasor);

        szamol(tornasor, xSzemely);

    }

    public static void rendez(Tornasor[]  tornasor){
        for (int i = 0; i < tornasor.length - 1; i++) {
            for (int j = i + 1; j < tornasor.length; j++) {
                if (tornasor[j].getKiutan().equals(tornasor[i].getNev()) && j > i + 1) {
                    Tornasor tmp = tornasor[i + 1];
                    tornasor[i + 1] = tornasor[j];
                    tornasor[j] = tmp;
                }
            }
        }
    }

    public static void szamol(Tornasor[] tornasor, String xSzemely){
        int i = 0;
        int piros = 0;
        int kek = 0;

        while (!tornasor[i].getNev().equals(xSzemely)){
            if (i % 2 == 0) piros++;
            else kek++;

            i++;
        }
        System.out.println("Piros: " + piros + " Kék: " + kek);
    }
}
