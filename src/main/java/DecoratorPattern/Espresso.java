package DecoratorPattern;

public class Espresso extends Beverage{
    public Espresso(Size size){
        description = "Espresso";
        this.size = size;
    }
    @Override
    public double getCost() {
        switch(size){
            case TALL -> {
                return 1.5;
            }
            case GRANDE -> {
                return 2.5;
            }
            case VENTI -> {
                return 3.5;
            }
            default -> {
                return 0;
            }
        }
    }

}
