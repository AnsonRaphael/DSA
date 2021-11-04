package com.nanos.dsa.arrays.searching.binaryleetcode;

public class ReachANumber {
    public static void main(String[] args) {
        int n=4; //3
        System.out.println(reachNumber(n));
    }

    public static int reachNumber(int target) {

        int abstra=Math.abs(target),step=0,sum=0;
        while (sum<abstra){
            step++;
            sum+=step;
        }
        while ((sum-abstra)%2!=0){
            step++;
            sum+=step;
        }
        return step;
    }


}
