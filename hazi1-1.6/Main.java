package com.company;

import javax.sound.sampled.Line;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        LinearEquation egyr1 = new LinearEquation(1,2,3,4,5,6);
        LinearEquation egyr2 = new LinearEquation(12,5,6,11,6,2);
        LinearEquation egyr3 = new LinearEquation(2,5,8,2,12,7);

        List<LinearEquation> list = new ArrayList<>();
        list.add(egyr1);
        list.add(egyr2);
        list.add(egyr3);
        list.forEach(x->{
            if (x.isSolvable() == true) System.out.println("The equation has no solution.");
                else System.out.println("Az x: " + x.getX() + " az Y: " + x.getY());
        });
    }
}
