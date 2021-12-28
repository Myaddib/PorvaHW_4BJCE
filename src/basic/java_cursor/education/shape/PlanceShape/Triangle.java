package basic.java_cursor.education.shape.PlanceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.PerimeterMeasurable;

public class Triangle extends PlanceShape implements PerimeterMeasurable, AreaMeasurable {
    private double perimeter;
    private double area;
    public Vertex verticles1, verticles2, verticles3;

    public Triangle(Vertex verticlesT1, Vertex verticlesT2, Vertex verticlesT3) {
        super(verticlesT1);
        this.verticles1 = verticlesT1;
        this.verticles2 = verticlesT2;
        this.verticles3 = verticlesT3;
    }

    public double getPerimeter() {
        perimeter = 0;
        perimeter += SegmentLine(verticles1, verticles2);
        perimeter += SegmentLine(verticles2, verticles3);
        perimeter += SegmentLine(verticles3, verticles1);
        return perimeter;
    }


    public double getArea() {
        double p = perimeter / 2;
        area = Math.sqrt(p * (p - SegmentLine(verticles1, verticles2)) * (p - SegmentLine(verticles2, verticles3)) * (p - SegmentLine(verticles3, verticles1)));
        return area;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                ", vertex1=" + verticles1 +
                ", vertex2=" + verticles2 +
                ", vertex3=" + verticles3 +
                "perimeter=" + perimeter +
                ", area=" + area +

                '}';
    }
}
