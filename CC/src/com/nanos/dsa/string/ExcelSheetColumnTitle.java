package com.nanos.dsa.string;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        int columnNumber=701;
        System.out.println(convertToTitle(columnNumber));
    }
    public static String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        while(columnNumber!=0){
            int rem =columnNumber%26;
            if(rem==0){
                sb.append('Z');
                columnNumber=columnNumber/26-1;
            }else{
                sb.append((char)('A'+rem-1));
                columnNumber=columnNumber/26;
            }

        }
        return sb.reverse().toString();
    }
}
