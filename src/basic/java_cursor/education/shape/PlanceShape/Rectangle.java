package basic.java_cursor.education.shape.PlanceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.PerimeterMeasurable;
import basic.java_cursor.education.shape.Vertex;

public class Rectangle extends PlanceShape implements PerimeterMeasurable, AreaMeasurable {
    private final double width;
    private final double height;
    private double perimeter;
    private double area;

    public Rectangle(Vertex[] verticles, double height, double width) {
        super(verticles);
        this.height = height;
        this.width = width;
    }


    public double getPerimeter() {
        perimeter = 2 * (width + height);
        return perimeter;
    }


    public double getArea() {
        area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                ", perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
