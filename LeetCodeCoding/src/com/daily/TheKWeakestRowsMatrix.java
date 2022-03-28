package com.daily;

import java.util.Arrays;

public class TheKWeakestRowsMatrix {
    public static void main(String[] args) {
//        int[][]mat =
//                {{1,1,0,0,0}, {1,1,1,1,0},
//        {1,0,0,0,0},{1,1,0,0,0},
//        {1,1,1,1,1}};
//        int k = 3;
        int[][]mat ={{1,0},{0,0},{1,0}};
        int k=2;
        System.out.println(Arrays.toString(kWeakestRows(mat,k)));
    }

    public static int[] kWeakestRows(int[][] mat, int k) {
        int[][] res=new int[mat.length][2];
        for (int i = 0; i <mat.length ; i++) {
            int lm=firstOne(mat[i]);
            res[i][0]=i;
            res[i][1]=lm;
        }
        Arrays.sort(res,(a,b)->{
          if(a[1]==b[1]){
              return a[0]-b[0];
          }else {
            return a[1]-b[1];
          }
        });
        int[] r=new int[k];
        for (int i = 0; i < k; i++) {
         r[i]=res[i][0];
        }
        return r;
    }
    public static int firstOne(int[] arr){
        int res=-1;
        int s=0,e=arr.length-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if(arr[m]==1&&(m==arr.length-1||arr[m+1]==0)){
                res=m;
                break;
            }
            if(arr[m]==0){
                e=m-1;
            }else {
                res=m;
                s=m+1;
            }
        }
        return res;
    }
}
