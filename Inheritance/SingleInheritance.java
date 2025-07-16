package Oops.Inheritance;
class UpperClass{
    String lass="Maths";
    public void writeit(){
        System.out.println(this.lass);
    }
}
public class SingleInheritance extends UpperClass {
    public static void main(String[] args){
        SingleInheritance obj1= new SingleInheritance();
        obj1.writeit();
    }
}
