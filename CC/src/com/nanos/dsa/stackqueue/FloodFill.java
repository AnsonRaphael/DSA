package com.nanos.dsa.stackqueue;

import java.util.Arrays;

public class FloodFill {
    public static void main(String[] args) {
        int[][] image={{0,0,0},{0,1,1}};
        int sr=1;
        int sc=1;
        int newColor=1;
        System.out.print(Arrays.deepToString(floodFill(image,sr,sc,newColor)));
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int oldclr=image[sr][sc];
        if(oldclr==newColor)
            return image;
        floodFillRec(image,sr,sc,oldclr,newColor);
        return image;
    }
    public static void floodFillRec(int[][] image, int sr, int sc,int oldclr ,int newColor) {
        if(!isvalid(image,sr,sc,oldclr)){
            return;
        }
        image[sr][sc]=newColor;
        floodFillRec(image,sr+1,sc,oldclr,newColor);
        floodFillRec(image,sr-1,sc,oldclr,newColor);
        floodFillRec(image,sr,sc+1,oldclr,newColor);
        floodFillRec(image,sr,sc-1,oldclr,newColor);
    }

    public static boolean isvalid(int[][] image,int r,int c,int oldclr){
        if(r>=image.length||r<0)
            return false;
        if(c>=image[0].length||c<0)
            return false;
        if(image[r][c]==oldclr)
            return true;
        else
            return false;

    }
}
