package com.retosprogramacion2022del00al10;

import java.util.HashMap;

public class Reto09CodigoMorse {

    /*
     * Crea un programa que sea capaz de transformar texto natural a código
     * morse y viceversa.
     * - Debe detectar automáticamente de qué tipo se trata y realizar
     *   la conversión.
     * - En morse se soporta raya "—", punto ".", un espacio " " entre letras
     *   o símbolos y dos espacios entre palabras "  ".
     * - El alfabeto morse soportado será el mostrado en
     *   https://es.wikipedia.org/wiki/Código_morse
     */

    public static void main (String args[]) {

        String text = "Hola Mundo 2023";
        textToMorse(text);

    }

    private static void textToMorse(String text) {

        HashMap<Character, String> morseCode = new HashMap<>();
        morseCode.put('a',"._");
        morseCode.put('b',"_...");
        morseCode.put('c',"_._.");
        morseCode.put('d',"_..");
        morseCode.put('e',".");
        morseCode.put('f',".._.");
        morseCode.put('g',"__.");
        morseCode.put('h',"....");
        morseCode.put('i',"..");
        morseCode.put('j',".___");
        morseCode.put('k',"_._");
        morseCode.put('l',"._..");
        morseCode.put('m',"__");
        morseCode.put('n',"_.");
        morseCode.put('o',"___");
        morseCode.put('p',".__.");
        morseCode.put('q',"__._");
        morseCode.put('r',"._.");
        morseCode.put('s',"...");
        morseCode.put('t',"_");
        morseCode.put('u',".._");
        morseCode.put('v',"..._");
        morseCode.put('w',".__");
        morseCode.put('x',"_.._");
        morseCode.put('y',"_.__");
        morseCode.put('z',"__..");
        morseCode.put('1',".____");
        morseCode.put('2',"..___");
        morseCode.put('3',"...__");
        morseCode.put('4',"...._");
        morseCode.put('5',".....");
        morseCode.put('6',"_....");
        morseCode.put('7',"__...");
        morseCode.put('8',"___..");
        morseCode.put('9',"____.");
        morseCode.put('0',"_____");
        morseCode.put(' ', "dos espacios");

        int size = text.length();
        String textToConvert = text.toLowerCase();
        for (int i = 0; i < size; i++) {
            System.out.println(textToConvert.charAt(i) + " = " +
                    morseCode.get(textToConvert.charAt(i)));
        }

    }

}
