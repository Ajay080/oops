package Oops;

//  Class is group of property or functions, or as the boiler
//  template like in real world: Class like car has different properties
//  like engine, price, seats.
// And companies use these class like a template, that each of the car should have those things, but
// different values: these thing have different value;

// Another example is like human body have a class, which demonstrate various template with properties like like, node, leg ,etc
//that is called an template of an object

//When an object that is the instance of the class, which have the same properties but may have different values


// classes are just like the logical construct, where as object is the physical reality that occupies space in the memory


//objects are stored in the heap memory and reference variable are store int the stack memory
//primitive data type are stored in the stack memory, that's why we dont use new, as it is not required to create the objects 

import java.util.*;
import java.io.*;
class Student{
        int rollno;
        String name;
        float marks;

        // we need a way to add the values of the above
        //properties object by object

        // we need one word to access every object, because we can write constructor for every object
        
        // "this" represent an object, we cant use it in inside of static openly
        // so we use "this" key word, 
        //which indirect mean that for this particular object we need to assign these, Like 
        //in short Student1.rollno=13 is same as this.rollno=13
        Student(){
            this.rollno=13;
            this.name="Ajay";

            this.marks=23;

        }
        Student(String name){
            this.name=name;
        }

        void greeting(){
            System.out.println("Hello my name is"+this.name);
        }

        // In java we can not manually, delete the object or free the memory when to do, java does by itself,
        // But we can set What should be happened when an object is destroyed, or memory gets freed
        //using finalize key word, evey class has one and single finalize function
        @Override
        protected void finalize() throws Throwable{
            System.out.println("Object is destroyed");
        }
    }
public class KunalOOP1 {

    public static void main(String args[]){

        Student student1; // declaring reference of an object of class type Student
        // System.out.println(student1); 
        Student[] students=new Student[5];// new operate dynamically allocate the memory and returns a reference variable to it.
        // All class objects in java should be allocated dynamically, when the program is running, then only space is allocated
        // variable that we are declaring inside the object is located in the heap memory, where as object is the stack memory
        

        //here "students" is the reference variable pointing to the object


        // new create the object and dynamically memory allocation

        //constructor defines what happen when an object has been created.
        //constructor is a special function, that run when we create an object and allocate some variables.

        System.out.println(Arrays.toString(students));

        Student student2=new Student();
        student2.greeting();

        //How garbage collector works
        Student garbage;
        //i<10000 it wiil not call the finalize method, 
        // but if we put 10000000 that create big load on the memory, then garbage collection will start to work
        for(int i=0;i<100000000;i++){
            garbage=new Student("Aj");
        }
    }
}
