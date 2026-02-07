package DecoratorPattern;


public class CoffeeShopMain {
    public static void main(String []args){
        //first lets get a concrete bevergage then we will wrap it with decorators
        Espresso espresso = new Espresso();

        System.out.println(espresso.getCost());
        System.out.println(espresso.getDescription());

//        espresso = new Mocha(espresso);// wrong we need to program to abstract not subtype

        Beverage espresso1 = new Espresso();

        System.out.println(espresso1.getCost());
        System.out.println(espresso1.getDescription());

        espresso1 = new Mocha(espresso1);
        espresso1 = new Mocha(espresso1);
        espresso1 = new Whip(espresso1);

        System.out.println(espresso1.getCost());
        System.out.println(espresso1.getDescription());


    }
}
