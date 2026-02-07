package DecoratorPattern;

//this is the abstract class beverage
public abstract class Beverage {

    public enum Size {TALL, GRANDE, VENTI};
    Size size = Size.GRANDE;//default size
    public void setSize(Size size){
        this.size = size;
    }
    public Size getSize(){
        return this.size;
    }
    String description = "no description for this class as this is abstract";

    public String getDescription(){
        return description;
    }
    public abstract double getCost();
}
