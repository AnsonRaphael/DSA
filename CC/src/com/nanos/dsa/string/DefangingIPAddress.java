package com.nanos.dsa.string;

public class DefangingIPAddress {
    public static void main(String[] args) {
        String add="1.1.1.1";
    System.out.println(defangIPaddr(add));
        System.out.println(defangIPaddr2(add));
    }
    public static String defangIPaddr(String address) {
        return address.replaceAll("[.]","[.]");
    }
    public static String defangIPaddr2(String address) {
        int len=address.length();
        StringBuilder sb = new StringBuilder(len);
        for(int i=0;i<len;i++){
            char x = address.charAt(i);
            if(x=='.'){
                sb.append("[.]");
            }else{
                sb.append(x);
            }
        }
        return sb.toString();
    }
}
