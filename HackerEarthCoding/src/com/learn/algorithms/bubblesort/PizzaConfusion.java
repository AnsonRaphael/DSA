package com.learn.algorithms.bubblesort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PizzaConfusion {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n =Integer.parseInt(st.nextToken());
       // HashMap<String,Integer> resStory= new HashMap<>();
        int maxValue=Integer.MIN_VALUE;
        String nameMax=null;
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String name=st.nextToken();
            int no=Integer.parseInt(st.nextToken());
            if(maxValue<no){
                maxValue=no;
                nameMax=name;
            }else if(maxValue==no){
                if(name.compareTo(nameMax)<0){
                    nameMax=name;
                }
            }
        }
        System.out.println(nameMax);
    }

}
