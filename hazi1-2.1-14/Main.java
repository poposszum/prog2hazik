package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //eljaras1(5, 6, 3);
        //eljaras2(5,2,5);
        //eljaras3(1,2,3,4);
        //eljaras8(100);
        //eljaraskilencesfel(15);
        //System.out.println(eljaras10(16213));
        //System.out.println(eljaras11(5));
        //eljaras12(2,1,10);
        //System.out.println(eljaras13(5));
        eljaras14();
    }


    //1. Írjunk eljárást, amely paraméterként kap három egész számot. Írjuk ki őket
    //növekvő sorrendben!

    public static void eljaras1(int a, int b, int c) {
        int[] array = new int[3];

        array[0] = a;
        array[1] = b;
        array[2] = c;

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++)
            System.out.println(array[i]);
    }

    //2. Írjunk eljárást, amely paraméterként kap három valós számot. Határozzuk meg és
    //írjuk ki a három adott valós szám minimumát és abszolút értékeinek maximumát!

    public static void eljaras2(double a, double b, double c){
        if (Math.min(a,b) < Math.min(a,c)) System.out.println("A három szám közül a legkisebb: " + Math.min(a,b));
                else System.out.println("A három szám közül a legkisebb: " + Math.min(a,c));

        if (Math.abs(Math.max(a,b)) < Math.abs(Math.max(a,c))) System.out.println("A három szám abszolút értéke közül a legnagyobb: " + Math.abs(Math.max(a,b)));
                else System.out.println("A három szám abszolút értéke közül a legnagyobb: " + Math.abs(Math.max(a,c)));
    }

    //3. Írjunk eljárást, amely paraméterként kap négy valós számot: a, b, c, d. Írjuk ki a
    //négy számot az adott sorrendben majd, ha d  0, az a, c, b, d sorrendben,
    //egyébként az a, b, d, c sorrendben!

    public static void eljaras3(double a, double b, double c, double d){
        System.out.println(a + " " + b + " " + c + " " + d);

        if (d >= 0)    System.out.println(a + " " + c + " " + b + " " + d);
                else    System.out.println(a + " " + b + " " + d + " " + c);
   }

   //4. Adott három szigorúan pozitív valós szám: a, b, c. Írjunk függvényt, amely
    //paraméterként megkapja ezeket a számokat és eldönti, hogy képezhetik-e ezek a
    //számok egy háromszög oldalait (legyen a függvénynek visszatérítési értéke:
    //boolean típusú).

   public static boolean eljaras4(double a, double b, double c){
        if (a + b < c && a + c < b && b + c < a) return true;
            else return false;
   }

   //5. Írjunk függvényt, amely visszaadja, hogy hány szökőév volt/lesz két különböző
    //évszám között!

   public static int eljaras5(int a, int b){
        int db = 0;

        for (int i = a+1; i < b; i++)
            if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0)) db++;

            return db;
   }

   //6. Írjunk eljárást, amely paraméterként megkap egy dolgozatra adott jegyet, és kiírja
    //a dolgozat szöveges értékelését az érdemjegy alapján (Használjunk switch
    //szerkezetet)!

   public static void eljaras6(int a){

        switch (a){
            case 1 :
                System.out.println("Elégtelen");
            case 2 :
                System.out.println("Elégséges");
            case 3 :
                System.out.println("Közepes");
            case 4 :
                System.out.println("Jó");
            case 5 :
                System.out.println("Jeles");
            default :
                System.out.println("Ilyen érdemjegy nem létezik");
        }
   }

   //7. Számítsuk ki két természetes szám egész hányadosát ismételt kivonásokkal!

   public static double eljaras7(double a, double b){
        int hanyados = 0;
            while (a >= b){
                hanyados++;
                a = a - b;
            }
            return hanyados;
   }

    //8. Adva van egy nullától különböző természetes szám (n). Tervezzünk
    //algoritmust, amely eldönti, hogy az adott szám prímszám-e vagy sem!

   public static void eljaras8(int n){
        boolean[] array = new boolean[n+1];
        array[0] = array[1] = false;

        for (int i = 2; i <= n; i++)
            array[i] = true;

        for (int i = 2; i * i <= n; i++){
            if (array[i]) {
                for (int j = i * i; j <= n; j += i)
                    array[j] = false;
            }
        }

        for (int i = 0; i <= n; i++)
            if (array[i])
                System.out.println(i);
   }

   //9. Generáljuk és írjuk ki az első n Fibonacci-számot!

    public static int eljaras9(int n){
        if (n == 0) return 0;
            else if (n == 1) return 1;
                else return eljaras9(n - 1) + eljaras9(n - 2);
    }

    //9-es feladat nem rekurzívan

    public static void eljaraskilencesfel(int n){
        int f1 = 0, f2 = 1;

        if (n < 1) return;

            for (int i = 1; i <= n; i++){
                System.out.println(f2);
                int f3 = f1 + f2;
                    f1 = f2;
                    f2 = f3;
            }
    }

    //10. Adott az n természetes szám, amelynek legfeljebb 9 számjegye van.
    //Hozzuk létre és írjuk ki azt a számot, amely az eredeti szám számjegyeit
    //fordított sorrendben tartalmazza.

    public static int eljaras10(int szam){
        int tukorkep = 1;

        while (szam != 0){
            tukorkep = tukorkep * 10 + szam % 10;
            szam/= 10;
        }

        return tukorkep;
    }

    //11. Írjunk függvényt, amely paraméterként kap egy 0 és 12 közötti egész számot és
    //visszaadja annak faktoriálisát!

    public static int eljaras11(int n){

        if (n <= 1) return 1;
            else return n * eljaras11(n - 1);
    }

    //12. Írjunk eljárást, amely megtalálja és kiírja az összes k-val osztható számot, amelyek
    //két adott szám (n1 és n2 …ezeket az eljárás paraméterei) között találhatók!

    public static void eljaras12(int k, int n1, int n2){
        for (int i = n1; i <= n2; i++)
            if (i % k == 0) System.out.println(i);
    }

    //13. Írjunk függvényt, amely megkeresi azt a legkisebb Fibonacci-számot, amely
    //nagyobb mint egy adott n szám (az n számot paraméterként adjuk át, az eredményt
    //visszatérítési értékként)!

    public static int eljaras13(int n){
        int t = 1;
        while (eljaras9(t) - 1 < n)
                t++;
            return eljaras9(t);
    }

    //14. Írjunk eljárást, amely megkeresi azokat az 1000-nél kisebb számokat, amelyek
    //egyenlők számjegyeik köbének összegével! Ezeket írjuk a standard kimenetre.

    public static void eljaras14(){
        double equ = 0;
        for (int i = 1; i < 1000; i++){
            int mem = i;
                equ = 0;
                while (mem != 0) {
                    equ += Math.pow(mem % 10, 3);
                    mem /= 10;
                }
                if (equ == i) System.out.println(equ);
        }
    }

}
