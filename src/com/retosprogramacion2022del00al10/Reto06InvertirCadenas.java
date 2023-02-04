package com.retosprogramacion2022del00al10;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Reto06InvertirCadenas {

    /*
     * Crea un programa que invierta el orden de una cadena de texto
     * sin usar funciones propias del lenguaje que lo hagan de forma automática.
     * - Si le pasamos "Hola mundo" nos retornaría "odnum aloH"
     */

    public static void main (String args[]) {

        String texto = "Hola Mundo";

        System.out.println(stringReverseOrder(texto));

    }

    public static String stringReverseOrder(String text) {

        ArrayList<Character> alreves = new ArrayList<Character>();
        int lastPosition = text.length() - 1;

        for (int i = lastPosition; i >= 0; i--) {
            alreves.add(text.charAt(i));
        }

        String str = alreves.stream()
                .map(e -> e.toString())
                .collect(Collectors.joining());

        return str;
    }

}
