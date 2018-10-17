package iskola;

public class Landzsas extends Katona {

    public Landzsas(int tamado, int vedo) {
        super(tamado, vedo);
    }

    @Override
    public String toString() {
        return "Nyilas: TE: " + this.getTamado() + " VE: " + this.getVedo();
    }
}
