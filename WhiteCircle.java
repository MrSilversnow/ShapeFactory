package ShapeFactory;

public class WhiteCircle extends Circle{
    public WhiteCircle(double r){
        radius = r;
        colour = "WHITE";
    }
    public void getArea(){
        double area = Math.PI * radius * radius;
        System.out.println("White circle area is " + area);
    }
    public void getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        System.out.println("White circle perimeter is " + perimeter);
    }
    public void getRadius(){
        System.out.println("White circle radius is " + radius);
    }
    public void getColour(){
        System.out.println("White circle colour is white");
    }
}