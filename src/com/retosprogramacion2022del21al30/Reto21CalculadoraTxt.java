package com.retosprogramacion2022del21al30;

public class Reto21CalculadoraTxt {

    /*
     * Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula su
     * resultado e imprímelo.
     * - El .txt se corresponde con las entradas de una calculadora.
     * - Cada línea tendrá un número o una operación representada por un
     *   símbolo (alternando ambos).
     * - Soporta números enteros y decimales.
     * - Soporta las operaciones suma "+", resta "-", multiplicación "*"
     *   y división "/".
     * - El resultado se muestra al finalizar la lectura de la última
     *   línea (si el .txt es correcto).
     * - Si el formato del .txt no es correcto, se indicará que no se han
     *   podido resolver las operaciones.
     */
    public static void main (String[] args) {

        String file = "path";
        System.out.println(calculate(file));

    }

    public static String calculate(String file) {

        return file;

    }

}
