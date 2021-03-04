package com.learn.algorithms.bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TheBestPlayer {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        String[] fanName = new String[n];
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String name=st.nextToken();
            int fanNo=Integer.parseInt(st.nextToken());
            arr[i]=fanNo;
            fanName[i]=name;
        }
        // sort
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    String nameTemp=fanName[j];
                    arr[j]=arr[j+1];
                    fanName[j]=fanName[j+1];
                    arr[j+1]=temp;
                    fanName[j+1]=nameTemp;
                }

            }
        }
        for(int i=0;i<n;i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // if same fann no value, name is used for sorting
                if (arr[j] == arr[j + 1]) {
                    if (fanName[j].compareTo(fanName[j + 1]) < 0) {
                        int temp = arr[j];
                        String nameTemp = fanName[j];
                        arr[j] = arr[j + 1];
                        fanName[j] = fanName[j + 1];
                        arr[j + 1] = temp;
                        fanName[j + 1] = nameTemp;
                    }
                }
            }
        }

        for(int i=1;i<=t;i++) {
            System.out.println(fanName[n-i]);
        }


    }
}
