package hazifeladat;

import java.util.ArrayList;
import java.util.List;

public class Molekula {
    private String vegyuletNev;
    private String vegyulet;
    private List<MolekulaDarab> mennyi = new ArrayList<>();

    public Molekula(String vegyuletNev, String vegyulet) {
        this.vegyuletNev = vegyuletNev;
        this.vegyulet = vegyulet;
    }

    public String getVegyuletNev() {
        return vegyuletNev;
    }

    public String getVegyulet() {
        return vegyulet;
    }

    public void setVegyuletNev(String vegyuletNev) {
        this.vegyuletNev = vegyuletNev;
    }

    public void setVegyulet(String vegyulet) {
        this.vegyulet = vegyulet;
    }

    public List<MolekulaDarab> getMennyi() {
        return mennyi;
    }

    public void setMennyi(List<MolekulaDarab> mennyi) {
        this.mennyi = mennyi;
    }

    @Override
    public String toString() {
        return this.vegyuletNev + " : " + this.mennyi;
    }

    public void szamolMolekula() {

        String[] split = this.vegyulet.split(",");

        for (int i = 0; i < split.length; i++) {

            MolekulaDarab tmp = new MolekulaDarab(split[i]);

            if (this.mennyi.contains(tmp)) {
                this.mennyi.get(this.mennyi.indexOf(tmp)).elemPlusPlus();
            } else {
                this.mennyi.add(tmp);
                this.mennyi.get(this.mennyi.indexOf(tmp)).setElemDarab(1);
            }
        }
    }
}
