package com.retosprogramacion2022del00al10.reto04areapoligono;

public class Reto04AreaPoligono {

    /*
     * Crea una única función (importante que sólo sea una) que sea capaz
     * de calcular y retornar el área de un polígono.
     * - La función recibirá por parámetro sólo UN polígono a la vez.
     * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
     * - Imprime el cálculo del área de un polígono de cada tipo.
     */

    public static void main (String args[]) {

        Poligono cuadrado = new Cuadrado(10.0);
        Poligono rectangulo = new Rectangulo(20.0, 15.0);
        Poligono triangulo = new Triangulo(15.0, 20.0);

        calcularArea(cuadrado);
        calcularArea(rectangulo);
        calcularArea(triangulo);


    }

    private static void calcularArea(Poligono poligono) {

        poligono.imprimirArea();
        System.out.println(poligono.calcularArea());

    }

}
