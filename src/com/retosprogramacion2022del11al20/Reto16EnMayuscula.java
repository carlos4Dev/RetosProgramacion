package com.retosprogramacion2022del11al20;

public class Reto16EnMayuscula {

    /*
     * Crea una función que reciba un String de cualquier tipo y se encargue de
     * poner en mayúscula la primera letra de cada palabra.
     * - No se pueden utilizar operaciones del lenguaje que
     *   lo resuelvan directamente.
     */

    public static void main (String[] args) {

        String text = "esTo eS un teXto 23 paRa CoMpRobar eL paso a letra " +
                "cApital";
        System.out.println(text);

        enMayuscula(text);

    }

    public static void enMayuscula (String text) {

        String[] words = text.split(" ");

        for (int i = 0; i < words.length; i++) {
            words[i] = words[i].toUpperCase().charAt(0) + words[i].substring(1,
                    words[i].length()).toLowerCase();
            if (i == words.length -1) {
                System.out.print(words[i]);
            } else {
                System.out.print(words[i] + " ");
            }

        }

    }

}


