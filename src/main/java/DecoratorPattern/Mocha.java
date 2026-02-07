package DecoratorPattern;

public class Mocha extends Decorator{
    //this Beverage will be wrapped by Mocha
    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public String getDescription() {
        return (this.beverage.getDescription()+" "+ this.beverage.getSize() + ", Mocha");
    }

    @Override
    public double getCost() {
//        return( this.beverage.getCost()+0.99);
        switch (this.beverage.getSize()){
            case TALL -> {
                return this.beverage.getCost() +0.99;
            }
            case GRANDE -> {
                return this.beverage.getCost()+1.5;
            }
            case VENTI -> {
                return this.beverage.getCost()+2.5;
            }
            default -> {
                return this.beverage.getCost();
            }
        }
    }
}
