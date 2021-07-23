package com.dsa.week.workshop.week1.mathematics.problems;

public class GPTerm {
    public static void main(String[] args) {
      int  A = 84;
        int  B = 87;
        int  N = 3;
        System.out.println(termOfGP(A,B,N));
    }
    public static double termOfGP(int A,int B,int N)
    {
        //Your code here
        if(N==1)
            return A;
        if(N==2)
            return B;
        if(A==0)
            return 0;
        double r=((double)B)/A;
        if(r==0)
            return 0;

        return  A * Math.pow(r,N-1);
    }
}
