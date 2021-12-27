package basic.java_cursor.education.shape.SpaceShape;

import basic.java_cursor.education.shape.Shape;
import basic.java_cursor.education.shape.Vertex;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public abstract class SpaceShape extends Shape {
    Vertex a;
    Vertex b;

    public SpaceShape(Vertex[] verticles) {
        super(verticles);
    }

    @Override
    public double SegmentLine(Vertex a, Vertex b) {
        this.a = a;
        this.b = b;
        double length;
        length = sqrt(pow((a.getX() - b.getX()), 2) + pow((a.getY() - b.getY()), 2)+pow((a.getZ() - b.getZ()), 2));
        return length;
    }

}
