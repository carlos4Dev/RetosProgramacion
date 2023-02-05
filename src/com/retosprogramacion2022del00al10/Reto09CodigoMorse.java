package com.retosprogramacion2022del00al10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

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

        String text = "Hola Mundo 2023 Carlos";
        String morse ="_._. ._ ._. ._.. ___ ...  .... ___ ._.. ._  __ .._ _. " +
                "_.. ___  ..___ _____ ..___ ...__ ";

        textToConvert(text);
        textToConvert(morse);

    }

    private static void textToConvert(String text) {

        HashMap<Character, String> textToMorse = getTextToMorseCode();

        int size = text.length();

        System.out.println("El mensaje " + text);
        if (text.contains(".") || text.contains("_")) {
            System.out.println("Traducido a texto: ");
            convertMorseToCharacter(text);

        } else {
            String textToConvert = text.toLowerCase();
            System.out.println("Traducido a código morse: ");
            for (int i = 0; i < size; i++) {
                System.out.print(textToMorse.get(textToConvert.charAt(i)));
            }
        }

        System.out.println("\n");

    }

    private static void convertMorseToCharacter(String text) {
        HashMap<String, Character> morseToText = getMorseToTextCode();
        String[] splitText = text.split(" ");
        String[] characters = new String[100];

        for (int i = 0; i < splitText.length; i++) {
            characters[i] = splitText[i].concat(" ");
            System.out.print(morseToText.get(characters[i]));
        }

    }

    private static HashMap<String, Character> getMorseToTextCode() {
        HashMap<String, Character> morseToText = new HashMap<>();
        morseToText.put("._ ", 'a');
        morseToText.put("_... ", 'b');
        morseToText.put("_._. ", 'c');
        morseToText.put("_.. ", 'd');
        morseToText.put(". ", 'e');
        morseToText.put(".._. ", 'f');
        morseToText.put("__. ", 'g');
        morseToText.put(".... ", 'h');
        morseToText.put(".. ", 'i');
        morseToText.put(".___ ", 'j');
        morseToText.put("_._ ", 'k');
        morseToText.put("._.. ", 'l');
        morseToText.put("__ ", 'm');
        morseToText.put("_. ", 'n');
        morseToText.put("___ ", 'o');
        morseToText.put(".__. ", 'p');
        morseToText.put("__._ ", 'q');
        morseToText.put("._. ", 'r');
        morseToText.put("... ", 's');
        morseToText.put("_ ", 't');
        morseToText.put(".._ ", 'u');
        morseToText.put("..._ ", 'v');
        morseToText.put(".__ ", 'w');
        morseToText.put("_.._ ", 'x');
        morseToText.put("_.__ ", 'y');
        morseToText.put("__.. ", 'z');
        morseToText.put(".____ ", '1');
        morseToText.put("..___ ", '2');
        morseToText.put("...__ ", '3');
        morseToText.put("...._ ", '4');
        morseToText.put("..... ", '5');
        morseToText.put("_.... ", '6');
        morseToText.put("__... ", '7');
        morseToText.put("___.. ", '8');
        morseToText.put("____. ", '9');
        morseToText.put("_____ ", '0');
        morseToText.put(" ", ' ');
        return morseToText;
    }

    private static HashMap<Character, String> getTextToMorseCode() {
        HashMap<Character, String> textToMorse = new HashMap<>();
        textToMorse.put('a',"._ ");
        textToMorse.put('b',"_... ");
        textToMorse.put('c',"_._. ");
        textToMorse.put('d',"_.. ");
        textToMorse.put('e',". ");
        textToMorse.put('f',".._. ");
        textToMorse.put('g',"__. ");
        textToMorse.put('h',".... ");
        textToMorse.put('i',".. ");
        textToMorse.put('j',".___ ");
        textToMorse.put('k',"_._ ");
        textToMorse.put('l',"._.. ");
        textToMorse.put('m',"__ ");
        textToMorse.put('n',"_. ");
        textToMorse.put('o',"___ ");
        textToMorse.put('p',".__. ");
        textToMorse.put('q',"__._ ");
        textToMorse.put('r',"._. ");
        textToMorse.put('s',"... ");
        textToMorse.put('t',"_ ");
        textToMorse.put('u',".._ ");
        textToMorse.put('v',"..._ ");
        textToMorse.put('w',".__ ");
        textToMorse.put('x',"_.._ ");
        textToMorse.put('y',"_.__ ");
        textToMorse.put('z',"__.. ");
        textToMorse.put('1',".____ ");
        textToMorse.put('2',"..___ ");
        textToMorse.put('3',"...__ ");
        textToMorse.put('4',"...._ ");
        textToMorse.put('5',"..... ");
        textToMorse.put('6',"_.... ");
        textToMorse.put('7',"__... ");
        textToMorse.put('8',"___.. ");
        textToMorse.put('9',"____. ");
        textToMorse.put('0',"_____ ");
        textToMorse.put(' ', " ");
        return textToMorse;
    }


}
