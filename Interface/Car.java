package Oops.Interface;
//Conflict resolution in multiple Inheritance also resolves
// Here it does not fall into the ambiguity
// because it is defining its own body here

//so which paritcular method needed to executed, is decided
//on run time

//Greatest Advantages: Two classes which are totally unrealted to each other can be implemented with same interface


//Interface also extend each other

public class Car implements Brake, Engine, Media{
    @Override
    public void brake(){
        System.out.println("I brake like a normal Car");
    }

    @Override
    public void stop(){
        System.out.println("I stop engine like a normal Car");
    }

    @Override
    public void start(){
        System.out.println("I start engine like a normal Car");
    }

    @Override
    public void acc(){
        System.out.println("I accelerate like a normal Car");
    }
}
