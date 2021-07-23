package com.dsa.week.workshop.week1.mathematics.problems;

public class ModularMultiplicativeInverse {
    public static void main(String[] args) {
        int a = 3;
        int m = 11;
        System.out.println(modInverse(a,m));
    }
    public static int modInverse(int a, int m)
    {
        int result=-1;
        //Your code here
        for (int i=1;i<m;i++){
            if((a*i)%m==1){
                result=i;
                break;
            }
        }
        return result;
    }
}
