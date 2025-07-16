package Oops.Inheritance;

public class Box {

    double l;
    double b;
    double h;

    Box(){
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    //Square
    Box(double side){
        this.b=side;
        this.l=side;
        this.h=side;
    }

    //rectangle
    Box(double l, double b, double h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    //copy contructor
    Box(Box old){
        this.l=old.l;
        this.b=old.b;
        this.h=old.h;
    }


    public void information(){
        System.out.println("Running the box");
    }

    
}


