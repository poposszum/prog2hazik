package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Teherauto[] tomb = new Teherauto[3];
        Auto[] tomb2 = new Auto[3];

        tomb[0] = new Teherauto("1234",123,500);
        tomb[1] = new Teherauto("4321",123,200);
        tomb[2] = new Teherauto("11123",123,400);

        tomb2[0] = new Auto("12345",50);
        tomb2[1] = new Auto("5431",100);
        tomb2[2] = new Auto("12345",150);

        for (int i = 0; i < Array.getLength(tomb); i++)
            System.out.println(tomb[i].toString());

        rendezMaxSzallithatoTeherCsokkenoleg(tomb);
        System.out.println("rendezve:");

        for (int i = 0; i < Array.getLength(tomb); i++)
            System.out.println(tomb[i].toString());

        System.out.println(keresMaxMotorTeljesitmeny(tomb2));

    }

    public static void rendezMaxSzallithatoTeherCsokkenoleg(Teherauto[] teher){
        Teherauto[] t = new Teherauto[1];

        for (int i = Array.getLength(teher); i > 0; i--){
            for (int j = 0; j < i-1; j++){
                if (teher[j].getMaxSzallithatoTeher() > teher[j+1].getMaxSzallithatoTeher()) {
                    System.out.println("igen");
                    t[0] = teher[j];
                    teher[j] = teher[j+1];
                    teher[j+1] = t[0];
                }
            }
        }

    }

    public static Auto keresMaxMotorTeljesitmeny(Auto[] auto){
        int max = -1, poz = 0;
        for (int i = 0; i < Array.getLength(auto); i++)
            if (auto[i].getTeljesitmeny() > max) {
                max = auto[i].getTeljesitmeny();
                poz = i;
            }

            return auto[poz];
    }


}
