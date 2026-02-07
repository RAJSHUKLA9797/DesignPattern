package DecoratorPattern;

public class Whip extends Decorator{
    Beverage beverage;
    public Whip(Beverage beverage){
        this.beverage=beverage;
    }
    @Override
    public String getDescription() {
        return (this.beverage.getDescription()+ " " + this.beverage.getSize() + ", Whip");
    }

    @Override
    public double getCost() {
//        return( this.beverage.getCost()+0.99);
        switch (this.beverage.getSize()){
            case TALL -> {
                return this.beverage.getCost() +1.99;
            }
            case GRANDE -> {
                return this.beverage.getCost()+2.5;
            }
            case VENTI -> {
                return this.beverage.getCost()+3.5;
            }
            default -> {
                return this.beverage.getCost();
            }
        }
    }
}
