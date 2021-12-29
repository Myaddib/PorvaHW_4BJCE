package basic.java_cursor.education.shape.PlanceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.PerimeterMeasurable;

public class Circle extends PlanceShape implements PerimeterMeasurable, AreaMeasurable {

    private double perimeter;
    private double area;
    private final double radius;
    public Vertex verticles;

    public Circle(Vertex verticlesC, double radius) {
        super(verticlesC);
        this.verticles = verticlesC;
        this.radius = radius;
    }


    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius; // С = 2π * R
        return perimeter;
    }


    public double getArea() {

        area = Math.PI * radius * radius; // S = π R2
        return area;
    }

    @Override
    public String toString() {
        return "Circle={" +
                "vertex=" + verticles +
                "perimeter=" + perimeter +
                ", area=" + area +
                ", radius=" + radius +
                '}';
    }
}
