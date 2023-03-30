package com.hedima.Presentacion;

public class Main {
    public static void main(String[] args) {
        // Metodos de la clase String
        String frase = "La casa verde";
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
        System.out.println("Longitud de la frase="+frase.length());
        System.out.println("("+frase.substring(0,2)+")");
        System.out.println("("+frase.substring(3,7)+")");
        System.out.println("posicion de la s: "+frase.indexOf("s"));
        System.out.println("posicion de la a: "+frase.indexOf("a"));
        System.out.println("posicion de la a: "+frase.lastIndexOf("a"));
        String frase2 = "La casa verd";
        System.out.println(frase.equals(frase2));



    }
}