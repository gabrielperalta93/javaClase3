package com.company;

import com.company.Ejercicio1.PasswordFuerte;
import com.company.Ejercicio1.PasswordIntermedia;
import com.company.Ejercicio1.PasswordSimple;
import com.company.Ejercicio2.*;

public class Main {

    public static void main(String[] args) throws Exception {
        //Ejercicio 1
        PasswordFuerte passwordFuerte = new PasswordFuerte();
        System.out.println("Contraseña Fuerte");
        passwordFuerte.setValue("HolaMundo2%");

        System.out.println("Contraseña Intermedia");
        PasswordIntermedia passwordIntermedia = new PasswordIntermedia();
        passwordIntermedia.setValue("Holamundo2");

        System.out.println("Contraseña Simple");
        PasswordSimple passwordSimple = new PasswordSimple();
        passwordSimple.setValue("Holamund");

        //Ejercicio 2
        FiguraGeometrica circulo = new Circulo(23);

        FiguraGeometrica rectangulo = new Rectangulo(10,20);

        FiguraGeometrica triangulo = new Triangulo(10,20);

        FiguraGeometrica[] listaFiguras = new FiguraGeometrica[3];
        listaFiguras[0] = circulo;
        listaFiguras[1] = rectangulo;
        listaFiguras[2] = triangulo;
        ClaseUtilitaria claseUtilitaria = new ClaseUtilitaria();

        claseUtilitaria.areaPromedio(listaFiguras);

    }
}
