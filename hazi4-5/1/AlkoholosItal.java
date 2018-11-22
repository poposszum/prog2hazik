package hazifeladat;

public abstract class AlkoholosItal extends Ital implements Alkoholos{
    private String iz;
    private double alkoholTartalom;

    public AlkoholosItal(String iz, double alkoholTartalom) {
        this.iz = iz;
        this.alkoholTartalom = alkoholTartalom;
    }

    @Override
    public String mibolKeszult() {
        return null;
    }

    public String milyenIzu() {
        return iz;
    }

    public abstract double mennyiAlkoholtTartalmaz();
}