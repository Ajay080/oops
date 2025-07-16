package Oops.Singleton;
import Oops.Access.A;

public class SubClass extends A{
    public SubClass(int num, String name){
        super(num, name);
    }
    public static void main(String[] args) {
        SubClass obj = new SubClass(343,"sDJSFAJ");
        int n = obj.num;
    }
}
