package com.dsa.week.workshop.week3.string.problem;

public class RemainderWith7 {
    public static void main(String[] args) {
        String str="51525555495150565657515456565352495549";
        System.out.println(remainderWith7(str));
        System.out.println((51525555495150565657515456565352495549.0)%7);
    }
    static int remainderWith7(String num)
    {
        // Your code here

        //num=reverse(num);
        int carry=0;
        for (int i=0;i<num.length();i++){
            int a= num.charAt(i)-'0';
            int rm=(a+carry*10)%7;
            carry=rm;

        }

        return carry;
    }
}
