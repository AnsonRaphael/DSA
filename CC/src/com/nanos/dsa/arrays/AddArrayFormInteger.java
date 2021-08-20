package com.nanos.dsa.arrays;

import java.util.ArrayList;
import java.util.List;

public class AddArrayFormInteger {
    public static void main(String[] args) {
        int[] num={2,1,5};
        int k=806;
        System.out.println(addToArrayForm(num,k));

    }
    public static List<Integer> addToArrayForm(int[] num, int k) {
        int ksize=(int)Math.log10(k)+1;
        if(ksize<0)
            ksize=ksize*-1;
        int [] kar=new int[ksize];
        List<Integer> res= new ArrayList<>();

        int j=ksize-1;
        while(k!=0){
            int t=k%10;
            k=k/10;
            kar[j]=t;
            j--;
        }
        int carry=0;
        j=ksize-1;
        int i=num.length-1;
        for(i=num.length-1;i>=0&&j>=0;i--,j--){
            int sum=num[i]+kar[j]+carry;
            carry=sum/10;
            sum=sum%10;
            res.add(sum);
        }

        while(i>=0){
            int sum=num[i]+carry;
            carry=sum/10;
            sum=sum%10;
            res.add(sum);
            i--;
        }
        while(j>=0){
            int sum=kar[j]+carry;
            carry=sum/10;
            sum=sum%10;
            res.add(sum);
            j--;
        }
        if(carry!=0)
            res.add(carry);
        int le=0,ri=res.size()-1;
        while (le<ri){
            int op=res.get(le);
            res.set(le,res.get(ri));
            res.set(ri,op);
            le++;
            ri--;
        }
        return res;
    }

    public static List<Integer> addToArrayForm1(int[] num, int k) {
        int ksize=(int)Math.log10(k)+1;
        List<Integer> res= new ArrayList<>();
        int carry=0;
        int j=ksize-1;
        int i=num.length-1;
        for(i=num.length-1;i>=0&&j>=0;i--,j--){
            int sum=num[i]+(k%10)+carry;
            k=k/10;
            carry=sum/10;
            sum=sum%10;
            res.add(sum);
        }

        while(i>=0){
            int sum=num[i]+carry;
            carry=sum/10;
            sum=sum%10;
            res.add(sum);
            i--;
        }
        while(j>=0){
            int sum=(k%10)+carry;
            carry=sum/10;
            k=k/10;
            sum=sum%10;
            res.add(sum);
            j--;
        }
        if(carry!=0)
            res.add(carry);
        int le=0,ri=res.size()-1;
        while (le<ri){
            int op=res.get(le);
            res.set(le,res.get(ri));
            res.set(ri,op);
            le++;
            ri--;
        }
        return res;
    }
}
