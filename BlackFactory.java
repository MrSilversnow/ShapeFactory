package ShapeFactory;

public class BlackFactory extends BaseFactory{
    public Circle createCircle(double r){
        return new BlackCircle(r);
    }
    public Triangle createTriangle(double s1, double s2, double s3){
        return new BlackTriangle(s1, s2, s3);
    }
}