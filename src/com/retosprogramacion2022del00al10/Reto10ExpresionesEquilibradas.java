package com.retosprogramacion2022del00al10;

import java.util.HashMap;
import java.util.Map;

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

    public static void  main (String[] args) {

        String text = "{ [ a * ( c + d ) ] - 5 }";
        if (isBalanced(text)) {
            System.out.println("La expresión está balanceada");
        } else {
            System.out.println("La expresión NO está balanceada");
        }

    }

    private static boolean isBalanced(String text) {

        System.out.println(text);

        String[] characters = text.split("");
        Map<String, Integer> mapChars = new HashMap<String,Integer>();
        mapChars.put("{", 0);
        mapChars.put("[", 0);
        mapChars.put("(", 0);
        mapChars.put(")", 0);
        mapChars.put("]", 0);
        mapChars.put("}", 0);

        for (String character : characters) {
            if (mapChars.containsKey(character)) {
                mapChars.put(character, mapChars.get(character) + 1);
            }
        }

        if (mapChars.get("{") != mapChars.get("}")) {
            return false;
        } else if (mapChars.get("[") != mapChars.get("]")) {
            return false;
        } else if (mapChars.get("(") != mapChars.get(")")) {
            return false;
        }

        return true;

    }

}
