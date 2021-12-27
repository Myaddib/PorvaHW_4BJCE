package basic.java_cursor.education.shape.PlanceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.PerimeterMeasurable;
import basic.java_cursor.education.shape.PlanceShape.PlanceShape;
import basic.java_cursor.education.shape.Vertex;

import java.util.Arrays;

public class Rectangle extends PlanceShape implements PerimeterMeasurable, AreaMeasurable {
    private double width;
    private double height;
    private double perimeter;
    private double area;

    public Rectangle(Vertex[] verticles, double height, double width) {
        super(verticles);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * (width + height);
        return perimeter;
    }

    @Override
    public double getArea() {
        area = width * height;
        return area;
    }

    @Override
    public String toString() {
        return "Rectangle{" + Arrays.toString(getVerticles()) + ", width= " + width + ", heiht=" + height + " ," +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }

    @Override
    public double SegmentLine(Vertex a, Vertex b) {
        return super.SegmentLine(a, b);
    }
}
