package com.learn.algorithms.bubblesort.inprogress;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BalancedPartition {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i=0;i<t;i++){
            st = new StringTokenizer(br.readLine());
            int n=Integer.parseInt(st.nextToken());
            int [] x = new int[n];
            int [] y = new int[n];
            int [] h = new int[n];
            // data input
            int sum=0;
            for(int j=0;j<n;j++){
                st = new StringTokenizer(br.readLine());
                x[j]=Integer.parseInt(st.nextToken());
                y[j]=Integer.parseInt(st.nextToken());
                h[j]=Integer.parseInt(st.nextToken());
                sum+= h[j];
            }

            if(sum%2!=0) {
                System.out.println("NO");
                continue;
            }
            // transform
            for(int j=0;j<n;j++){
                x[j]=x[j]-y[j];
                y[j]=x[j]+y[j];
            }

            // sort against x axis
            for(int j=0;j<n;j++){
                for(int k=0;k<n-j-1;k++){
                    if(x[k]>x[k+1]){
                        swap(x, k);
                        swap(y, k);
                        swap(h, k);
                    }
                }
            }
            long sumUp=0,sumDn=sum;
            boolean isSplit=false;
            // split and check sum
            for(int j=0;j<n;j++){
                sumUp=sumUp+h[j];
                sumDn=sumDn-h[j];
                System.out.println(sumUp+" "+sumDn);
                if(sumUp==sumDn){
                    isSplit=true;
                    break;
               }

            }

            if(isSplit){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }
    }

    public static void swap(int[] arr,int i){
        int temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
    }

}
