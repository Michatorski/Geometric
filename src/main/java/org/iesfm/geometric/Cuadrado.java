package org.iesfm.geometric;

import java.util.Objects;

public class Cuadrado extends GeometricForm{

    private double lado;

    public Cuadrado(String color, double coordenates, double lado) {
        super(color, coordenates);
        this.lado = lado;
    }

    @Override
    public void geometryInfo() {

    }

    @Override
    public double calcuArea() {
        return 0;
    }

    @Override
    public double calcuPerimeter() {
        return 0;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cuadrado cuadrado = (Cuadrado) o;
        return Double.compare(cuadrado.lado, lado) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), lado);
    }
}
