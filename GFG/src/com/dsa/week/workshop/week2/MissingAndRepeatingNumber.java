package com.dsa.week.workshop.week2;

public class MissingAndRepeatingNumber {
    public static void main(String[] args) {
        int arr[]={2, 3, 1, 2, 5};
        int missing=0,repeating=0;
        for (int i=0;i< arr.length;i++){

            int x=arr[Math.abs(arr[i])-1];
            if(x<0){
                repeating=Math.abs(arr[i]);
            }
            arr[Math.abs(arr[i])-1]=-Math.abs(arr[Math.abs(arr[i])-1]);

        }
        for (int i=0;i<arr.length;i++){
            if(arr[i]>0){
                missing=i;
            }
        }
        display(arr);

        System.out.println((missing+1)+" "+repeating);

    }
    private static void display(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }
}
