package hazifeladat;

import java.util.ArrayList;
import java.util.List;

public class Meccsek {
    private String kikJatszak;
    private String meccsEredmenyek;
    private List<Csapatok> csapatokList = new ArrayList<>();

    public Meccsek(String kikJatszak, String meccsEredmenyek) {
        this.kikJatszak = kikJatszak;
        this.meccsEredmenyek = meccsEredmenyek;
    }

    public String getKikJatszak() {
        return kikJatszak;
    }

    public void setKikJatszak(String kikJatszak) {
        this.kikJatszak = kikJatszak;
    }

    public String getMeccsEredmenyek() {
        return meccsEredmenyek;
    }

    public void setMeccsEredmenyek(String meccsEredmenyek) {
        this.meccsEredmenyek = meccsEredmenyek;
    }

    public void szamol(){
        char[] tmp;

        tmp = this.meccsEredmenyek.toCharArray();

        for (int i = 0; i < 10; i++) {
            if (Character.getNumericValue(tmp[i]) > Character.getNumericValue(tmp[i+2])){
                Meccsek 
            }










        }
    }
}
