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

        String name = "Hola Mundo";
        ArrayList<Character> alreves = new ArrayList<Character>();
        int lastPosition = name.length() - 1;

        for (int i = lastPosition; i >= 0; i--){
            alreves.add(name.charAt(i));
        }
        /*
        for(int i = 0; i < alreves.size(); i++) {
            System.out.print(alreves.get(i));
        }
        */
        String str = alreves.stream()
                .map(e->e.toString())
                .collect(Collectors.joining());

        System.out.println(str);

    }

}
