package Oops.LamdaFunction;

import java.io.*;
import java.util.*;

public class LambdaFunctions {
    public static void main(String[] args){
        ArrayList<Integer> arr= new ArrayList<>();
        for(int i=0;i<5;i++){
            arr.add(i+1);
        }
        //lambda is an inline function
        // arr.forEach((item)->System.out.println(item*2));
    }
}
