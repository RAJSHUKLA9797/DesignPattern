package DecoratorPattern;

//this is the abstract class beverage
public abstract class Beverage {
    String description = "no description for this class as this is abstract";

    public String getDescription(){
        return description;
    }
    public abstract double getCost();
}
