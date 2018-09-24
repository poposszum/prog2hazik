package com.company;

public class Main {

    public static void main(String[] args) {
        Pont pont1 = new Pont(1,1);
        Pont pont2 = new Pont(2,2);
        Pont pont3 = new Pont(5, 7);
        Pont pont4 = new Pont(3, 4);

        pont1.setY(pont1.getY() + 5);
        pont2.setY(pont2.getY() + 5);
        pont3.setX(pont3.getX() + 3.4);
        pont4.setY(pont4.getY() + 3.4);


       // System.out.println("x koordinata: " + pont1.getX() + System.lineSeparator() + "y koordinata: " + pont1.getY());

    }
}
