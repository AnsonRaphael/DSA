package com.daily;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        String col ="ZY";
        System.out.println(titleToNumber(col));
    }
    public static int titleToNumber(String columnTitle) {
        int res=0;
        int ml=1;
        for (int i = 0; i <columnTitle.length(); i++) {
            char c= columnTitle.charAt(i);

            res=res*26+(c-'A'+1);
        }
        return res;
    }
}
