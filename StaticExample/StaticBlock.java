package Oops.StaticExample;

public class StaticBlock {
    static int a=5;
    static int b;

    // will only run once, when the first time, class object get called
    // StaticBlock can be used to set the static object
    static{
        System.out.println("I am in static block");
        b=a*5;
    }

    public static void main(String [] args){
        StaticBlock obj= new StaticBlock();
        System.out.println(a+" "+b);

        b=3*a;

        System.out.println(a+" "+b);

        StaticBlock obj1= new StaticBlock();
        System.out.println(a+" "+b);


    }
}
