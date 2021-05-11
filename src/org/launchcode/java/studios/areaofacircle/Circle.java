package org.launchcode.java.studios.areaofacircle;

public class Circle {
    private Double radius;

    public Circle(Double radius) {
        this.radius = radius;
    }
    public Double getArea() {
        return 3.14 * radius * radius;
    }
}
