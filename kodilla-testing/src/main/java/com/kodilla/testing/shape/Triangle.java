package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double a;
    private double h;

    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }

    public double getA() { return a; }

    public double getH() { return h; }


    @Override
    public void getShape() {
        System.out.println("I am triangle.");
    }

    @Override
    public double getField() {
        return (a*h)/2;
    }
}
