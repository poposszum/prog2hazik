package iskola;

public class Nyilas extends Katona {
    private int lotav;


    public Nyilas(int tamado, int vedo, int lotav) {
        super(tamado, vedo);
        this.lotav = lotav;
    }

    public void setLotav(int lotav) {
        this.lotav = lotav;
    }

    public int getLotav() {
        return lotav;
    }

    public int getTamadoNyilas(){
        return this.getTamado() + this.lotav;
    }

    @Override
    public String toString() {
        return "Nyilas: TE: " + this.getTamado() + " VE: " + this.getVedo();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null ||  obj.getClass() != getClass()) return false;

        return this.getVedo() == ((Nyilas) obj).getVedo() && this.getTamadoNyilas() == ((Nyilas) obj).getTamadoNyilas()
                && this.lotav == ((Nyilas) obj).lotav;
    }
}
