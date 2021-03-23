package com.company.Ejercicio2;

public abstract class FiguraGeometrica {
    private double area;
    public abstract double area();

    @Override
    public String toString(){
        return Double.toString(area);
    }
}
