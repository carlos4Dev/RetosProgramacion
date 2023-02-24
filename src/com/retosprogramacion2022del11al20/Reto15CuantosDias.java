package com.retosprogramacion2022del11al20;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class Reto15CuantosDias {

    /*
     * Crea una función que calcule y retorne cuántos días hay entre dos cadenas
     * de texto que representen fechas.
     * - Una cadena de texto que representa una fecha tiene el formato "dd/MM/yyyy".
     * - La función recibirá dos String y retornará un Int.
     * - La diferencia en días será absoluta (no importa el orden de las fechas).
     * - Si una de las dos cadenas de texto no representa una fecha correcta se
     *   lanzará una excepción.
     */

    public static void main (String[] args) throws Exception {

        String date1 = "20/01/2023";
        String date2 = "25/01/2023";

        System.out.println("The diff of days is " +
                howManyDays(date1, date2));

    }

    public static int howManyDays (String date1, String date2) throws Exception {
        try {
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

            if (!goodFormat(date1) || !goodFormat(date2)) {
                throw new Exception("Formato incorrecto");
            }

            Date firstDate1 = format.parse(date1);
            Date secondDate1 = format.parse(date2);

            LocalDate firstDate = firstDate1.toInstant().atZone(ZoneId
                    .systemDefault()).toLocalDate();
            LocalDate secondDate = secondDate1.toInstant().atZone(ZoneId
                    .systemDefault()).toLocalDate();

            long numberOFDays = DAYS.between(firstDate, secondDate);
            long absoluteValue = Math.abs(numberOFDays);

            return (int) absoluteValue;

        } catch (Exception e) {

            throw new Exception("Formato incorrecto " + e);

        }

    }

    public static boolean goodFormat (String date) {
        String day = date.substring(0,2);
        String month = date.substring(3,5);
        String year = date.substring(6);
        int dayInt = Integer.parseInt(day);
        int monthInt = Integer.parseInt(month);
        int yearInt = Integer.parseInt(year);

        if (monthInt <= 0 || monthInt > 12) {
            System.out.println(month + " mes incorrecto");
            return false;
        } else if (monthInt == 1 || monthInt == 3 || monthInt == 5 ||
                monthInt == 7 || monthInt == 8 || monthInt == 10 ||
                monthInt == 12) {
            if (dayInt <= 0 || dayInt > 31) {
                System.out.println(month + " mes de 31 días " + day + ", día " +
                        "incorrecto");
                return false;
            }
        } else if (monthInt == 4 || monthInt == 6 || monthInt == 9 ||
                monthInt == 11) {
            if (dayInt <=0 || dayInt > 30) {
                System.out.println(month + " mes de 30 días, " + day + " día " +
                        "incorrecto");
                return false;
            }
        } else if (monthInt == 2 && (yearInt % 4 == 0 && yearInt % 100 != 0) ||
                (yearInt % 100 == 0 && yearInt % 400 == 0)) {
            if (dayInt <= 0 || dayInt > 29) {
                System.out.println(year + " es un año bisiesto, el día " +
                        day + " de febrero es incorrecto");
                return false;
            }

        } else if (monthInt == 2) {
            if (dayInt <= 0 || dayInt > 28) {
                System.out.println("Mes de febrero, el día "
                        + day + " incorrecto");
                return false;
            }
        }

        return true;
    }

}
