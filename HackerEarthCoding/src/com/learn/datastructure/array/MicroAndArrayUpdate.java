package com.learn.datastructure.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MicroAndArrayUpdate {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	     BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int testcases=Integer.parseInt(br.readLine());
	        for(int i=0;i<testcases;i++){
	            StringTokenizer st = new StringTokenizer(br.readLine());
	            int n=Integer.parseInt(st.nextToken());
	            int k=Integer.parseInt(st.nextToken());
	            StringTokenizer st2 = new StringTokenizer(br.readLine());
	            int min=Integer.MAX_VALUE;
	            while(st2.hasMoreTokens()){
	                int temp=Integer.parseInt(st2.nextToken());
	                if(min>temp)
	                    min=temp;
	            }
	            int result=k-min;
	            if(k-min<0)
	             result=0;
	            System.out.println(result);
	        }

	}

}
