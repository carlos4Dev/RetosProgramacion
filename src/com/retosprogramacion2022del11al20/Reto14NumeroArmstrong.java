package com.retosprogramacion2022del11al20;

public class Reto14NumeroArmstrong {

    /*
     * Escribe una función que calcule si un número dado es un número de Armstrong
     * (o también llamado narcisista).
     * Si no conoces qué es un número de Armstrong, debes buscar información
     * al respecto.
     */

    public static void main (String[] args) {

        int num1 = 1973;
        int num2 = 8208;

        System.out.println(num1 + " es un número Armstrong: " +
                isArmstrong(num1));
        System.out.println(num2 + " es un número Armstrong: " +
                isArmstrong(num2));

    }

    public static boolean isArmstrong (int num) {
        boolean isArmstrongNum = false;
        String numToString = String.valueOf(num);
        int numSize = numToString.length();

        double total = 0.0;
        for (int i = 0; i < numSize; i++) {
            double charValue = Double
                    .parseDouble(String.valueOf(numToString.charAt(i)));
            double valueElevate = Math.pow(charValue, numSize);
            total = total + valueElevate;
        }

        if (total == (double) num) {
            isArmstrongNum = true;
        }
        return isArmstrongNum;
    }

}
