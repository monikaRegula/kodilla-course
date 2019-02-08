package com.kodilla.testing.shape;

public class Square implements Shape {

    private double a;

    public Square(double a) {
        this.a = a;
    }

    public double getA() { return a; }

    @Override
    public void getShape() {
        System.out.println("I am square.");
    }

    @Override
    public double getField( ) {
        return Math.pow(a,2) ;
    }
}
