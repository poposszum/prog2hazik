package hazifeladat;

import java.util.ArrayList;
import java.util.List;

public class Tura implements Comparable<Tura> {
    private String turazoNeve;
    private List<String> turakLista;

    public Tura(String turazoNeve) {
        this.turazoNeve = turazoNeve;
        this.turakLista = new ArrayList<>();
    }

    public String getTurazoNeve() {
        return turazoNeve;
    }

    public List<String> getTurakLista() {
        return turakLista;
    }

    public void addTurakLista(String turaNeve) {
        this.turakLista.add(turaNeve);
    }

    public boolean turazoOK(){
        int db = 0;

        if (this.turakLista.size() == 2)
            return true;

        for (int i = 0; i < this.turakLista.size()-1; i++){
            for (int j = i+1; j < this.turakLista.size(); j++){
                if (this.turakLista.get(i).equals(this.turakLista.get(j)))
                    db++;
            }
        }
        return db >= (this.turakLista.size()/2)-1;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Tura))
            return false;

        return this.turazoNeve.equals(((Tura) obj).getTurazoNeve());
    }

    @Override
    public int compareTo(Tura o) {
        return this.turazoNeve.compareTo(o.getTurazoNeve());
    }
}
