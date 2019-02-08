package com.kodilla.testing.shape;

public class Circle implements Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }


    @Override
    public void getShape() {
        System.out.println("I am circle");
    }

    @Override
    public double getField() {
        return Math.PI* Math.pow(r,2);
    }
}
