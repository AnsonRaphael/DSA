package com.nanos.dsa.string;

public class ValidNumber {
    public static void main(String[] args) {
        String s = "6+1";
        System.out.println(isNumber(s));
    }

    public static boolean isNumber(String s) {
        //s = s.toLowerCase().trim();;
        boolean isDigitSeen = false;
        boolean iseSeen = false;
        boolean isDotSeen = false;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (!(i == 0 ||(i!=0&& (s.charAt(i - 1) == 'e' || s.charAt(i - 1) == 'E')))) {
                    return false;
                }
            } else if (s.charAt(i) == 'e' || s.charAt(i) == 'E') {
                if (iseSeen || !isDigitSeen) {
                    return false;
                } else {
                    iseSeen = true;
                    isDigitSeen=false;
                }
            } else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                isDigitSeen = true;
            } else if (s.charAt(i) == '.') {
                if (iseSeen || isDotSeen) {
                    return false;
                } else {
                    isDotSeen = true;
                }
            }else{
                return false;
            }

        }
        return isDigitSeen;
    }
}
