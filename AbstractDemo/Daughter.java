package Oops.AbstractDemo;

public class Daughter extends Parent {
    Daughter(int age){
        super(age);
        this.age=age;
    }
    @Override
    void career(String name){
        System.out.println("I am going to be a "+name);
    }
    @Override
    void partner(String name, int age){
        System.out.println("I love "+name+" He is "+age);
    }
    public static void main(String[] args) {
        Son obj= new Son(18);
        obj.career("Engineering");
        obj.partner("Vidushi",23);


        Daughter obj1= new Daughter(19);
        obj1.career("Doctor");
        obj1.partner("Ajay",21);
    }
}
