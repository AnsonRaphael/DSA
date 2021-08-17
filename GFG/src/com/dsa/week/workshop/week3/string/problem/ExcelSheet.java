package com.dsa.week.workshop.week3.string.problem;

public class ExcelSheet {
    public static void main(String[] args) {
        int N = 705;
        System.out.println(excelColumn(N));
    }
    public static String excelColumn(int N){

        //  Your code here
        int m=N/26;
        int l=N%26;
        char r=' ';
        if(l==0){
            m--;
           r='Z';
        }else
        r= (char) ('A'+l-1);
        String st=""+r;
        if(m==0){
            return st;
        }else {
            return excelColumn(m)+st;
        }
    }
}
