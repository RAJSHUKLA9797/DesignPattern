package StrategyPattern;

public class RealQuack implements QuackBehaviour{
    @Override
    public void quack() {
        System.out.println("This can Quack in real");
    }
}
