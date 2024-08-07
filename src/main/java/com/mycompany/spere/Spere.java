package com.mycompany.spere;
import java.util.*;
public class Spere {
    public static double volume(double radius){
        double volume=((double)4/3)*3.14*(radius*radius);
        return volume;
    }
    
    public static double surface(double radius){
        double surface = 4*3.14*(radius*radius);
        return surface;
    }
    public static void main(String[] args) {
        System.out.print("Please enter the Spere radius");
        Scanner sc = new Scanner(System.in);
        double radius = sc.nextDouble(); 
        
        double volume= volume(radius);
        double surface= surface(radius);
        System.out.println("The volume of the Spere: "+volume+"\nThe surface of the Spere: "+surface);
    }
}
