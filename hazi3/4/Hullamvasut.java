package iskola;

public class Hullamvasut {
    private String hullamvasutNeve;
    private String vilagNeve;
    private int legkisebbMagassag;
    private int varakozasiIdo;

    public Hullamvasut(String hullamvasutNeve, String vilagNeve, int legkisebbMagassag, int varakozasiIdo) {
        this.hullamvasutNeve = hullamvasutNeve;
        this.vilagNeve = vilagNeve;
        this.legkisebbMagassag = legkisebbMagassag;
        this.varakozasiIdo = varakozasiIdo;
    }

    public Hullamvasut() {
    }

    public String getHullamvasutNeve() {
        return hullamvasutNeve;
    }

    public String getVilagNeve() {
        return vilagNeve;
    }

    public int getLegkisebbMagassag() {
        return legkisebbMagassag;
    }

    public int getVarakozasiIdo() {
        return varakozasiIdo;
    }

    public void setHullamvasutNeve(String hullamvasutNeve) {
        this.hullamvasutNeve = hullamvasutNeve;
    }

    public void setVilagNeve(String vilagNeve) {
        this.vilagNeve = vilagNeve;
    }

    public void setLegkisebbMagassag(int legkisebbMagassag) {
        this.legkisebbMagassag = legkisebbMagassag;
    }

    public void setVarakozasiIdo(int varakozasiIdo) {
        this.varakozasiIdo = varakozasiIdo;
    }

    @Override
    public String toString() {
        return this.hullamvasutNeve + " (" + this.vilagNeve + "): " + this.varakozasiIdo;
    }
}
