package ShapeFactory;

public class ShapeFactoryMain{
    public static void main(String[] args){
        System.out.println("It's a demonstration case of ShapeFactory task.\n");

        System.out.println("Creating special factories for black and white colours...");
        BaseFactory blackFactory = AbstractFactory.getFactory("BLACK");
        BaseFactory whiteFactory = AbstractFactory.getFactory("WHITE");
        System.out.println("Success!\n");

        System.out.println("Lets create some figures.\n");
        System.out.println("Creating: white circle with radius 8...");
        Circle whiteCircle = whiteFactory.createCircle(8);
        System.out.println("Success!\n");
        System.out.println("Creating: black circle with radius 7...");
        Circle blackCircle = blackFactory.createCircle(7);
        System.out.println("Success!\n");
        System.out.println("Creating: white triangle with sides 6, 5, 4...");
        Triangle whiteTriangle = whiteFactory.createTriangle(6, 5, 4);
        System.out.println("Success!\n");
        System.out.println("Creating: black triangle with sides 3, 2.5, 2...");
        Triangle blackTriangle = blackFactory.createTriangle(3, 2.5, 2);
        System.out.println("Success!\n");

        System.out.println("Lets check information about our figures.\n");
        System.out.println("Dealing with white circle...");
        whiteCircle.getArea();
        whiteCircle.getPerimeter();
        whiteCircle.getRadius();
        whiteCircle.getColour();
        System.out.println("Success!\n");
        System.out.println("Dealing with black circle...");
        blackCircle.getArea();
        blackCircle.getPerimeter();
        blackCircle.getRadius();
        blackCircle.getColour();
        System.out.println("Success!\n");
        System.out.println("Dealing with white triangle...");
        whiteTriangle.getArea();
        whiteTriangle.getPerimeter();
        whiteTriangle.getSides();
        whiteTriangle.getColour();
        System.out.println("Success!\n");
        System.out.println("Dealing with white triangle...");
        whiteTriangle.getArea();
        whiteTriangle.getPerimeter();
        whiteTriangle.getSides();
        whiteTriangle.getColour();
        System.out.println("Success!\n");
        System.out.println("Dealing with black triangle...");
        blackTriangle.getArea();
        blackTriangle.getPerimeter();
        blackTriangle.getSides();
        blackTriangle.getColour();
        System.out.println("Success!\n");

        System.out.println("End demonstration...");
    }
}