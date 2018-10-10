package iskola;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nap:");
        String nap = scanner.next();
        System.out.println("Hány órás az órarend: ");
        int hanyora = scanner.nextInt();

        Orarend orarend1 = new Orarend(nap);

        Ora[] orak = new Ora[hanyora];

        for (int i = 0; i < hanyora; i++){
            System.out.println("Óra kód: ");
            int oraKod = scanner.nextInt();
            System.out.println("Óra neve: ");
            String oraNev = scanner.next();
            System.out.println("Kezdő időpont: ");
            int kezdoIdopont = scanner.nextInt();
            orak[i] = new Ora(oraKod,oraNev,kezdoIdopont);
        }

        for (int i = 0; i < orak.length; i++)
            System.out.println(orarend1.oratHozzaad(orak[i]));

        System.out.println(orarend1);

      /*Orarend orarend = new Orarend("hetfo");
      Ora[] ora = new Ora[1];

      ora[0] = new Ora(12,"Matek",15);
        orarend.setOrak(ora);
        orarend.setOrakSzama(orarend.getOrak());
        System.out.println(orarend); */



    }
}
