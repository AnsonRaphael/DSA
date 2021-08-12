package com.nanos.dsa.introduction.conditionals_loops;

public class Volume {
    public static void main(String[] args) {
        double r=10,l=10,h=10;
        System.out.println(" VolumePrism "+VolumePrism(l,h));
        System.out.println(" VolumeCone "+VolumeCone(l,h));
        System.out.println(" VolumeSphere "+VolumeSphere(r));
        System.out.println(" VolumeCylinder "+VolumeCylinder(l,h));
        System.out.println(" VolumePyramid "+VolumePyramid(r,l,h));

    }
    // base * height
    static double VolumePrism(double b,double h){
        return b*h;
    }
    static double VolumeCone(double r,double h){
        return 3.14*r*r*h/3;
    }
    static double VolumeSphere(double a){
        return 3.14*4*a*a*a/3;
    }
    static double VolumeCylinder(double r,double h){
        return 3.14*r*r*h;
    }
    static double VolumePyramid(double a,double r,double h){
        return a*r*h/3;
    }

}
