package org.iesfm.geometric;

import java.util.Objects;

public class Circulo extends GeometricForm{
    private double radio;

    static double pi = Math.PI;

    public Circulo(String color, double x, double y, double radio) {
        super(color, x, y);
        this.radio = radio;
    }

    @Override
    public void showSpecificInfo() {
        System.out.println("Su radio mide: " + radio + " cm");
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
