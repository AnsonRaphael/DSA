package com.dsa.week.workshop.week1.array.problems;

public class RemoveDuplicateElementsFromSortedArray {
    public static void main(String[] args) {
        int [] arr= {2, 2, 2, 2, 2};

        int N=3;

        display(arr,remove_duplicate(arr,N));
    }
    static int  remove_duplicate(int A[],int N){
        // code here
        int pos=0;
        for(int i=0;i<N;i++){
            if(A[pos]!=A[i]){
                pos++;
                A[pos]=A[i];
            }
        }
        return pos+1;
    }
    private static void display(int[] arr,int N){
        for(int i=0;i<N;i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }
}
