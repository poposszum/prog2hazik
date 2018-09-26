package com.company;

public class QuadraticEquation {
    private int a;
    private int b;
    private int c;

    public QuadraticEquation(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA(){
        return a;
    }

    public int getb(){
        return b;
    }

    public int getC(){
        return c;
    }

    public int getDiscriminant(){
        return (int) (Math.pow(b,2) - 4 * a * c);
    }

    public double getRoot1(){
        if (getDiscriminant() < 0)
                return 0;
            else    return ((-b + Math.sqrt(getDiscriminant())) / (2 * a));

    }

    public double getRoot2(){
        if (getDiscriminant() < 0)
                return  0;
            else return ((-b - Math.sqrt(getDiscriminant())) / (2 * a));
    }

    @Override
    public String toString() {
        return "A függvény két gyöke a: " + getRoot1() + " és a: " + getRoot2();
    }
}
