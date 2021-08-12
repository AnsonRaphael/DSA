package com.nanos.dsa.introduction.conditionals_loops;

public class Perimeter {
    public static void main(String[] args) {
        double r=10,l=10,h=10;
        System.out.println(" PerimeterCircle "+PerimeterCircle(r));
        System.out.println(" PerimeterRectangle "+PerimeterRectangle(l,h));
        System.out.println(" PerimeterSquare "+PerimeterSquare(r));
        System.out.println(" PerimeterParallelogram "+PerimeterParallelogram(l,h));
        System.out.println(" PerimeterRhombus "+PerimeterRhombus(r));
        System.out.println(" PerimeterEquilateralTriangle "+PerimeterEquilateralTriangle(r));

    }
    static double PerimeterCircle(double r){
        return 3.14*2*r;
    }
    static double PerimeterRectangle(double l,double h){
        return 2*(l+h);
    }
    static double PerimeterSquare(double a){
        return 4*a;
    }
    static double PerimeterParallelogram(double l,double h){
        return 2*(l+h);
    }
    static double PerimeterRhombus(double a){
        return 4*a;
    }
    static double PerimeterEquilateralTriangle(double a){
        return 3*a;
    }
}
