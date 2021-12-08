package com.nanos.dsa.string;

public class NextGreaterElementIII {
    public static void main(String[] args) {
        int n=2147483476;
        System.out.println(nextGreaterElement(n));
    }
    public static int nextGreaterElement(int n) {
        long m=n;
        int [] count = new int[10];
        int cur=-1,prev=-1;
        while (m!=0){
            cur=(int)m%10;
            m=m/10;
            count[cur]++;
            if(prev>cur){
                int nm=cur+1;
                while (count[nm]==0)nm++;
                // now we know a greater number than cur to replace
                count[nm]--;
                m=m*10+nm; // added that great value
                // now add sorted rest of count value
                for (int i = 0; i < count.length; i++) {
                    while (count[i]>0){
                        m=m*10+i;
                        count[i]--;
                    }
                }
                return m<=Integer.MAX_VALUE?(int)m:-1;
            }
            prev=cur;
        }
        return -1;
    }

}
