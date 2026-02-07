package DecoratorPattern;

public class Whip extends Decorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return (this.beverage.getDescription()+ ", Whip");
    }

    @Override
    public double getCost() {
        return this.beverage.getCost()+0.75;
    }
}
