package com.retosProgramacion;

public class Reto_04_Area_poligono {

    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */

    public static void main (String args[]) {

        String triangulo = "triangulo", cuadrado = "cuadrado",
                rectangulo = "rectangulo";
        int baseTri = 20, alturaTri = 30, baseCua = 40, baseRec = 20,
                alturaRec = 15;

        System.out.println("El área de un " + triangulo + " de base " +
                baseTri + " y altura " + alturaTri + " es " +
                calcularPoligono(triangulo, baseTri, alturaTri));

        System.out.println("El área de un " + cuadrado + " de base " +
                baseCua + " es " +
                calcularPoligono(cuadrado, baseCua, baseCua));

        System.out.println("El área de un " + rectangulo + " de base " +
                baseRec + " y altura " + alturaRec + " es " +
                calcularPoligono(rectangulo, baseRec, alturaRec));

    }

    private static int calcularPoligono(String poligono, int base, int altura) {

        int area = 0;

        switch (poligono) {
            case ("triangulo"):
               area = (base * altura) / 2;
            break;

            case ("cuadrado"):
                area = base * base;
            break;

            case ("rectangulo"):
                area = base * altura;
            break;

            default:
                System.out.println("De momento no podemos calcular el área " +
                        "del polígono " + poligono);
        }
        return area;
    }
}
