package basic.java_cursor.education.shape.SpaceShape;

import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.Vertex;
import basic.java_cursor.education.shape.VolumeMeasurable;

import java.util.Arrays;

public class Cuboid extends SpaceShape implements VolumeMeasurable, AreaMeasurable {
    private double height;
    private double weight;
    private double depth;
    private double area;
    private double volume;

    public Cuboid(Vertex[] verticles, double height, double weight, double depth) {
        super(verticles);
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
                "height=" + height +
                ", weight=" + weight +
                ", depth=" + depth +
                ", area=" + area +
                ", volume=" + volume +
                '}';
    }

}
