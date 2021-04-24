package org.iesfm.geometric;

import java.util.Objects;

public class Rectangulo extends GeometricForm{

    private double ladoA;
    private double ladoB;

    public Rectangulo(String color, double coordenates, double ladoA, double ladoB) {
        super(color, coordenates);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
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

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(that.ladoA, ladoA) == 0 &&
                Double.compare(that.ladoB, ladoB) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ladoA, ladoB);
    }
}
