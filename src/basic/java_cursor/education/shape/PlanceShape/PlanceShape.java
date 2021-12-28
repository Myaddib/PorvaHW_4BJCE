package basic.java_cursor.education.shape.PlanceShape;

import basic.java_cursor.education.shape.Shape;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public abstract class PlanceShape extends Shape {
    private Vertex verticles;
    Vertex a;
    Vertex b;

    public PlanceShape(Vertex verticles) {

        this.verticles = verticles;
    }

    public Vertex getVerticles() {
        return verticles;
    }

    public void setVerticles(Vertex verticlesPS) {

        this.verticles = verticlesPS;
    }


    public double SegmentLine(Vertex a, Vertex b) {
        this.a = a;
        this.b = b;
        double length;
        length = sqrt(pow((a.getX() - b.getX()), 2) + pow((a.getY() - b.getY()), 2));
        return length;
    }

}
