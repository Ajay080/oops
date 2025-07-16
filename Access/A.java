package Oops.Access;

public class A {
    // int num; // this is default access modifier, that means, in the different package it is not allowed
    // In the same package it is allowed to access

    /*
     * public means : we can access from anywhere
     * 
     * private means: within the class
     * 
     * protected means: If we only wanted to be accessed outside the package, if that
     * if that particular class is the subclass
     * --exception with packages
     * 
     * 
     * default means we cant access, from other package
     * we will use default or not modifier, when we dont want to use outside the package
     */
    String name;
    int[] arr;
    protected int num;
    public A(int num, String name){
        this.num=num;
        this.name=name;
        this.arr=new int[num];
    }
    public int getNum(){
        return num;
    }
    public void setName(String name){
        this.name=name;
    }

}
