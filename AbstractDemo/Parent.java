package Oops.AbstractDemo;

// every child class have to override all the non
//declared body abstract methods


//we cant have final abstract methods, because we wnat it to be inherited
abstract public class Parent {
    int age;

    final int val;// we have to define it only one time
    //we can also have static variable also
    
    public Parent(int age){
        this.age= age;
        this.val=age;
    }
    
    static void hello(){
        System.out.println("Hey I am static method inside the Abstract classes");
    }

    static void normal(){
        System.out.println("this is a normal method");
    }

    abstract void career(String name);
    abstract void partner(String name, int age);

}


//what is the use case of Abstract class:
/* 

Those function which needs to be overridden, just make them
abstract class

we cannot create constructors with abstract keywords

we cannot create objects of abstract classes

// we cannot create static abstract methods inside the abstract class
because abstract methods needed to be overridden
but we can make static methods inside the abstract class

*/