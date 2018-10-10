package com.company;

public class Main {

    public static void main(String[] args) {
        int[] tomb = new int[5];

        tomb[0] = 2;
        tomb[1] = 1;
        tomb[2] = 1;
        tomb[3] = 1;
        tomb[4] = 1;

        System.out.println(isConsecutiveFour(tomb));

    }

    public static boolean isConsecutiveFour(int[] values){
        int db = 0;
        if (values.length < 4) return  false;
            else
                for (int i = 0; i < values.length - 3; i++) {
                    db = 0;
                    for (int j = i + 1; j <= i + 3; j++) {
                        if (values[i] == values[j])
                            db++;
                    }
                    if (db == 3) break;
                }
        if (db >= 3) return true;
            else return false;
    }
}
