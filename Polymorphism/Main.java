package Oops.Polymorphism;

public class Main {
    public static void main(String[] args){
        Shapes shape= new Shapes();
        Circle circle= new Circle();
        Square square= new Square();

        //compile time polymorphism, It happens only because of overloading
        

        // Run time polymorphism, It happen because of overriding
        // Circle c= new Shapes();// it will give error , as we can never create refernce of child and object of parent class;
        Shapes s=new Circle();
        s.area();
        // it will create the reference type of circle 
        //at compile time, but while running it is creating the objects of the parent class
    }
}
