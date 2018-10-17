package iskola;

/*
6
Furius baco;Polynesia;140;120
Shambhala;China;140;120
Dragon Khan;China;140;80
Stampida;Far West;120;20
Tami Tami;SeasamoAventura;100;20
El Diablo;Mexico;140;30
 */



import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String beolvas = scanner.nextLine();

        int n = Integer.parseInt(beolvas);

        List<Hullamvasut> hullamvasutak = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            beolvas = scanner.nextLine();
            String[] szetValaszt = beolvas.split(";");
            hullamvasutak.add(new Hullamvasut(szetValaszt[0], szetValaszt[1], Integer.parseInt(szetValaszt[2]), Integer.parseInt(szetValaszt[3])));
        }

        rendezVarIdo(hullamvasutak);

    }

    public static void rendezVarIdo(List<Hullamvasut> hullamvasutak) {

        for (int i = 0; i < hullamvasutak.size()-1; i++) {
            for (int j = i + 1; j < hullamvasutak.size(); j++) {
                if (hullamvasutak.get(i).getVarakozasiIdo() > hullamvasutak.get(j).getVarakozasiIdo())
                    Collections.swap(hullamvasutak, i, j);
            }
        }

       // for (int i = 0; i < hullamvasutak.size(); i++)
         //   System.out.println(hullamvasutak.get(i));

        System.out.println("");

        for (int i = 0; i < hullamvasutak.size()-1; i++) {
            for (int j = i + 1; j < hullamvasutak.size(); j++) {
                if (hullamvasutak.get(i).getVarakozasiIdo() == hullamvasutak.get(j).getVarakozasiIdo()) {
                    if (hullamvasutak.get(i).getLegkisebbMagassag() < hullamvasutak.get(j).getLegkisebbMagassag())
                        Collections.swap(hullamvasutak, i, j);
                }
            }
        }

      //  for (int i = 0; i < hullamvasutak.size(); i++)
            //System.out.println(hullamvasutak.get(i));

      //  System.out.println("");

        for (int i = 0; i < hullamvasutak.size()-1; i++) {
            for (int j = i + 1; j < hullamvasutak.size(); j++) {
                if (hullamvasutak.get(i).getLegkisebbMagassag() == hullamvasutak.get(j).getLegkisebbMagassag()
                        && hullamvasutak.get(i).getVarakozasiIdo() == hullamvasutak.get(j).getVarakozasiIdo()) {
                    if (hullamvasutak.get(i).getVilagNeve().compareTo(hullamvasutak.get(j).getVilagNeve()) < 0)
                        Collections.swap(hullamvasutak, i, j);
                }
            }
        }
        for (int i = 0; i < hullamvasutak.size(); i++)
            System.out.println(hullamvasutak.get(i));
    }
}

