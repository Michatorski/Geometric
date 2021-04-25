package org.iesfm.geometric;

import java.util.Objects;

public class Circulo extends GeometricForm{
    private double radio;

    static double pi = Math.PI;

    public Circulo(String color, double coordenates, double radio) {
        super(color, coordenates);
        this.radio = radio;
    }

    @Override
    public void geometryInfo() {
        System.out.println("Su radio mide: " + radio + " cm");
        System.out.println("La figura es de COLOR: " + getColor());
        System.out.println("Tiene una coordenadas de " + getCoordenates());
    }

    @Override
    public double calcuArea() {

        return pi * radio * radio;
    }

    @Override
    public double calcuPerimeter() {
        return 2 * pi * radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Circulo circulo = (Circulo) o;
        return Double.compare(circulo.radio, radio) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), radio);
    }
}
