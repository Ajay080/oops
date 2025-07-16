package Oops.Access;

public class Subclass extends A{
    public Subclass(int num, String name){
        super(num,name);
    }
    public static void main(String[] args){
        Subclass obj= new Subclass(3,"Ajay");
        int n=obj.num; // we can access the protected member
    }
}
