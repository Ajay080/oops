package Oops.Inheritance;
class First{
    void help(){
        System.out.println("I am giving an interview");
    }
}
class Second extends First{
    void Problem(){
        System.out.println("I am having an problem");
    }
}
class Third extends First{
    void Solution(){
        System.out.println("I have done the multilevel inheritance");
    }
}

public class Hierarchical {
    public static void main(String[] args){
        Third obj1= new Third();
        obj1.help();
        Second obj2= new Second();
        obj2.help();
        obj1.Solution();
    }
}
