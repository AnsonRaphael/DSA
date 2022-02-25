package com.daily;

public class CompareVersionNumbers {
    public static void main(String[] args) {
        String version1="0.1";
        String version2="1.1";
        System.out.println(compareVersion(version1,version2));
    }
    public static int compareVersion(String version1, String version2) {
        String[] ver1= version1.split("\\.");
        String[] ver2= version2.split("\\.");
        int i=0;
        for(i=0;i<ver1.length&&i<ver2.length;i++){
            int v1=Integer.valueOf(ver1[i]);
            int v2=Integer.valueOf(ver2[i]);
            if(v1>v2){
                return 1;
            }
            if(v1<v2)
                return -1;
        }
        for(;i<ver1.length;i++){
            int v1=Integer.valueOf(ver1[i]);
            if(v1!=0)
                return 1;
        }
        for(;i<ver2.length;i++){
            int v2=Integer.valueOf(ver2[i]);
            if(v2!=0)
                return -1;
        }
        return 0;
    }
}
