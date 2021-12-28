package basic.java_cursor.education.shape.SpaceShape;

import basic.java_cursor.education.shape.Shape;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public abstract class SpaceShape extends Shape {
    Vertex3d a;
    Vertex3d b;
    private Vertex3d verticles;

    public SpaceShape(Vertex3d verticlesSS) {
        this.verticles = verticlesSS;
    }

    public Vertex3d getVerticles() {
        return verticles;
    }

    public void setVerticles(Vertex3d verticlesSS) {

        this.verticles = verticlesSS;
    }

    public double SegmentLine(Vertex3d a, Vertex3d b) {
        this.a = a;
        this.b = b;
        double length;
        length = sqrt(pow((a.getX() - b.getX()), 2) + pow((a.getY() - b.getY()), 2) + pow((a.getZ() - b.getZ()), 2));
        return length;
    }

}
