package ShapeFactory;

public class BlackCircle extends Circle{
    public BlackCircle(double r){
        radius = r;
        colour = "BLACK";
    }
    public void getArea(){
        double area = Math.PI * radius * radius;
        System.out.println("Black circle area is " + area);
    }
    public void getPerimeter(){
        double perimeter = 2 * Math.PI * radius;
        System.out.println("Black circle perimeter is " + perimeter);
    }
    public void getRadius(){
        System.out.println("Black circle radius is " + radius);
    }
    public void getColour(){
        System.out.println("Black circle colour is black");
    }
}