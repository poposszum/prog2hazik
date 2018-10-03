package com.company;

public class Rectangle extends GeometricShape {
    private double width;
    private double height;

    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }
    
    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public Rectangle(String color, boolean filled, double height, double width) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * width + 2 * height;
    }
}
