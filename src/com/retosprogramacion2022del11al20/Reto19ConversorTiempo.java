package com.retosprogramacion2022del11al20;

public class Reto19ConversorTiempo {

    /*
     * Crea una función que reciba días, horas, minutos y segundos (como enteros)
     * y retorne su resultado en milisegundos.
     */

    public static void main (String[] args) {

        int days = 2;
        int hours = 14;
        int minutes = 30;
        int seconds = 28;

        System.out.println(days + " días, " + hours + " horas, " + minutes +
                " minutos y " + seconds + " segundos son " +
                conversor(days, hours, minutes, seconds) + " milisegundos");

    }

    public static long conversor (int days, int hours, int minutes,
                                  int seconds ) {

        long daysInMilis, hoursInMillis, minutesInMillis, secondsInMillis;
        daysInMilis = (long) (days * 86400000L);
        hoursInMillis = (long) (hours * 3600000L);
        minutesInMillis = (long) (minutes * 60000L);
        secondsInMillis = (long) (seconds * 1000L);

        return daysInMilis + hoursInMillis + minutesInMillis + secondsInMillis;

    }

}
