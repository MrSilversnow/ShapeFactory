package ShapeFactory;

public class WhiteFactory extends BaseFactory{
    public Circle createCircle(double r){
        return new WhiteCircle(r);
    }
    public Triangle createTriangle(double s1, double s2, double s3){
        return new WhiteTriangle(s1, s2, s3);
    }
}