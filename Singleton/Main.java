package Oops.Singleton;
//singleton is a class that you only create one object

// if we only want to create one object, so you should not allow
//any one to call the constructor

// the goal is to create only one instance
class Singleton {
    private Singleton(){
        System.out.println("hemlp");
    }

    private static Singleton instance;

    public static Singleton getInstance(){
        // check whether one object is created or not
        if(instance==null){
            instance= new Singleton();
        }
        return instance;
    }
}
public class Main {
    public static void main(String[] args){
        // Singleton obj1= new Singleton(); here the constructor is not visible

        Singleton obj1= Singleton.getInstance();
        Singleton obj2= Singleton.getInstance();
        Singleton obj3= Singleton.getInstance();
        Singleton obj4= Singleton.getInstance();

        //here all 4 refernce variable are pointing to just one object variable
        //since you ar enot allowed to call the constructor, you will not allowed to call new objects
    }
    
}
