package hazifeladat;

import java.util.ArrayList;
import java.util.List;

public class Meresek {
    private char[] meres;

    public Meresek(char[] meres) {
        this.meres = meres;
    }

    public char[] getMeres() {
        return meres;
    }

    public List<Integer> pozicioSzamolas(){

        List<Integer> pozLista = new ArrayList<>();

        for (int i = 0; i < this.meres.length; i++)
            if (this.meres[i] == 'O')
                pozLista.add(i);

            return pozLista;
    }
}
