package DecoratorPattern;

public abstract class Decorator extends Beverage {
    Beverage beverage;

    public abstract String getDescription();// here we declare getDescription as abstract again as for concrete decorators we need to implement differene descriptions

    @Override
    public Size getSize() {
        return this.beverage.getSize();
    }
}
