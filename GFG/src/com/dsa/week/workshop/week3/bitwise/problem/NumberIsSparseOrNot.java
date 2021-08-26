package com.dsa.week.workshop.week3.bitwise.problem;

public class NumberIsSparseOrNot {
    public static void main(String[] args) {
        int n=2;
        System.out.println(isSparse(n));
        System.out.println(isSparse1(n));
    }
    public static boolean isSparse(int n)
    {
        // Your code here
        boolean  foundprev1=false;
        while (n!=0){
            if((n&1)!=0){
                if(foundprev1){
                    return false;
                }else {
                    foundprev1=true;
                }
            }else {
                foundprev1=false;
            }
            n=n>>1;
        }
        return true;
    }
    public static boolean isSparse1(int n)
    {
        // Your code here

        return !((n&n>>1)>=1);
    }
}
