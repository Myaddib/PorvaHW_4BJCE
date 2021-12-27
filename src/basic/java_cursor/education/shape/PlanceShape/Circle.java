package basic.java_cursor.education.shape.PlanceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.SpaceShape.SpaceShape;
import basic.java_cursor.education.shape.Vertex;
import basic.java_cursor.education.shape.VolumeMeasurable;

import java.util.Arrays;

public class Circle extends SpaceShape implements VolumeMeasurable, AreaMeasurable {

    private double perimeter;
    private double area;
    private double radius;

    public Circle(Vertex[] verticles, double radius) {
        super(verticles);
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    @Override
    public double getArea() {

        area = Math.PI * radius * radius;
        return area;
    }

    @Override
    public double SegmentLine() {
        return 0;
    }

    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public String toString() {
        return "Circle{" + Arrays.toString(getVerticles()) + "," + radius + " /" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
