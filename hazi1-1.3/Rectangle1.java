package com.company;

public class Rectangle1 {
    public double width;
    public double height;

    public Rectangle1(){
        this.width = 1;
        this.height = 1;
    }

    public Rectangle1(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    @Override
    public String toString() {
        return "Szélesség: " + width + " magasság: " + height + " terület: " + getArea() + " kerület: " + getPerimeter() + ".";
    }
}
