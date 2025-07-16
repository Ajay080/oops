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
class Third extends Second{
    void Solution(){
        System.out.println("I have done the multilevel inheritance");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args){
        Third obj1= new Third();
        obj1.help();
        obj1.Problem();
        obj1.Solution();
    }
}
