package com.retosProgramacion;

public class Reto_02_Fibonacci {
    /** Reto #2
     * LA SUCESIÓN DE FIBONACCI
     * Fecha publicación enunciado: 10/01/22
     * Fecha publicación resolución: 17/01/22
     * Dificultad: DIFÍCIL
     *
     * Enunciado: Escribe un programa que imprima los 50 primeros números de la sucesión de Fibonacci empezando en 0.
     * La serie Fibonacci se compone por una sucesión de números en la que el siguiente siempre es la suma de los dos anteriores.
     * 0, 1, 1, 2, 3, 5, 8, 13...
     */

    public static void main(String args[]) {

        long num1 = 0, num2 = 1, suma = 1, serie = 50;

        // Muestra el valor inicial
        System.out.println(num1);

        for (int i = 0; i < serie; i++) {
            // Muestra el valor de la suma
            System.out.println(suma);
            suma = num1 + num2;
            num1 = num2;
            num2 = suma;
        }



    }

}