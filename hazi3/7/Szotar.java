package iskola;

public class Szotar {
    private String magyarSzo;
    private String angolSzo;

    public Szotar(String angolSzo, String magyarSzo) {
        this.angolSzo = angolSzo;
        this.magyarSzo = magyarSzo;
    }

    public String getMagyarSzo() {
        return magyarSzo;
    }

    public String getAngolSzo() {
        return angolSzo;
    }

    public void setMagyarSzo(String magyarSzo) {
        this.magyarSzo = magyarSzo;
    }

    public void setAngolSzo(String angolSzo) {
        this.angolSzo = angolSzo;
    }

    @Override
    public String toString() {
        return this.angolSzo + ":" + this.magyarSzo;
    }
}
