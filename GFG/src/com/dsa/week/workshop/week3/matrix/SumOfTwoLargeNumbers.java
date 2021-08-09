package com.dsa.week.workshop.week3.matrix;

public class SumOfTwoLargeNumbers {
    public static void main(String[] args) {
        String str1 = "12";
        String str2 = "198111";
        System.out.println(findSum(str1, str2));

    }

    private static String findSum(String str1, String str2) {
        String str1rev=reverseString(str1);
        String str2rev=reverseString(str2);

        String res="";
        int carry=0,i=0,j=0;
        for (;i<str1rev.length()&&j<str2rev.length();i++,j++){
            int e1=str1rev.charAt(i)-'0';
            int e2=str2rev.charAt(j)-'0';
            int sum=e1+e2+carry;
            sum=sum%10;
            carry=sum/10;
            res+=sum;
        }

        for (;i<str1rev.length();i++){
            int e1=str1rev.charAt(i)-'0';
            int sum=e1+carry;
            sum=sum%10;
            carry=sum/10;
            res+=sum;
        }
        for (;j<str2rev.length();j++){
            int e2=str2rev.charAt(j)-'0';
            int sum=e2+carry;
            sum=sum%10;
            carry=sum/10;
            res+=sum;
        }

    return  reverseString(res);
    }

    private static String reverseString(String str){
        int i=0,j=str.length()-1;
        char[] test = str.toCharArray();
        while (i<j){
            char t=test[i];
            test[i]=test[j];
            test[j]=t;
            i++;
            j--;
        }
        return new String(test);
    }
}
