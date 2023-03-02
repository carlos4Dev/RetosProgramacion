package com.retosprogramacion2022del11al20;

public class Reto18TresEnRaya {

    /*
     * Crea una función que analice una matriz 3x3 compuesta por "X" y "O"
     * y retorne lo siguiente:
     * - "X" si han ganado las "X"
     * - "O" si han ganado los "O"
     * - "Empate" si ha habido un empate
     * - "Nulo" si la proporción de "X", de "O", o de la matriz no es correcta.
     *   O si han ganado los 2.
     * Nota: La matriz puede no estar totalmente cubierta.
     * Se podría representar con un vacío "", por ejemplo.
     */

    public static void main (String[] args) {

        String [][] matrix = {
                {"X", "O", "X"},
                {"O", "O", "X"},
                {"X", "O", "O"}
        };

        System.out.println("Resultado " + comprobarResultado(matrix));

    }

    public static String comprobarResultado(String[][] matrix) {
        String result;

        if (comprobarEquilibrado(matrix).equals("Nulo")) {
            return "nulo";
        } else if ((matrix[0][0].equals("X") && matrix[0][1].equals("X") && matrix[0][2].equals("X")) ||
                (matrix[1][0].equals("X") && matrix[1][1].equals("X") && matrix[1][2].equals("X")) ||
                (matrix[2][0].equals("X") && matrix[2][1].equals("X") && matrix[2][2].equals("X")) ||
                (matrix[0][0].equals("X") && matrix[1][0].equals("X") && matrix[2][0].equals("X")) ||
                (matrix[0][1].equals("X") && matrix[1][1].equals("X") && matrix[2][1].equals("X")) ||
                (matrix[0][2].equals("X") && matrix[1][2].equals("X") && matrix[2][2].equals("X")) ||
                (matrix[0][0].equals("X") && matrix[1][1].equals("X") && matrix[2][2].equals("X")) ||
                (matrix[0][2].equals("X") && matrix[1][1].equals("X") && matrix[2][0].equals("X"))) {
            result = "han ganado las X";
        } else if ((matrix[0][0].equals("O") && matrix[0][1].equals("O") && matrix[0][2].equals("O")) ||
                (matrix[1][0].equals("O") && matrix[1][1].equals("O") && matrix[1][2].equals("O")) ||
                (matrix[2][0].equals("O") && matrix[2][1].equals("O") && matrix[2][2].equals("O")) ||
                (matrix[0][0].equals("O") && matrix[1][0].equals("O") && matrix[2][0].equals("O")) ||
                (matrix[0][1].equals("O") && matrix[1][1].equals("O") && matrix[2][1].equals("O")) ||
                (matrix[0][2].equals("O") && matrix[1][2].equals("O") && matrix[2][2].equals("O")) ||
                (matrix[0][0].equals("O") && matrix[1][1].equals("O") && matrix[2][2].equals("O")) ||
                (matrix[0][2].equals("O") && matrix[1][1].equals("O") && matrix[2][0].equals("O"))) {
            result = "han ganado las O";
        } else {
            result = "empate";
        }
        return result;

    }

    public static String comprobarEquilibrado (String[][] matrix) {
        int countX = 0;
        int countO = 0;
        for (String[] strings : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (strings[j].equals("X")) {
                    countX = countX + 1;
                } else if (strings[j].equals("O")) {
                    countO = countO + 1;
                }
            }
        }

        int diference = Math.abs(countX - countO);
        if (diference > 1) {
            return "Nulo";
        } else {
            return "Equilibrado";
        }
    }
    
}
