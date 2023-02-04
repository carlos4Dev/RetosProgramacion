package com.retosprogramacion2022del00al10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.retosprogramacion2022del00al10.Reto06InvertirCadenas.stringReverseOrder;

public class Reto08DecimalABinario {

    /*
     * Crea un programa se encargue de transformar un número
     * decimal a binario sin utilizar funciones propias del lenguaje que
     * lo hagan directamente.
     */

    public static void main (String args[]) {

        int decimalNum = 123;
        String binary = decimalToBinary(decimalNum);

        System.out.println("Con mi función el número " + decimalNum + " en " +
                "binario es " + binary);

        System.out.print("Una manera más fácil el número " + decimalNum +
                " en binario es ");
        decimalToBinaryEasy(decimalNum);

    }

    public static String decimalToBinary(int decimalNum) {

        int num = decimalNum;
        List<Integer> valores = new ArrayList<>();

        while ((num / 2) > 0) {
            valores.add(num % 2);
            num = num / 2;
        }
        valores.add(num % 2);

        String listValues = valores.stream()
                .map(Object::toString)
                .collect(Collectors.joining());

        String binary = stringReverseOrder(listValues);
        return binary;

    }

    public static void decimalToBinaryEasy(int number) {

        // an array which will store the binary number
        int[] Binary_Number = new int[1000];

        int x = 0;
        while (number > 0) {
            // store the remainder in the array
            Binary_Number[x] = number % 2;
            number = number / 2;
            x++;
        }

        // print the final array in reverse order
        for (int y = x - 1; y >= 0; y--)
            System.out.print(Binary_Number[y]);

    }

}
