package basic.java_cursor.education.shape.PlanceShape;

import basic.java_cursor.education.shape.Shape;
import basic.java_cursor.education.shape.Vertex;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class PlanceShape extends Shape {
     Vertex a;
     Vertex b;

    public PlanceShape(Vertex[] verticles) {
        super(verticles);
    }

    @Override
    public double SegmentLine() {
        return 0;
    }

    @Override
    public double SegmentLine(Vertex a, Vertex b) {
        this.a = a;
        this.b = b;
        double length;
        length = sqrt(pow((a.getX() - b.getX()), 2) + pow((a.getY() - b.getY()), 2));
        return length;
    }

}