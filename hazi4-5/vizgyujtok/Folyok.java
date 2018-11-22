package hazifeladat;

public class Folyok {
    private String mi;
    private String mibe;

    public Folyok(String mi, String mibe) {
        this.mi = mi;
        this.mibe = mibe;
    }

    public String getMi() {
        return mi;
    }

    public String getMibe() {
        return mibe;
    }

    @Override
    public String toString() {
        return this.mi + " --> " + this.mibe;
    }
}
