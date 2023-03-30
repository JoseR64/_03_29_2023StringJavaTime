package com.hedima.Presentacion;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class ProbarJavaTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1992,8,30);
        System.out.println("Fecha-> " + date);

        LocalDate date2 = LocalDate.of(1992, Month.AUGUST,30);
        System.out.println("Fecha-> " + date2);

        LocalDate date3 = LocalDate.parse("1992-08-30");
        System.out.println("Fecha-> " + date3);

        System.out.println(date.plusDays(2));
        System.out.println(date2.plusMonths(1));
        System.out.println(date3.plusYears(1));

        System.out.println(date.minusDays(2));
        System.out.println(date2.minusMonths(1));
        System.out.println(date3.minusYears(1));

        LocalDate date4 = LocalDate.of(2007,Month.JULY,7);
        System.out.println(date2.isBefore(date4));
        System.out.println(date2.isAfter(date4));

        System.out.println(LocalDate.now());

        System.out.println(Period.between(date2,date4).getYears());

        System.out.println(Period.between(date2,LocalDate.now()).getYears());

        LocalTime horainicio = LocalTime.of(12,0);
        System.out.println("Hora de inicio: " + horainicio);
        LocalTime horafinal = LocalTime.parse("12:00:00.001");
        System.out.println("Hora de final: " + horafinal);

        System.out.println(horainicio.plusHours(1));
        System.out.println(horainicio.minusMinutes(1));
        System.out.println();




    }
}
