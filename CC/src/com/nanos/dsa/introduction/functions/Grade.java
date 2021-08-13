package com.nanos.dsa.introduction.functions;

public class Grade {
    public static void main(String[] args) {
        int a=70;
        System.out.println(grade(a));
    }
    static String grade(int a){
        String c="";
        if(a<=100&&a>=91){
            c="AA";
        }else if (a<=90&&a>=81){
            c="AB";
        }else if (a<=80&&a>=71){
            c="BB";
        }else if (a<=70&&a>=61){
            c="BC";
        }else if (a<=60&&a>=51){
            c="CD";
        }else if (a<=50&&a>=41){
            c="DD";
        }else {
            c="Fail";
        }
        return c;


    }
}
