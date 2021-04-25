package org.iesfm.geometric;

import java.util.Objects;

public class Rectangulo extends GeometricForm{

    private double ladoA;
    private double ladoB;

    public Rectangulo(String color, double x, double y, double ladoA, double ladoB) {
        super(color, x, y);
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    @Override
    public void showSpecificInfo() {
        System.out.println("Un LADO mide: " + ladoA + " cm");
        System.out.println("Un LADO mide: " + ladoB + " cm");

    }

    @Override
    public double calcuArea() {

        return ladoA * ladoB;
    }

    @Override
    public double calcuPerimeter() {

        return 2 * ladoA + 2 * ladoB;
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
