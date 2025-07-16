package Oops.extendDemo;

//classes to interface we need, implement

//Interface, to Interface we need extends
public class Main implements B{
    // if we implement both, we have to define both the properties
    
    @Override
    public void greet(){
        System.out.println("I am inside greet Implements");
    }

    @Override
    public void fun(){
        System.out.println("I am inside fun Implements");
    }
}
