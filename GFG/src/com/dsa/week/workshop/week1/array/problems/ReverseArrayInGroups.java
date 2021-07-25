package com.dsa.week.workshop.week1.array.problems;

import java.util.ArrayList;
import java.util.List;

public class ReverseArrayInGroups {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(List.of(5,6,8,9));
        int N=4,k=3;
        reverseInGroups3(arr,N,k);
        display(arr);
    }
    static void  reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>(n);
        int prev=0,next=k-1;
        while (prev<arr.size()){
            int previn=prev,nexin=next;

           while (previn<nexin){
               int pn=arr.get(previn);
               int nn=arr.get(nexin);
               arr.remove(previn);
               arr.add(previn,nn);
               arr.remove(nexin);
               arr.add(nexin,pn);
               previn++;
               nexin--;
           }
          prev+=k;
          next+=k;
          if(prev>=arr.size())
              break;
          if(next>=arr.size())
              next=arr.size()-1;

        }

        System.out.println(arr);

    }
    private static void display(ArrayList<Integer> arr){
        for(int i=0;i<arr.size();i++)
            System.out.print(arr.get(i)+" ");
        System.out.println("");

    }

    static void  reverseInGroups1(ArrayList<Integer> arr, int n, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>(n);
        int prev=0,next=k-1;
        while (prev<arr.size()){
            int previn=prev,nexin=next;

            for (int i=nexin;i>=previn;i--){
                result.add(arr.get(i));
            }
            prev+=k;
            next+=k;
            if(prev>=arr.size())
                break;
            if(next>=arr.size())
                next=arr.size()-1;

        }
        arr.clear();
        for(int i=0;i<result.size();i++){
            arr.add(result.get(i));
        }
        System.out.println(arr);

    }
    static void  reverseInGroups2(ArrayList<Integer> arr, int n, int k) {
        // code here
        ArrayList<Integer> result = new ArrayList<>(n);
        int prev=0,next=k-1;
        while (prev<arr.size()){
            int previn=prev,nexin=next;

            while (previn<nexin){
                int pn=arr.get(previn);
                int nn=arr.get(nexin);
                arr.set(previn,nn);
                arr.set(nexin,pn);
                previn++;
                nexin--;
            }
            prev+=k;
            next+=k;
            if(prev>=arr.size())
                break;
            if(next>=arr.size())
                next=arr.size()-1;

        }

        System.out.println(arr);

    }
    static void  reverseInGroups3(ArrayList<Integer> arr, int n, int k) {
        // code here

        int prev=0,next=k-1;
        for(int i=0;i<n;i+=k){
            prev=i;next=i+k-1;
            if(next>=n)
                next=n-1;
            while (prev<next){
                int t=arr.get(prev);
                arr.set(prev,arr.get(next));
                arr.set(next,t);
                next--;
                prev++;
            }
        }

        System.out.println(arr);

    }


}
