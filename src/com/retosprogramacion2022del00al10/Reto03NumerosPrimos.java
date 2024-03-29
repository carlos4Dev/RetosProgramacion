package com.retosprogramacion2022del00al10;

public class Reto03NumerosPrimos {

    /*
     * Escribe un programa que se encargue de comprobar si un número es o no primo.
     * Hecho esto, imprime los números primos entre 1 y 100.
     */

    public static void main (String args[]) {
        int limite = 100;
        for (int i = 0; i <= limite; i++) {
            if (isPrimo(i)) {
                System.out.println("El número " + i + " es primo");
            }
        }

    }

    private static boolean isPrimo(int num) {
        for (int n = 2; n < num; n++) {
            if (num % n == 0) {
                return false;
            }
        }
        return true;
    }
}
