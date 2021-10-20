package ShapeFactory;

public class AbstractFactory{
    enum Colour{
        BLACK,
        WHITE
    }
    public static BaseFactory getFactory(String figureColour){
        Colour colour = Colour.valueOf(figureColour);
        BaseFactory baseFactory;
        switch(colour){
            case BLACK-> baseFactory = new BlackFactory();
            case WHITE-> baseFactory = new WhiteFactory();
            default -> throw new EnumConstantNotPresentException(Colour.class, colour.name());
        }
        return baseFactory;
    }
}