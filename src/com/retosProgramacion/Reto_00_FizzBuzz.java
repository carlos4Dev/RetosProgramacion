package com.retosProgramacion;

public class Reto_00_FizzBuzz {
    /*
    * Reto #0
    * EL FAMOSO "FIZZ BUZZ"
    * Fecha publicación enunciado: 27/12/21
    * Fecha publicación resolución: 03/01/22
    * Dificultad: FÁCIL
    *
    * Enunciado: Escribe un programa que muestre por consola (con un print) los números de 1 a 100 (ambos incluidos y con un salto de línea entre cada impresión), sustituyendo los siguientes:
    * - Múltiplos de 3 por la palabra "fizz".
    * - Múltiplos de 5 por la palabra "buzz".
    * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
    *
    */

    public static void main(String[] args) {
	    final int limite = 100;

        for (int i = 1; i <= limite; i++) {
            fizzBuzz(i);
        }
    }

    private static void fizzBuzz(int numero) {
        boolean fizz = numero % 3 == 0,
                buzz = numero % 5 == 0,
                fizzBuzz = numero % 15 == 0;

        if (fizzBuzz) {
            System.out.println("fizzBuzz");
        } else if (fizz) {
            System.out.println("fizz");
        } else if (buzz) {
            System.out.println("buzz");
        } else {
            System.out.println(numero);
        }
    }
}
