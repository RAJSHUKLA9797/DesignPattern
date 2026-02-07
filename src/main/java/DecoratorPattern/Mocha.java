package DecoratorPattern;

public class Mocha extends Decorator{
    //this Beverage will be wrapped by Mocha
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return (this.beverage.getDescription()+ ", Mocha");
    }

    @Override
    public double getCost() {
        return( this.beverage.getCost()+0.99);
    }
}
