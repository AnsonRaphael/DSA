package com.learn.datastructure.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketSequences {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] chr = str.toCharArray();
		//System.out.println(str);
		int total=0,n=chr.length;
		for(int i=0;i<n;i++) {
			if(chr[i]==')') {
				continue;
			}
			int open=0;
			for(int j=i;j<i+n;j++) {
				if(open<0) {
					break;
				}
				if(chr[j%n]=='(') // Using mode to get data continusly from last to fist element eg when starting with 2  sequence will be 2,3,4,5,0,1 if there are 6 element as second loop  starts with 2 and ends with 8
					open++;
				else
					open--;
			}
			if(open==0) {
				total++;
			}
			
		}
		System.out.println(total);
	}
	
	
}
