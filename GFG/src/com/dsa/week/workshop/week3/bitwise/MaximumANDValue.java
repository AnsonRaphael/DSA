package com.dsa.week.workshop.week3.bitwise;

public class MaximumANDValue {
    public static void main(String[] args) {
        int[] a = {4, 8, 12, 16};
        System.out.println(maxAndVal(a));
    }
    static int maxAndVal(int[] a){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                if(i!=j){
                    int t=a[i]&a[j];
                    if(t>max)
                        max=t;
                }
            }
        }
        return max;
    }

}
