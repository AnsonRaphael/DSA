package com.nanos.dsa.introduction.conditionals_loops;

public class Area {
    public static void main(String[] args) {
        double r=10,l=10,h=10;
        System.out.println(" AreaCircle "+AreaCircle(r));
        System.out.println(" AreaTriangle "+AreaTriangle(l,h));
        System.out.println(" AreaRectangle "+AreaRectangle(l,h));
        System.out.println(" AreaIsoscelesTriangle "+AreaIsoscelesTriangle(l,h));
        System.out.println(" AreaParallelogram "+AreaParallelogram(l,h));
        System.out.println(" AreaRhombus "+AreaRhombus(l,h));
        System.out.println(" AreaEquilateralTriangle "+AreaEquilateralTriangle(r));
        System.out.println(" AreaCurvedCylinder "+AreaCurvedCylinder(l,h));
        System.out.println(" AreaCube "+AreaCube(r));

    }
    static double AreaCircle(double r){
        return 3.14*r*r;
    }
    static double AreaTriangle(double l,double b){
        return 0.5*l*b;
    }
    static double AreaRectangle(double l,double h){
        return l*h;
    }
    static double AreaIsoscelesTriangle(double a,double b){
        return 0.5*(Math.sqrt((a*a)-(b*b/4)))*b;
    }
    static double AreaParallelogram(double l,double h){
        return l*h;
    }
    // .5 * diagonal product
    static double AreaRhombus(double d1,double d2){
        return 0.5*d1*d2;
    }
    static double AreaEquilateralTriangle(double a){
        return a*a*Math.sqrt(3)/4;
    }
    static double AreaCurvedCylinder(double r,double h){
        return 2*3.14*r*h;
    }
    static double AreaCube(double a){
        return 6*a*a;
    }
}
