package com.hedima.Presentacion;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio2 {
    public static void main(String[] args) {
        /* Definir una fecha de fabricación y una fecha de expiración
        Calcular los días, meses, años para que caduque */

        LocalDate ffabricacion = LocalDate.of(2020, 1, 1);
        LocalDate fexpiracion = LocalDate.of(2023, 12, 31);

        System.out.println("Fecha fabricacion-> "+ffabricacion);
        System.out.println("Fecha expiración-> "+fexpiracion);
        System.out.println("Años caducidad-> "+Period.between(ffabricacion,fexpiracion).getYears());
        System.out.println("Meses caducidad-> "+Period.between(ffabricacion,fexpiracion).getMonths());
        System.out.println("Dias caducidad-> "+Period.between(ffabricacion,fexpiracion).getDays());




    }
}
