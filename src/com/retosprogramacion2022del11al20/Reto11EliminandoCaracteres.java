package com.retosprogramacion2022del11al20;

public class Reto11EliminandoCaracteres {

    /*
     * Crea una función que reciba dos cadenas como parámetro (str1, str2)
     * e imprima otras dos cadenas como salida (out1, out2).
     * - out1 contendrá todos los caracteres presentes en la str1 pero NO
     *   estén presentes en str2.
     * - out2 contendrá todos los caracteres presentes en la str2 pero NO
     *   estén presentes en str1.
     */

    public static void main (String[] args) {

        String str1 = "Hola mundo 2023, ¿como te fue la vida? 76*6/ r";
        String str2 = "Vale chaval 1423! pero que dicex weih! 987%/";

        deleteChars(str1, str2);

    }

    public static void deleteChars (String str1, String str2) {

        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            if (!str2.contains(String.valueOf(str1.charAt(i))) &&
                    (temp1.indexOf(String.valueOf(str1.charAt(i))) == -1)) {
                temp1.append(str1.charAt(i));
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            if (!str1.contains(String.valueOf(str2.charAt(i))) &&
                    (temp2.indexOf(String.valueOf(str2.charAt(i))) == -1)) {
                temp2.append(str2.charAt(i));
            }
        }

        String out1 = temp1.toString();
        String out2 = temp2.toString();
        System.out.println("Los caracteres que están en str1 y no en str2 " +
                "son: " + out1);
        System.out.println("Los caracteres que están en str2 y no en str1 " +
                "son: " + out2);

    }

}
