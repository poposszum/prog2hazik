package hazifeladat;

public class Bankkartya {
    private char[] bankkartyaszam;

    public Bankkartya(char[] bankkartyaszam) {
        this.bankkartyaszam = bankkartyaszam;
    }

    public boolean ellenoriz(){
        int[] tmp = new  int[this.bankkartyaszam.length];
        int j = 0;
        int summa = 0;

        for (int i = 0; i < this.bankkartyaszam.length; i++) {
            if (i % 2 == 0) {
                tmp[j] = Character.getNumericValue(this.bankkartyaszam[i]) * 2;
                j++;
            }
            else {
                tmp[j] = Character.getNumericValue(this.bankkartyaszam[i]);
                j++;
            }
        }

        for (int i = 0; i < tmp.length; i++) {
            if (i % 2 == 0)
                summa += sum(tmp[i]);
            else summa += tmp[i];
        }

        if (summa % 10 == 0)
            return true;
                else return false;
    }

    public int sum(int number){
      int sum = 0;

        while (number != 0){
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
