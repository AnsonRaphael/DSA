package com.dsa.week.workshop.week1.mathematics.problems;

import java.util.ArrayList;

public class QuadraticEquationRoots {
    public static void main(String[] args) {
       int a = -264  ;
        int b = -750 ;
        int  c = 504;
        System.out.println(quadraticRoots(a,b,c));
    }
    public static ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        if(((b*b)-(4*a*c))<0){
            res.add(-1);
            return res;
        }
        if((int) Math.floor((-b/(2.0*a))+Math.sqrt((b*b)-(4*a*c))/(2.0*a))>(int) Math.floor((-b/(2.0*a))-Math.sqrt((b*b)-(4*a*c))/(2.0*a))){
            res.add((int) Math.floor((-b/(2.0*a))+Math.sqrt((b*b)-(4*a*c))/(2.0*a)));
            res.add((int) Math.floor((-b/(2.0*a))-Math.sqrt((b*b)-(4*a*c))/(2.0*a)));
        }else{
            res.add((int) Math.floor((-b/(2.0*a))-Math.sqrt((b*b)-(4*a*c))/(2.0*a)));
            res.add((int) Math.floor((-b/(2.0*a))+Math.sqrt((b*b)-(4*a*c))/(2.0*a)));
        }
        return res;
    }
}
