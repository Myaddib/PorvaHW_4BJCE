package basic.java_cursor.education.shape.SpaceShape;


import basic.java_cursor.education.shape.AreaMeasurable;
import basic.java_cursor.education.shape.VolumeMeasurable;

public class SquarePyramid extends SpaceShape implements AreaMeasurable, VolumeMeasurable {
    private final double baseWidth;
    private final double baseHeight;
    private double volume;
    private double area;
    public Vertex3d verticles;

    public SquarePyramid(Vertex3d verticlesSP, double baseHeight, double baseWidth) {
        super(verticlesSP);
        verticles = verticlesSP;
        this.baseHeight = baseHeight;
        this.baseWidth = baseWidth;
    }


    public double getArea() {
        area = (baseWidth * 4 * Math.sqrt(Math.pow(baseWidth / 2, 2) + Math.pow(baseHeight, 2)) * 2) + baseWidth * baseWidth;
        return area;
    }


    public double getVolume() {
        volume = baseWidth * baseWidth * baseHeight / 3;
        return volume;
    }

    @Override
    public String toString() {
        return "SquarePyramid={" +
                "vertex=" + verticles +
                "baseWidth=" + baseWidth +
                ", baseHeight=" + baseHeight +
                ", volume=" + volume +
                ", area=" + area +
                '}';
    }
}
