package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Ital ital1 = new Ital("jager", "2db");
        Ital ital2 = new Ital("jager", "1db");
        if (ital1.equals(ital2) == true)
            System.out.println("A két ital egyenlő.");
                else System.out.println("A két ital nem egyenlő.");
        System.out.println("Az ital ára euróban: " + ital1.getArEuroban() + "€");
    }
}
