package basic.java_cursor.education.shape.SpaceShape;


import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.Vertex;
import basic.java_cursor.education.shape.VolumeMeasurable;

public class SquarePyramid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private final double baseWidth;
    private final double baseHeight;
    private double volume;
    private double area;

    public SquarePyramid(Vertex[] verticles, double baseHeight, double baseWidth) {
        super(verticles);
        this.baseHeight = baseHeight;
        this.baseWidth = baseWidth;
    }


    public double getArea() {
        area = Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(baseHeight, 2)) * baseWidth;
        return area;
    }


    public double getVolume() {
        volume = baseWidth * baseWidth * baseHeight / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "SquarePyramid{" +
                "baseWidth=" + baseWidth +
                ", baseHeight=" + baseHeight +
                ", volume=" + volume +
                ", area=" + area +
                '}';
    }
}
