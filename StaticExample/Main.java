package Oops.StaticExample;

public class Main {
    public static void main(String[] args){
        Human Kunal=new Human(22,"Kunal Singh", 1000, false);
        Human Ajay=new Human(22,"Ajay Singh", 1000, true);
        System.out.println(Human.population);
        System.out.println(Human.population);

        // we know that we can call only static method inside the static function

    }

    // this is not dependent on objects
    // this does not belong to some instance
    static void fun(){
        // greeting(); // you cant use this because it requires an instances
        //but the function you are using it in does not depend on instances

        //you cannot access non static stuff without referencing their instance in
        //a static context

        //hence , here I am referncing it.
        Main obj= new Main();
        obj.greeting();


    }

    // we know that something which is not static, belongs to an object
    //this belong to some instance
    void greeting(){
        System.out.println("Hello world");
    }
}
