package javaappexp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class JavaExample {
 
    public static void main(String args[]) {
        Scanner reader=new Scanner(System.in);
        double exam1 ,exam2,avg=0;
        System.out.print("1. exam  : ");
        exam1=reader.nextDouble();
        System.out.print("2. exam : ");
        exam2=reader.nextDouble();
        avg =(exam1+exam2)/2;
        System.out.println("your average : "+avg);
        
        if(avg>=50){
            System.out.println("you pass.");
        }
        else{
            System.out.println("you not pass.");
        }
    }
    
}
 
