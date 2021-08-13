package com.nanos.dsa.introduction.functions;

public class AreaCirc {
    public static void main(String[] args) {
        double r=10;
        System.out.println(" AreaCircle "+AreaCircle(r));
        System.out.println(" Circumference "+Circumference(r));


    }
    static double AreaCircle(double r){
        return 3.14*r*r;
    }
    static double Circumference(double r){
        return 3.14*2*r;
    }
}
