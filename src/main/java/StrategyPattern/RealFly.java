package StrategyPattern;

public class RealFly implements FlyingBehaviour{

    @Override
    public void fly() {
        System.out.println("This can fly in real");
    }
}
