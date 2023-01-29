package com.retosProgramacion.reto_04_Area_Poligono;

public class Rectangulo implements Poligono {

    private Double base;
    private Double altura;

    public Rectangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public Double getBase() {
        return base;
    }

    public Double getAltura() {
        return altura;
    }

    @Override
    public Double calcularArea() {
        Double base = this.getBase();
        Double altura = this.getAltura();
        Double area = base * altura;
        return area;
    }

    @Override
    public void imprimirArea() {

        System.out.print("El area de un rectángulo de base " + this.getBase() +
               " y altura " + this.getAltura() + " es ");

    }
}
