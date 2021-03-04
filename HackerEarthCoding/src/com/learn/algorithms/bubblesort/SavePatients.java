package com.learn.algorithms.bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SavePatients {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n= Integer.parseInt(st.nextToken());
        int[] vacc= new int[n];
        StringTokenizer vaccST = new StringTokenizer(br.readLine());
        int[] pat=new int[n];
        StringTokenizer patST = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            vacc[i]= Integer.parseInt(vaccST.nextToken());
            pat[i]=Integer.parseInt(patST.nextToken());
        }

        // sort both data
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(vacc[j]>vacc[j+1]){
                    int temp = vacc[j];
                    vacc[j]=vacc[j+1];
                    vacc[j+1]=temp;
                }
                if(pat[j]>pat[j+1]){
                    int temp = pat[j];
                    pat[j]=pat[j+1];
                    pat[j+1]=temp;
                }
            }
        }
        boolean sucess=true;
        for(int i=0;i<n;i++){
            if(vacc[i]<pat[i]){
                sucess=false;
                break;
            }
        }

        if(sucess)
            System.out.println("Yes");
        else
            System.out.println("No");

    }
}
