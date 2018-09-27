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
        return this.width * this.height;
    }

    public double getPerimeter(){
        return 2 * (this.width + this.height);
    }

    @Override
    public String toString() {
        return "Szélesség: " + this.width + " magasság: " + this.height + " terület: " + getArea() + " kerület: " + getPerimeter() + ".";
    }
}
