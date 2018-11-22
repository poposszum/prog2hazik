package hazifeladat;

public class Main {

    public static void main(String[] args) {
	SzeszesItal[] szeszesItals = new SzeszesItal[5];

	szeszesItals[0] = new SzeszesItal("sor","3liter",50,3);
	szeszesItals[1] = new SzeszesItal("jeger","1liter",100,50);
	szeszesItals[2] = new SzeszesItal("palinka","2liter",150,25);
	szeszesItals[3] = new SzeszesItal("tatra","3liter",250,31);
	szeszesItals[4] = new SzeszesItal("whisky","5liter",550,62);

        for (int i = 0; i < 3; i++)
            System.out.println(maxSzeszesital(szeszesItals)[i]);

        System.out.println();

        for (int i = 0; i < 5; i++)
            System.out.println(maxSzeszesital(szeszesItals)[i]);

    }

    public static SzeszesItal[] maxSzeszesital(SzeszesItal[] tomb){
        SzeszesItal tmp;

        if (tomb.length < 3) return null;
            else {
            for (int i = 0; i < tomb.length - 1; i++)
                for (int j = i+1; j < tomb.length; j++)
                    if (tomb[i].getAlkoholTartalom() < tomb[j].getAlkoholTartalom()) {
                        tmp = tomb[i];
                        tomb[i] = tomb[j];
                        tomb[j] = tmp;
                    }
        }
            return tomb;
    }
}
