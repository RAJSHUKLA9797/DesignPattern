package StrategyPattern;


//Duck is an abstract class, and all the ducks (mallard duck,or rubberDuck) etc will be subclass of this, further we have separeted the varying behaviours in another interfaces(kind of encapuslated them) like flying behaviour,or quack behaviour so that each duck would have a "HAS-a" relatiom with a behaviour not a "is a"
public class MainDuck {
    public static void main(String args []){
        MallarDuck mallarDuck = new MallarDuck();
        mallarDuck.fly();
        mallarDuck.quack();
    }
}
