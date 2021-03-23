package com.company.Ejercicio2;

public class ClaseUtilitaria {
    public ClaseUtilitaria(){

    }

    public static double areaPromedio(FiguraGeometrica arr[]){
        for (int i = 0; i < arr.length; i++){
            System.out.println("El area de la figura es: " + arr[i].area());
        }
        return 0;
    }
}
