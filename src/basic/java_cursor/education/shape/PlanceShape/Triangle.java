package basic.java_cursor.education.shape.PlanceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.PerimeterMeasurable;
import basic.java_cursor.education.shape.PlanceShape.PlanceShape;
import basic.java_cursor.education.shape.Vertex;

import java.util.Arrays;

public class Triangle extends PlanceShape implements PerimeterMeasurable, AreaMeasurable {
    private double perimeter;
    private double area;

    public Triangle(Vertex[] verticles) {
        super(verticles);
    }



    public double getPerimeter() {
        perimeter = 0;
        perimeter += SegmentLine(getVerticles()[0], getVerticles()[1]);
        perimeter += SegmentLine(getVerticles()[1], getVerticles()[2]);
        perimeter += SegmentLine(getVerticles()[0], getVerticles()[2]);
        return perimeter;
    }


    public double getArea() {
        double p = perimeter / 2;
        area = Math.sqrt(p * (p - SegmentLine(getVerticles()[0], getVerticles()[1])) * (p - SegmentLine(getVerticles()[1], getVerticles()[2])) * (p - SegmentLine(getVerticles()[0], getVerticles()[2])));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "perimeter=" + perimeter +
                ", area=" + area +
                '}';
    }
}
