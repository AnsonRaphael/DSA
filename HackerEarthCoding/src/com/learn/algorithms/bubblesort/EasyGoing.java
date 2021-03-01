package com.learn.algorithms.bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EasyGoing {

    public static void main(String[] args) throws IOException {
        int t,n,m;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        t=Integer.parseInt(st.nextToken());
        while(t>0){
            st = new StringTokenizer(br.readLine());

            n=Integer.parseInt(st.nextToken());
            m=Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
           int[] array = new int[n];
           for(int i=0;i<n;i++)
               array[i]=Integer.parseInt(st.nextToken());

           // sort the array - using bubble sort
            for(int i=0;i<n;i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
              long minSum=0;
                for(int i=0;i<n-m;i++){
                    minSum+=array[i];
                }
            long maxSum=0;
            for(int i=m;i<n;i++){
                maxSum+=array[i];
            }
            System.out.println(maxSum-minSum);


            t--;
        }
    }
}
