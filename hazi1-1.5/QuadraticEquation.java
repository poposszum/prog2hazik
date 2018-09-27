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
        return (int) (Math.pow(this.b,2) - 4 * this.a * this.c);
    }

    public double getRoot1(){
        if (getDiscriminant() < 0)
                return 0;
            else    return ((-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a));

    }

    public double getRoot2(){
        if (getDiscriminant() < 0)
                return  0;
            else return ((-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    @Override
    public String toString() {
        return "A függvény két gyöke a: " + getRoot1() + " és a: " + getRoot2();
    }
}
