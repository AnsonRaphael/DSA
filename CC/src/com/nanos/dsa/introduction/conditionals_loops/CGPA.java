package com.nanos.dsa.introduction.conditionals_loops;

public class CGPA {
    public static void main(String[] args) {
        int arr[] = {90, 80, 70, 80, 90};
        double sum=0;
        for (int i=0;i<arr.length;i++){
            sum+= arr[i]/10;
        }
        System.out.println(sum/arr.length+"  "+(sum/arr.length)*9.5);
    }
}
