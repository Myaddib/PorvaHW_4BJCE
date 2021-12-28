package basic.java_cursor.education.shape.SpaceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.VolumeMeasurable;

public class Sphere extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private final double radius;
    private double area;
    private double volume;
    public Vertex3d verticles;

    public Sphere(Vertex3d verticlesS, double radius) {
        super(verticlesS);
        this.verticles = verticlesS;
        setVerticles(verticles);
        this.radius = radius;
    }


    public double getArea() {
        area = 4 * Math.PI * radius * radius;
        return area;
    }


    public double getVolume() {
        volume = Math.PI * Math.pow(radius, 3) * 4 / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "vertex=" + verticles +
                "radius=" + radius +
                ", area=" + area +
                ", volume=" + volume +
                '}';
    }
}
