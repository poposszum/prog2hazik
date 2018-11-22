package hazifeladat;

public class MolekulaDarab implements Comparable<MolekulaDarab> {
    private String elemNev;
    private int elemDarab;

    public MolekulaDarab(String elemNev) {
        this.elemNev = elemNev;
    }

    public String getElemNev() {
        return elemNev;
    }

    public void setElemDarab(int elemDarab) {
        this.elemDarab = elemDarab;
    }

    public void setElemNev(String elemNev) {
        this.elemNev = elemNev;
    }

    public int getElemDarab() {
        return elemDarab;
    }

    public void elemPlusPlus() {
        this.elemDarab++;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof MolekulaDarab))
            return false;
        else {
            return this.elemNev.equals(((MolekulaDarab) obj).getElemNev());
        }
    }

    @Override
    public String toString() {
        return this.elemNev + " : " + this.elemDarab + " db";
    }

    @Override
    public int compareTo(MolekulaDarab o) {
        if (this.elemDarab == o.getElemDarab())
            return this.elemNev.compareTo(o.getElemNev());
        else{
            return (-1) * Integer.compare(this.elemDarab, o.getElemDarab());
        }
    }
}
