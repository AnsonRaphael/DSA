package com.dsa.week.workshop.week1.array.problems;

import java.util.ArrayList;

public class SubarrayWithGivenSum {
    public static void main(String[] args) {
        int arr[] = {1,2,3,7,5};
        int n=5, s=15;
        ArrayList<Integer> pos =subarraySum(arr,n,s);
        display(arr,pos);
    }

    private static void display(int[] arr,ArrayList<Integer> pos){
        for(int i=pos.get(0)-1;i<pos.get(1);i++)
            System.out.print(arr[i]+" ");
        System.out.println("");

    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> res = new ArrayList<>();
        int sum=0,inipos=0,finPos=-1;
        for (int i=0;i<n;i++){
            sum+=arr[i];

            if(sum>s){
              while(sum>s){
                  sum=sum-arr[inipos];
                  inipos++;
              }
            }

            if(sum==s){
                finPos=i;
                break;
            }

        }
        if(finPos==-1)
            res.add(-1);
        else{
            res.add(inipos+1);
            res.add(finPos+1);
        }

        return res;
    }
}
