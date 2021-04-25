package org.iesfm.geometric;


import java.util.Objects;

public abstract class GeometricForm {
    private String color;
    private double x;
    private double y;

    public GeometricForm(String color, double x, double y) {
        this.color = color;
        this.x = x;
        this.y = y;
    }

    public void basicInfo(){
        System.out.println("El color de la figura es " + color);
        System.out.println("La coordenada X de la figura es " + x);
        System.out.println("La coordenada Y de la figura es " + y);
        showSpecificInfo();
    }
    public abstract void showSpecificInfo();

    public abstract double calcuArea();

    public abstract double calcuPerimeter();

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GeometricForm that = (GeometricForm) o;
        return Double.compare(that.x, x) == 0 &&
                Double.compare(that.y, y) == 0 &&
                Objects.equals(color, that.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(color, x, y);
    }
}
