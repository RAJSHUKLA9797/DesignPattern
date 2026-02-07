package StrategyPattern;

//Duck is an abstract class, and all the ducks (mallard duck,or rubberDuck) etc will be subclass of this, further we have separeted the varying behaviours in another interfaces(kind of encapuslated them) like flying behaviour,or quack behaviour so that each duck would have a "HAS-a" relatiom with a behaviour not a "is a"
public abstract class  Duck {
    FlyingBehaviour flyingBehaviour;
    QuackBehaviour quackBehaviour;

    public void fly(){
        flyingBehaviour.fly();
    }

    public void quack(){
        quackBehaviour.quack();
    }
}
