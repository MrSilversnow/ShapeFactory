package ShapeFactory;
// maybe use interface against abstract class?
public abstract class BaseFactory {
    public abstract Circle createCircle(double r);
    public abstract Triangle createTriangle(double s1, double s2, double s3);
}