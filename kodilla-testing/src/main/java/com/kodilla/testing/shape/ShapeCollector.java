package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {

    private ArrayList<Shape> figures = new ArrayList<>();


    public void addShape(Shape shape){ figures.add(shape); }

    public int getQuantity(){
        return figures.size();
    }

    public void removeShape(Shape shape){
        figures.remove(shape);
    }

    public Shape getFigure(int n){
        return figures.get(n);
    }

    public void showFigures(){
        for (Shape s:figures){
            System.out.println(s);
        }
    }
}
