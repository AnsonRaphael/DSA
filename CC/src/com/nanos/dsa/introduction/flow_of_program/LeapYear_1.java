package com.nanos.dsa.introduction.flow_of_program;

public class LeapYear_1 {
    public static void main(String[] args) {
        int year = 2000;
        System.out.println( isLeapYear(2000)? "Leap Year" :
                "Not a Leap Year" );
    }
    static boolean isLeapYear(long year){
        if(year%400==0)
            return true;
        else if (year%100==0)
            return false;
        else if (year%4==0)
            return true;
        else
            return false;
    }
}
