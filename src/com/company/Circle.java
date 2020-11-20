package com.company;

import java.lang.Math;

public class Circle {

    private double radius;
    private double diameter;

    public Circle() {}

    public Circle(double radius) {
        this.radius = radius;
        if (this.radius < 0)
            this.radius = 0;
        this.diameter = 2.0 * this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
        if (this.radius < 0)
            this.radius = 0;
        this.diameter = 2.0 * this.radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
        if (this.diameter < 0)
            this.diameter = 0;
        this.radius = this.diameter / 2.0;
    }

    public double getDiameter() {
        return this.diameter;
    }

    public double getCircumference() {
        return Math.PI * this.diameter;
    }

    public double getSquare() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    @Override
    public String toString() {
        return "This is a circle of radius " + this.radius + ", diameter " + this.diameter + ". It's circumference is "
                + this.getCircumference() + " and it's square is " + this.getSquare() + "!";
    }
}