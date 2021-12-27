package basic.java_cursor.education.shape.SpaceShape;
import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.Vertex;
import basic.java_cursor.education.shape.VolumeMeasurable;

import java.util.Arrays;

public class Sphere extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private double radius;
    private double area;
    private double volume;

    public Sphere(Vertex[] verticles, double radius) {
        super(verticles);
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
                "radius=" + radius +
                ", area=" + area +
                ", volume=" + volume +
                '}';
    }
}
