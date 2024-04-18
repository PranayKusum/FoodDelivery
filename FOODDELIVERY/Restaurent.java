package FOODDELIVERY;

import java.util.*;
public class Restaurent {
    public static Scanner sc=new Scanner(System.in);
    protected double biryani(double bill){
        return bill*100;
    }    
    public double starter(int quantity){
        return quantity*200;
    }
}
