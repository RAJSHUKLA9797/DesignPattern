package StrategyPattern;

public class MallarDuck extends Duck{
    public MallarDuck(){
        this.flyingBehaviour = new RealFly();
        this.quackBehaviour = new RealQuack();
    }


}
