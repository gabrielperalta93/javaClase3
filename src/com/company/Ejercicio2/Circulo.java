package com.company.Ejercicio2;

public class Circulo extends FiguraGeometrica{
    private int radio;

    public Circulo(){

    }

    public Circulo(int radio){
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI*(this.radio * this.radio);
    }
}
