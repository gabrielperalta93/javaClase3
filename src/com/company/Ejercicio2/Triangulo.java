package com.company.Ejercicio2;

public class Triangulo extends FiguraGeometrica{
    private int base;
    private int altura;

    public Triangulo(){

    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public Triangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return (this.base * this.altura) / 2;
    }
}
