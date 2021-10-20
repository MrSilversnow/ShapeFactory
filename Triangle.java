package ShapeFactory;

public abstract class Triangle {
    protected double s1, s2, s3;
    protected String colour;

    public abstract void getArea();
    public abstract void getPerimeter();
    public abstract void getSides();
    public abstract void getColour();
}