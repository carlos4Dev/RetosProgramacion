package com.retosprogramacion2022del11al20;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

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

        ExecutorService exec1 = Executors.newSingleThreadExecutor();
        exec1.submit(() -> {
            try {
                task1(3, 4,8);
                exec1.shutdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        ExecutorService exec2 = Executors.newSingleThreadExecutor();
        exec2.submit(() -> {
            try {
                task2(5, 8,12);
                exec2.shutdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        ExecutorService exec3 = Executors.newSingleThreadExecutor();
        exec3.submit(() -> {
            try {
                task3(2, 3,4);
                exec3.shutdown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

    }

    public static void task1(int num1, int num2, int seconds) throws
            InterruptedException {
        System.out.println("Task 1 -> " + num1 + " + " + num2 + " = " +
                pararTiempo(num1, num2, seconds) + " esperando " + seconds +
                " segundos");
    }

    public static void task2(int num1, int num2, int seconds) throws
            InterruptedException {
        System.out.println("Task 2 -> " + num1 + " + " + num2 +" = " +
                pararTiempo(num1, num2, seconds) + " esperando " + seconds +
                " segundos");
    }

    public static void task3(int num1, int num2, int seconds)
            throws InterruptedException {
        System.out.println("Task 3 -> " + num1 + " + " + num2 + " = " +
                pararTiempo(num1, num2, seconds) + " esperando " + seconds +
                " segundos");
    }

    public static int pararTiempo (int num1, int num2, int seconds)
            throws InterruptedException {

        Thread.sleep(seconds * 1000L);

        return num1 + num2;
        
    }
}
