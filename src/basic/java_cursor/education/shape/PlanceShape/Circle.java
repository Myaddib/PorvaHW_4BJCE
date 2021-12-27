package basic.java_cursor.education.shape.PlanceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.PerimeterMeasurable;
import basic.java_cursor.education.shape.SpaceShape.SpaceShape;
import basic.java_cursor.education.shape.Vertex;

public class Circle extends SpaceShape implements PerimeterMeasurable, AreaMeasurable {

    private double perimeter;
    private double area;
    private final double radius;

    public Circle(Vertex[] verticles, double radius) {
        super(verticles);
        this.radius = radius;
    }


    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }


    public double getArea() {

        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                ", radius=" + radius +
                '}';
    }
}
