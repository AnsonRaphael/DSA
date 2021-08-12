package com.nanos.dsa.introduction.conditionals_loops;

public class Armstrong {
    public static void main(String[] args) {
        int a=153,l=0,sum=0;
        int b=a,d=a;
        while (b!=0){
            b=b/10;
            l++;
        }
        while (d!=0){
            int c=d%10;
            d=d/10;
            sum+=power(c,l);
        }
        if(a==sum)
            System.out.println("yes");
        else
            System.out.println("No");
    }
    static int power(int x,int y){
        if(y==0)
            return 1;
        if(y%2==0)
            return power(x,y/2)*power(x,y/2);
        return x*power(x,y/2)*power(x,y/2);
    }
}
