package basic.java_cursor.education.shape;

public abstract class Shape {

    private Vertex[] verticles;

    public Shape(Vertex[] verticles) {
        this.verticles = verticles;
    }

    public Vertex[] getVerticles() {
        return verticles;
    }

    public void setVerticles(Vertex[] verticles) {
        this.verticles = verticles;
    }


    public abstract double SegmentLine();


    public double SegmentLine(Vertex a, Vertex b){
        return 0;
    };
}
