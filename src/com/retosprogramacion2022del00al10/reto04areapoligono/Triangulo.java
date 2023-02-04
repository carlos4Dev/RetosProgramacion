package com.retosprogramacion2022del00al10.reto04areapoligono;

public class Triangulo implements Poligono {

    private Double base;
    private Double altura;
    public Triangulo(Double base, Double altura) {
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
        Double area = (base * altura) / 2;
        return area;
    }

    @Override
    public void imprimirArea() {

        System.out.print("El area de un triangulo de base " + this.getBase() +
                " y altura " + this.getAltura() + " es ");

    }
}
