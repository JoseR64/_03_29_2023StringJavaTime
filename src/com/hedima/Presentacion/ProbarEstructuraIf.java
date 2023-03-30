package com.hedima.Presentacion;

public class ProbarEstructuraIf {
    public static void main(String[] args) {
        // En base de una variable decir si es mayor o menor de 18
        int edad = 18;
        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
        //Declarar una variable y decir si es un numero positivo o negativo
        //Declarar una variable y decir si es un numero par o impar

        int numero = 0;
        if (numero >= 0) {
            System.out.println("Numero positivo");
        } else {
            System.out.println("Numero negativo");
        }
        if (numero % 2 == 0) {
            System.out.println("Numero par");
        } else {
            System.out.println("Numero impar");
        }




    }
}
