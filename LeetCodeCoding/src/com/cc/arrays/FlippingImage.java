package com.cc.arrays;

import java.util.Arrays;

public class FlippingImage {
    public static void main(String[] args) {
        int[][] image={{1,1,0},{1,0,1},{0,0,0}};
        int[][] res = flipAndInvertImage(image);
        for (int i=0;i<image.length;i++){
            System.out.println(Arrays.toString(res[i]));
        }

    }
    public static int[][] flipAndInvertImage(int[][] image) {
        int[][] res = new int[image.length][];
        for (int i=0;i<image.length;i++){
            res[i]=new int[image[i].length];
            for (int j=image[i].length-1;j>=0;j--){
                int k=image[i].length-1-j;
                res[i][k]=image[i][j]==0?1:0;
            }
        }
        return res;
    }

}
