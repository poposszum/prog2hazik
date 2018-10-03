package com.company;

import java.util.Date;

public class GeometricShape {
    private String color;
    private boolean filled;
    private Date dateCreated;


    public GeometricShape() {
        this.color = "white";
        this.filled = false;
        this.dateCreated = new Date();
    }

    public GeometricShape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public boolean isFilled() {
        return filled;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if (this.filled == true)
                return "Az alábbi mértani alakzat ki van töltve, " + this.color + " színű " + this.getDateCreated() + " dátumon volt elkészítve.";
            else return "Az alábbi mértani alakzat nincs kitöltve, " + this.color + " színű " + this.getDateCreated() + " dátumon volt elkészítve.";
    }
}
