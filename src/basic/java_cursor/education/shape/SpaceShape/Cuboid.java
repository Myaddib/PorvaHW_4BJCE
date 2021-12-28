package basic.java_cursor.education.shape.SpaceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.VolumeMeasurable;

public class Cuboid extends SpaceShape implements VolumeMeasurable, AreaMeasurable {
    private final double height;
    private final double weight;
    private final double depth;
    private double area;
    private double volume;
    public Vertex3d verticles;

    public Cuboid(Vertex3d verticlesC, double height, double weight, double depth) {
        super(verticlesC);
        this.verticles = verticlesC;
        this.depth = depth;
        this.height = height;
        this.weight = weight;
    }


    public double getArea() {
        area = 2 * (weight * depth + weight * height + depth * height);
        return area;
    }


    public double getVolume() {
        volume = height * weight * depth;
        return volume;
    }

    @Override
    public String toString() {
        return "Cuboid{" +
                "vertex=" + verticles +
                "height=" + height +
                ", weight=" + weight +
                ", depth=" + depth +
                ", area=" + area +
                ", volume=" + volume +
                '}';
    }

}
