package com.dsa.week.workshop.week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class SieveOfEratosthenes {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int t =Integer.parseInt(st.nextToken());
        while(t>0){
            // initialise variables
            int n = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());
            Boolean[] prim = new Boolean[n];
            Arrays.fill(prim,Boolean.TRUE);
            // loop through indexes
            for(int i=2;i<n;i++){

                // check for prime number
                if(prim[i]){
                    for(int j=i*2;j<n;j+=i){
                        prim[j]=false;
                    }
                }
            }
            for(int i=2;i<n;i++){
                if(prim[i])
                System.out.print(i+" ");
            }
            System.out.println();
        }
        t--;

    }
}
