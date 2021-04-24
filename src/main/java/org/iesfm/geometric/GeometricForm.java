package org.iesfm.geometric;


import java.util.Objects;

public abstract class GeometricForm {
    private String color;
    private double coordenates;

    public GeometricForm(String color, double coordenates) {
        this.color = color;
        this.coordenates = coordenates;
    }

    public abstract void geometryInfo();

    public abstract double calcuArea();

    public abstract double calcuPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getCoordenates() {
        return coordenates;
    }

    public void setCoordenates(double coordenates) {
        this.coordenates = coordenates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricForm that = (GeometricForm) o;
        return Double.compare(that.coordenates, coordenates) == 0 &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, coordenates);
    }
}
