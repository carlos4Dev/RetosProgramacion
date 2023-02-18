package com.retosprogramacion2022del11al20;

public class Reto13FactorialRecursivo {

    /*
     * Escribe una función que calcule y retorne el factorial de un número dado
     * de forma recursiva.
     */

    public static void main (String[] args) {
        int num = 5;
        System.out.println("El factorial de " + num + " es " +
                factorialRecursivo(num));

    }

    static int factorialRecursivo(int num) {

        if (num == 0) {
            return 1;
        } else {
            return num * (factorialRecursivo(num -1));
        }

    }

}
