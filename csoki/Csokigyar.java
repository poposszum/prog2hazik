package csoki;

import java.lang.invoke.CallSite;

public class Csokigyar implements Etelgyar, Comparable<Csokigyar> {
    private String csokiFajta;
    private String[] felhasznaltAlapanyagok;
    private int kakaotartalom;

    public Csokigyar(String csokiFajta, int kakaotartalom, int tombLength) {
        this.csokiFajta = csokiFajta;
        this.kakaotartalom = kakaotartalom;
        this.felhasznaltAlapanyagok = new String[tombLength];
    }

    public String getCsokiFajta() {
        return csokiFajta;
    }

    public void setCsokiFajta(String csokiFajta) {
        this.csokiFajta = csokiFajta;
    }

    public String[] getFelhasznaltAlapanyagok() {
        return felhasznaltAlapanyagok;
    }

    public void setFelhasznaltAlapanyagok(String[] felhasznaltAlapanyagok) {
        this.felhasznaltAlapanyagok = felhasznaltAlapanyagok;
    }

    public int getKakaotartalom() {
        return kakaotartalom;
    }

    public void setKakaotartalom(int kakaotartalom) {
        this.kakaotartalom = kakaotartalom;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(this.csokiFajta + ";" + this.kakaotartalom + ";");
        for (int i = 0; i < this.felhasznaltAlapanyagok.length; i++)
            stringBuilder.append(this.felhasznaltAlapanyagok[i] + " ");

        stringBuilder.append("\n");

        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Csokigyar))
            return false;

        return this.csokiFajta.equals(((Csokigyar) obj).getCsokiFajta()) && this.kakaotartalom == ((Csokigyar) obj).getKakaotartalom();
    }

    @Override
    public String[] mibolKeszult() {
        return this.felhasznaltAlapanyagok;
    }

    @Override
    public boolean megfeleloMinoseg() throws SilanyMinosegExeption {
        if (this.kakaotartalom > 50)
            return true;

        if (this.kakaotartalom < 50 && this.kakaotartalom > 0)
            return false;
        else
            throw new SilanyMinosegExeption("Nem igazi csoki!");
    }

    @Override
    public int compareTo(Csokigyar o) {
        if (this.kakaotartalom == o.getKakaotartalom()){
            if (this.felhasznaltAlapanyagok.length == o.getFelhasznaltAlapanyagok().length){
                return this.csokiFajta.compareTo(o.getCsokiFajta());
            }
            else return Integer.compare(this.felhasznaltAlapanyagok.length, o.getFelhasznaltAlapanyagok().length);
        } else
            return Integer.compare(this.kakaotartalom, o.getKakaotartalom());
    }
}
