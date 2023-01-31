package com.retosProgramacion2022_00_10;

import java.util.ArrayList;
import java.util.Collections;

public class Reto_01_Anagrama {
    /*
    Reto #1
    ¿ES UN ANAGRAMA?
    Fecha publicación enunciado: 03/01/22
    Fecha publicación resolución: 10/01/22
    Dificultad: MEDIA

    Enunciado: Escribe una función que reciba dos palabras (String) y retorne verdadero o falso (Boolean) según sean o no anagramas.
    Un Anagrama consiste en formar una palabra reordenando TODAS las letras de otra palabra inicial.
    NO hace falta comprobar que ambas palabras existan.
    Dos palabras exactamente iguales no son anagrama.
    */

    public static void main(String args[])
    {
        String word1 ="matematicamente1",
               word2 = "1matematicamente";
        if (ft_anagrama(word1, word2)) {
            System.out.println(word1 + " y " + word2 + " son anagramas");
        } else {
            System.out.println(word1 + " y " + word2 + " NO SON anagramas");
        }
    }

    private static boolean ft_anagrama(String word1, String word2) {

        ArrayList<Character> chars1 = new ArrayList<Character>();
        ArrayList<Character> chars2 = new ArrayList<Character>();

        for (int i = 0; i < word1.length(); i++) {
            chars1.add(word1.charAt(i));
        }

        for (int j = 0; j < word2.length(); j++) {
            chars2.add(word2.charAt(j));
        }

        if (chars1.equals(chars2)) {
            System.out.println(word1 + " y " + word2 + " son iguales");
            return false;
        } else {
            Collections.sort(chars1);
            Collections.sort(chars2);

            if (chars1.equals(chars2)) {
                return true;
            } else {
                return false;
            }
        }

    }
}
