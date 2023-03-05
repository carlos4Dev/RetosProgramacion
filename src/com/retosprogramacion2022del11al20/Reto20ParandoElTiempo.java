package com.retosprogramacion2022del11al20;

public class Reto20ParandoElTiempo {

    /*
     * Crea una función que sume 2 números y retorne su resultado pasados
     * unos segundos.
     * - Recibirá por parámetros los 2 números a sumar y los segundos que
     *   debe tardar en finalizar su ejecución.
     * - Si el lenguaje lo soporta, deberá retornar el resultado de forma
     *   asíncrona, es decir, sin detener la ejecución del programa principal.
     *   Se podría ejecutar varias veces al mismo tiempo.
     */

    public static void main (String[] args) throws InterruptedException {

        int num1 = 3;
        int num2 = 4;
        int seconds = 10;

        



    }

    public static int pararTiempo (int num1, int num2, int seconds) throws
            InterruptedException {

        Thread.sleep(seconds * 1000L);

        return num1 + num2;
    }
}
