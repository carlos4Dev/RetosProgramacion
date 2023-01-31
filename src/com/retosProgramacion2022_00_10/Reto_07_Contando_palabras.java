package com.retosProgramacion2022_00_10;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Reto_07_Contando_palabras {

    /*
     * Crea un programa que cuente cuantas veces se repite cada palabra
     * y que muestre el recuento final de todas ellas.
     * - Los signos de puntuación no forman parte de la palabra.
     * - Una palabra es la misma aunque aparezca en mayúsculas y minúsculas.
     * - No se pueden utilizar funciones propias del lenguaje que
     *   lo resuelvan automáticamente.
     */

    public static void main (String args[]) {

        String textoOriginal = "Lorem? impsum- armet; amet, LORem. lorem!";
        String texto = textoOriginal.toLowerCase(Locale.ROOT);

        // c

//        texto = texto.replaceAll("[\\.\\,\\(\\),\\!,\\?,\\:]",
//                "");
        texto = texto.replaceAll("[\\[|\\]]|[.,;:)(?¡¿!-]|[\\\\]", "");
        String[] palabras = texto.split(" ");

        // Mapa en donde almacenamos la frecuencia.
        // Ver: https://parzibyte.me/blog/2020/01/07/hashmap-java-tutorial-ejemplos/
        HashMap<String, Integer> mapaDeFrecuencias = new HashMap<>();
        for (String palabra : palabras) {
            if (mapaDeFrecuencias.containsKey(palabra)) {
                mapaDeFrecuencias.put(palabra, mapaDeFrecuencias.get(palabra) + 1);
            } else {
                mapaDeFrecuencias.put(palabra, 1);
            }
        }
        // Imprimir mapa
        for (HashMap.Entry<String, Integer> entry : mapaDeFrecuencias.entrySet()) {
            System.out.printf("Palabra '%s' con frecuencia %d\n",
                    entry.getKey(), entry.getValue());
        }

    }


}
