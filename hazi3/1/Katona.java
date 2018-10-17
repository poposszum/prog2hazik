package iskola;

public class Katona {
    private int tamado;
    private int vedo;

    public Katona(){
        this.tamado = 5;
        this.vedo = 5;
    }

    public Katona(int tamado, int vedo) {
        this.tamado = tamado;
        this.vedo = vedo;
    }

    public int getTamado() {
        return tamado;
    }

    public int getVedo() {
        return vedo;
    }

    public void setTamado(int tamado) {
        this.tamado = tamado;
    }

    public void setVedo(int vedo) {
        this.vedo = vedo;
    }

    @Override
    public String toString() {
        return "TE: " + this.tamado + " VE" + this.vedo;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null ||  obj.getClass() != getClass()) return false;

        return this.vedo == ((Katona) obj).vedo && this.tamado == ((Katona) obj).tamado;
    }
}
