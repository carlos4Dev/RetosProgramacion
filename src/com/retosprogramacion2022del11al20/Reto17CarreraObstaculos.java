package com.retosprogramacion2022del11al20;

public class Reto17CarreraObstaculos {

    /*
     * Crea una función que evalúe si un/a atleta ha superado correctamente una
     * carrera de obstáculos.
     * - La función recibirá dos parámetros:
     *      - Un array que sólo puede contener String con las palabras
     *        "run" o "jump"
     *      - Un String que represente la pista y sólo puede contener "_" (suelo)
     *        o "|" (valla)
     * - La función imprimirá cómo ha finalizado la carrera:
     *      - Si el/a atleta hace "run" en "_" (suelo) y "jump" en "|" (valla)
     *        será correcto y no variará el símbolo de esa parte de la pista.
     *      - Si hace "jump" en "_" (suelo), se variará la pista por "x".
     *      - Si hace "run" en "|" (valla), se variará la pista por "/".
     * - La función retornará un Boolean que indique si ha superado la carrera.
     * Para ello tiene que realizar la opción correcta en cada tramo de la pista.
     */

    public static void main (String[] args) {

        String[] steps = {"_", "_", "|", "_", "|", "_"};
        String race ="__|_|_";

        System.out.println("The athlete win the race is " +
                isGoodRace(steps, race));

    }

    public static boolean isGoodRace (String[] steps, String race) {
        boolean goodRace = false;


        return goodRace;
    }
}
