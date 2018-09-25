package com.company;

public class Main {

    public static void main(String[] args) {
	    RegularPolygon sokszog1 = new RegularPolygon();
	    RegularPolygon sokszog2 = new RegularPolygon(6,4);
	    RegularPolygon sokszog3 = new RegularPolygon(10, 4, 5.6, 7.8);

        System.out.println("A sokszög területe: " + sokszog1.getArea() + " ,kerülete: " + sokszog1.getPerimeter() + ".");
        System.out.println(sokszog1.toString());

        System.out.println("A sokszög területe: " + sokszog2.getArea() + " ,és kerülete: " + sokszog2.getPerimeter() + ".");
        System.out.println(sokszog2.toString());

        System.out.println("A sokszög területe: " + sokszog3.getArea() + " ,és kerülete: " + sokszog3.getPerimeter() + ".");
        System.out.println(sokszog3.toString());
    }
}
