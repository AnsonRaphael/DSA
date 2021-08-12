package com.nanos.dsa.introduction.conditionals_loops;

public class AdditionOfTwoNumbers {
    public static void main(String[] args) {
        String str1="165",str2="345";
        String rstr1=reverse(str1);
        String rstr2=reverse(str2),res="";
        int carry=0,i=0,k=0;
        while (i<str1.length()&&i<str2.length()){
            int a=rstr1.charAt(i)-'0',b=rstr2.charAt(i)-'0';
            int sum=a+b+carry;
            carry=sum/10;
            sum=sum%10;
            res=res+sum;
            i++;
        }

        while (i<str1.length()){
            int a=rstr1.charAt(i)-'0';
            int sum=a+carry;
            carry=sum/10;
            sum=sum%10;
            res=res+sum;
        }

        while (i<str2.length()){
            int b=rstr2.charAt(i)-'0';
            int sum=b+carry;
            carry=sum/10;
            sum=sum%10;
            res=res+sum;
            i++;
        }
        System.out.println(res);
        String resl=reverse(res);
        System.out.println(resl);
    }

    static String reverse(String str){

        char[] arr=str.toCharArray();
        int l=0,r=arr.length-1;
        while (l<=r){
            char c=arr[l];
            arr[l]=arr[r];
            arr[r]=c;
            l++;
            r--;
        }
        return new String(arr);
    }
}
