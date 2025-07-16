package Oops.Inheritance;
//In inheritance base class has the access to the properties of its own as well as of its base class

class Box1{
    double l;
    double b;
    double h;
    Box1(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    //Square
    Box1(double side){
        this.b=side;
        this.l=side;
        this.h=side;
    }

    //rectangle
    Box1(double l, double b, double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    //copy contructor
    Box1(Box1 old){
        this.l=old.l;
        this.b=old.b;
        this.h=old.h;
    }
}
class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight=-1;
    }

    public BoxWeight(double l, double b, double h, double w){
        super(l,b,h); //super key words always initialize the first
        this.weight=w;
    }

    BoxWeight(BoxWeight old){
        super(old);
        this.weight=old.weight;
    }
}

public class Inheritance {
    public static void main(String [] args){
        Box box= new Box(2.3, 5.2, 4.5);
        System.out.println(box.l+" "+box.b+" "+box.h);

        Box box1= new Box(3.3);
        System.out.println(box1.l+" "+box1.b+" "+box1.h);

        Box box2= new BoxWeight(0, 0, 0, 0);
        //if we are creating the reference of super class and calling object of the base class
        // System.out.println(box2.weight); we can only access to those objects which are defined in the super class
        System.out.println("Referce of the Base class and object is of the child class "+box2.l);


        //we can not go opposite to the heorarchy, because parent class doesnot know, what are the variable
        //child class is having
        //it only has the access of its own
        // so we cannot create the referce of child class and creating the object of the base class,
        //we can not do that

        /* Kunal kushwaha explaination 
         * There are many variables in both parent and child classes
         * You are given access to variables that are in the ref type i.e. Box Weight
         * Hence, you should have access to the weight variable
         * this also means, that the ones you are trying to access, should be initialized
         * but here, when the obj itself is of type parent class, how will you call the constructor of the child class
         * this is why error
         * BoxWeight box3= new Box1(2,3,4);
        */

        

    }
}
