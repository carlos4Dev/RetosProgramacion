package com.retosprogramacion2022del11al20;

import java.text.Normalizer;

public class Reto12Palindromo {

    /*
     * Escribe una función que reciba un texto y retorne verdadero o
     * falso (Boolean) según sean o no palíndromos.
     * Un Palíndromo es una palabra o expresión que es igual si se lee
     * de izquierda a derecha que de derecha a izquierda.
     * NO se tienen en cuenta los espacios, signos de puntuación y tildes.
     * Ejemplo: Ana lleva al oso la avellana.
     */

    public static void main (String[] args) {

        String text1 = "¿Aníta3!, ¡läva4: lá3; tina?.";
        String text2 = "Allí va Ramón y no maravilla";
        String text3 = "A mí no me ma";

        System.out.println(isPalindromo(text1));
        System.out.println(isPalindromo(text2));
        System.out.println(isPalindromo(text3));

    }

    public static boolean isPalindromo(String text) {

        String textWithout = Normalizer
                .normalize(text, Normalizer.Form.NFD)
                .replaceAll("[^\\p{ASCII}]", "");
        String regEx = "[ |0-9¡!¿?.,:;]";
        String test = textWithout
                .replaceAll(regEx, "")
                .toLowerCase();
        StringBuilder temp1 = new StringBuilder();

        for (int i = test.length() - 1; i >= 0; i--) {
            temp1.append(test.charAt(i));
        }

        System.out.println(text);
        System.out.println(test);
        System.out.println(temp1);

        return test.equals(temp1.toString());

    }

}
