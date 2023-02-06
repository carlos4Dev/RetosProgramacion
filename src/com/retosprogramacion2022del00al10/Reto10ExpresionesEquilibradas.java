package com.retosprogramacion2022del00al10;

public class Reto10ExpresionesEquilibradas {

    /*
     * Crea un programa que comprueba si los paréntesis, llaves y corchetes
     * de una expresión están equilibrados.
     * - Equilibrado significa que estos delimitadores se abren y cieran
     *   en orden y de forma correcta.
     * - Paréntesis, llaves y corchetes son igual de prioritarios.
     *   No hay uno más importante que otro.
     * - Expresión balanceada: { [ a * ( c + d ) ] - 5 }
     * - Expresión no balanceada: { a * ( c + d ) ] - 5 }
     */

    public static void  main (String args[]) {

        String text = "{ [ a * ( c + d ) ] - 5 }";
        isBalanced(text);

    }

    private static void isBalanced(String text) {
        

    }
}
