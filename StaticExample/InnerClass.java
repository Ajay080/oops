package Oops.StaticExample;

//we can not create upper class as static, otherwise, we were not able to create any
//instance to access the class, that is class object, as static are not belong to the objects
class Test{
    static String name;
    public Test(String name){
        Test.name=name;
    }

}

public class InnerClass {

    // we can declare Inner class as static
    //because they are dependent on other class, so the object can be created by that class to access those;

    // If inner class is not declared as static we need to create the object, by the object of upper class
    

    static class InnerTest{ // after adding static, this class object does not depends on the ipper class object
        String name;
        public InnerTest(String name){
            this.name=name;
        }
    }

    class InnerWithoutStatic{
        String name;
        public InnerWithoutStatic(String name){
            this.name=name;
        }
    }
    public static void main(String[] args){
        Test a=new Test("Kunal");
        Test b=new Test("Rahul");

        System.out.println(a.name); // both of them will show rahul only
        System.out.println(b.name); 

        InnerTest c= new InnerTest("John");
        InnerTest d= new InnerTest("Ajay");
        System.out.println(c.name);
        System.out.println(d.name);

        ///now they are showing different, 
        // because static in the class means that they are not dependent on the upper class object
        // but they can have there different individual instance



    }
}
