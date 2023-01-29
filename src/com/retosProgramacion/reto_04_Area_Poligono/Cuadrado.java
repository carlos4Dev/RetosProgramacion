package com.retosProgramacion.reto_04_Area_Poligono;

public class Cuadrado implements Poligono {

    private Double lado;

    public Cuadrado(Double lado) {
        this.lado = lado;
    }

    public Double getLado() {
        return lado;
    }

    @Override
    public Double calcularArea() {
        Double lado = this.getLado();
        Double area = lado * lado;
        return area;
    }

    @Override
    public void imprimirArea() {

        System.out.print("El area de un cuadrado de lado " + this.getLado() +
                " es ");

    }
}
