package zh;

import java.util.Random;

public class Hallgato {
    int mennyitKeszult;
    boolean sokatTanul;

    public Hallgato(int mennyitKeszult, boolean sokatTanul) {
        if (mennyitKeszult < 0) this.mennyitKeszult = 0;
            else if (mennyitKeszult > 5) this.mennyitKeszult = 5;
                else this.mennyitKeszult = mennyitKeszult;
        this.sokatTanul = sokatTanul;
    }

    @Override
    public String toString() {
        return this.mennyitKeszult + " " + this.sokatTanul;
    }

    public Dolgozat dolgozatotIr(){
        if (this.sokatTanul){
            Random random = new Random();
            int nmb = random.nextInt(4) + 4;

            Dolgozat dolgozat = new Dolgozat(nmb *= this.mennyitKeszult);

            return dolgozat;
        }
            else{
                Random random = new Random();
                int nmb = random.nextInt(5);

                Dolgozat dolgozat = new Dolgozat(nmb *= this.mennyitKeszult);

                return dolgozat;
        }
    }
}
