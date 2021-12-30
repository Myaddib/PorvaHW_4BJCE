package basic.java_cursor.education.shape;

import basic.java_cursor.education.shape.PlanceShape.Circle;
import basic.java_cursor.education.shape.PlanceShape.Rectangle;
import basic.java_cursor.education.shape.PlanceShape.Triangle;
import basic.java_cursor.education.shape.PlanceShape.Vertex;
import basic.java_cursor.education.shape.SpaceShape.Cuboid;
import basic.java_cursor.education.shape.SpaceShape.Sphere;
import basic.java_cursor.education.shape.SpaceShape.SquarePyramid;
import basic.java_cursor.education.shape.SpaceShape.Vertex3d;

public class StartShape {

    private void init() {
        Vertex vertexCircle = new Vertex(10, 7);

        Circle circle = new Circle(vertexCircle, 4);
        circle.getArea();
        circle.getPerimeter();

        // масив з трьох вершин, використовується для трикутника

        Triangle triangle = new Triangle(new Vertex(2, 3), new Vertex(-1, 0), new Vertex(-5, 6));
        triangle.getPerimeter();
        triangle.getArea();


        Rectangle rectangle = new Rectangle(new Vertex(1, 2), 4, 6);
        rectangle.getArea();
        rectangle.getPerimeter();

        Vertex3d vertex3d = new Vertex3d(10, 7, 4);
        SquarePyramid squarePyramid = new SquarePyramid(vertex3d, 4, 6);
        squarePyramid.getArea();
        squarePyramid.getVolume();

        Cuboid cuboid = new Cuboid(vertex3d, 5, 5, 5);
        cuboid.getArea();
        cuboid.getVolume();

        Sphere sphere = new Sphere(vertex3d, 6);
        sphere.getArea();
        sphere.getVolume();


        Shape[] figures = new Shape[6];
        figures[0] = triangle;
        figures[1] = circle;
        figures[2] = rectangle;

        figures[3] = squarePyramid;
        figures[4] = cuboid;
        figures[5] = sphere;


        for (
                int i = 0;
                i < figures.length; i++) {
            System.out.println(figures[i]);
        }

    }

    public void startShepe() {
        init();


    }
}
