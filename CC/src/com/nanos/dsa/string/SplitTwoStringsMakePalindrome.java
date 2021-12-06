package com.nanos.dsa.string;

public class SplitTwoStringsMakePalindrome {
    public static void main(String[] args) {
        String a;
        String b;
//        String a="abdef";
//        String b="xecab";
       // a = "ulacfd"; b = "jizalu";
        a = "abda";b="acmc";
        System.out.println(checkPalindromeFormation(a,b));
    }
    public static boolean checkPalindromeFormation(String a, String b) {
            if(isPalindrome(a,0,a.length()-1)||isPalindrome(b,0,a.length()-1)){
                return true;
            }
            if(palindromeLength(a,b)||palindromeLength(b,a)){
                return true;
            }
            return false;
    }

    static boolean isPalindrome(String a,int s,int e){

        while (s<=e){
            if(a.charAt(s)!=a.charAt(e)){
                return false;
            }
            s++;
            e--;
        }
        return true;
    }
    static boolean palindromeLength(String a,String b){
        int s=0,e=a.length()-1;
        while (s<=e){
            if(a.charAt(s)!=b.charAt(e)){
               break;
            }
            s++;
            e--;
        }
        if(isPalindrome(a,s,e)||isPalindrome(b,s,e)){
            return true;
        }else
        return false;
    }
}
