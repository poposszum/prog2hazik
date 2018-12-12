package hazifeladat;

import java.util.ArrayList;
import java.util.List;

public class Szallitmany implements Comparable<Szallitmany> {
    private int iranyitoszam;
    private List<String> telepulesNev;
    private List<String> utcaNev;
    private List<String> cimzettNev;
    private List<Integer> hazszam;
    private List<Integer> csomagErtek;

    public Szallitmany(int iranyitoszam) {
        this.iranyitoszam = iranyitoszam;
        this.cimzettNev = new ArrayList<>();
        this.csomagErtek = new ArrayList<>();
        this.hazszam = new ArrayList<>();
        this.telepulesNev = new ArrayList<>();
        this.utcaNev = new ArrayList<>();
    }

    public int getIranyitoszam() {
        return iranyitoszam;
    }

    public void addTelepulesNev(String telepulesNev) {
        this.telepulesNev.add(telepulesNev);
    }

    public void addUtcaNev(String utcaNev) {
        this.utcaNev.add(utcaNev);
    }

    public void addCimzettNev(String cimzettNev) {
        this.cimzettNev.add(cimzettNev);
    }

    public void addHazszam(int hazszam) {
        this.hazszam.add(hazszam);
    }

    public void addCsomagErtek(int csomagErtek) {
        this.csomagErtek.add(csomagErtek);
    }

    public int sumErtek(){
        int sum = 0;

        for (int i = 0; i < this.csomagErtek.size(); i++)
            sum += this.csomagErtek.get(i);

        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.iranyitoszam + ": " + this.sumErtek());

        for (int i = 0; i < this.utcaNev.size(); i++){
            stringBuilder.append("\n");
            stringBuilder.append(this.telepulesNev.get(i) + ", " + this.utcaNev.get(i) + " " + this.hazszam.get(i)
                    + "., " + this.cimzettNev.get(i) + ", " + this.csomagErtek.get(i));
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Szallitmany))
            return false;

        return this.iranyitoszam == ((Szallitmany) obj).getIranyitoszam();
    }


    @Override
    public int compareTo(Szallitmany o) {
        return Integer.compare(this.iranyitoszam, o.getIranyitoszam());
    }
}
