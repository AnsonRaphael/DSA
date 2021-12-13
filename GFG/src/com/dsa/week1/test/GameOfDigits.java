package com.dsa.week1.test;

public class GameOfDigits {
    public static void main(String[] args) {
        long n=26;
        System.out.println(smallestK(n));

    }
    static String smallestK(long n) {
        // Write your code here
        int[] frq=new int[10];
        if(n<10)
            return n+"";
        while (n>1){
            if(n%9==0){
                frq[9]+=1;
                n=n/9;
            }else if(n%8==0){
                frq[8]+=1;
                n=n/8;
            }else if(n%7==0){
                frq[7]+=1;
                n=n/7;
            }else if(n%6==0){
                frq[6]+=1;
                n=n/6;
            }else if(n%5==0){
                frq[5]+=1;
                n=n/5;
            }else if(n%4==0){
                frq[4]+=1;
                n=n/4;
            }else if(n%3==0){
                frq[3]+=1;
                n=n/3;
            }else if(n%2==0){
                frq[2]+=1;
                n=n/2;
            }else{
                break;
            }
        }
        if(n!=1){
            return "-1";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 2; i < frq.length; i++) {
            int m=0;
            while (m<frq[i]){
                sb.append(i);
                m++;
            }
        }

        return sb.toString();
    }


}

