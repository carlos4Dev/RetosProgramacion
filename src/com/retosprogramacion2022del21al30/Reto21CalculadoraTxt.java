package com.retosprogramacion2022del21al30;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Reto21CalculadoraTxt {

    /*
     * Lee el fichero "Challenge21.txt" incluido en el proyecto, calcula su
     * resultado e imprímelo.
     * - El .txt se corresponde con las entradas de una calculadora.
     * - Cada línea tendrá un número o una operación representada por un
     *   símbolo (alternando ambos).
     * - Soporta números enteros y decimales.
     * - Soporta las operaciones suma "+", resta "-", multiplicación "*"
     *   y división "/".
     * - El resultado se muestra al finalizar la lectura de la última
     *   línea (si el .txt es correcto).
     * - Si el formato del .txt no es correcto, se indicará que no se han
     *   podido resolver las operaciones.
     */
    public static void main (String[] args) {


        String nombreArchivo = "/Users/mac/RetosProgramacion/src/com" +
                "/retosprogramacion2022del21al30/calculadora.txt";
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(nombreArchivo);
            bufferedReader = new BufferedReader(fileReader);
            StringBuilder stringBuilder = new StringBuilder("");
            String linea;
            while ((linea = bufferedReader.readLine()) != null) {
                // Lee línea por línea, omitiendo los saltos de línea
                // stringBuilder.append(linea).append("\n");
                stringBuilder.append(linea);
            }

            String content = stringBuilder.toString();
            System.out.println(content);


            if (!Character.isDigit(content.charAt(0)) ||
                !Character.isDigit(content.charAt(content.length() - 1))) {
                System.out.println("Format error");
            }

            int i = 0;
            int num1 = 0;
            int num2 = 0;
            int result = 0;
            StringBuilder first = new StringBuilder("");
            StringBuilder second = new StringBuilder("");
            String operator ="";

            while (i < content.length()) {
                if (Character.isDigit(content.charAt(i))) {
                    first.append(String.valueOf(content.charAt(i)));
                    num1 = Integer.parseInt(first.toString());
                    i++;
                } else {
                    operator = String.valueOf(content.charAt(i));
                    i++;
                    if (Character.isDigit(content.charAt(i))) {
                        second.append(String.valueOf(content.charAt(i)));
                        num2 = Integer.parseInt(second.toString());
                        i++;
                    } else {
                        if (operator.equals("+")) {
                            result = num1 + num2;
                            i++;
                            System.out.println("Result = " + result);
                        } else if (operator.equals("-")) {
                            result = num1 - num2;
                            System.out.println("Result " + (i + 1) + " = " + result);
                        } else if (operator.equals("*")) {
                            result = num1 * num2;
                            System.out.println("Result " + (i + 1) + " = " + result);
                        } else if (operator.equals("/")) {
                            result = num1 / num2;
                            System.out.println("Result " + (i + 1) + " = " + result);
                        }
                    }
                }i++;
            }
            System.out.println("El resultado es " + result);

        } catch (IOException e) {
            System.out.println("Excepción leyendo archivo: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileReader != null)
                    fileReader.close();
                if (bufferedReader != null)
                    bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Excepción cerrando: " + e.getMessage());
            }
        }

    }

}
