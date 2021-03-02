package com.learn.algorithms.bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BubbleSort {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int[] arr= new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
          arr[i]=  Integer.parseInt(st.nextToken());
        }
        System.out.println(bubbleSort(arr));
    }

    public static int bubbleSort(int[] arr){
        int count = 0,n=arr.length;
        boolean swapped=true;
        while(swapped){
            swapped=false;
            count++;
            for(int i=0;i<n-1;i++){
                if(arr[i]>arr[i+1]){
                   int temp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
                    swapped=true;
                }
            }
        }
        return count;
    }
}
