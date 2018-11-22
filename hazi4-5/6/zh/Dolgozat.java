package zh;

import egyetem.Pontozhato;

public class Dolgozat implements Pontozhato {
    private int pontszam;

    public Dolgozat(int pontszam) {
        this.pontszam = pontszam;
    }

    public int getPontszam() {
        return pontszam;
    }

    public void setPontszam(int pontszam) {
        this.pontszam = pontszam;
    }

    @Override
    public String toString() {
        return "Pontszám: " + this.pontszam;
    }


    @Override
    public boolean megfelelt() {
        if (this.pontszam == -1){
            System.out.println("nem irt");
            return false;
        }
        return true;
    }
}
