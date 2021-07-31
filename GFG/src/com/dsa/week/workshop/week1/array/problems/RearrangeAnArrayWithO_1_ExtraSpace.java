package com.dsa.week.workshop.week1.array.problems;

public class RearrangeAnArrayWithO_1_ExtraSpace {
    public static void main(String[] args) {
     int  n = 5;
     long  arr[] = {4,0,2,1,3};
     arrange(arr,n);
     display(arr);
    }
    static void arrange(long arr[], int n)
    {
        // your code here
        // set a=a+b*n
        for (int i=0;i<n;i++){
            arr[i]+=(arr[(int) arr[i]])%n*n;
        }
        //b=(a+b*n)/n
        for(int i=0;i<n;i++){
            arr[i]=(arr[i]/n);
        }
    }
    private static void display(long[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }
}
