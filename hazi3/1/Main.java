package iskola;

public class Main {

    public static void main(String[] args) {
        Katona katona1 = new Katona(2,5);
        Katona katona2 = new Katona(4,5);

        Nyilas nyilas1 = new Nyilas(5,5,10);
        Nyilas nyilas2 = new Nyilas(5,5,15);



        megkuzd(nyilas1,nyilas2);
    }

    public static Katona megkuzd(Katona katona1, Katona katona2){
        System.out.println(katona1 + " VS " + katona2);

        if (katona1.getTamado() >= katona2.getVedo()) {
            System.out.println("Nyert: " + katona1);
            return katona1;
        }

            else {
            System.out.println("Nyert: " + katona2);
            return katona2;
        }
    }
}
