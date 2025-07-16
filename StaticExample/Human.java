package Oops.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;

    //static belongs to the class, not to the objects

    //such properties which are not related to the objects but common to all the object of the class,
    //can be put as static just like here
    public Human(int age, String name, int salary, boolean married){
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
        //we can do the reference to the static, by using "this", (it will work, but its not good convention, because static should not associate with the objects)
        //as population is not related to any of the objects
        //so it can be referenced using the Class name, or directly "pupulation"
    }
}
