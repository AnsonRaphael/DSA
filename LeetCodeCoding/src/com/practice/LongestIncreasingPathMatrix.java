package com.practice;

public class LongestIncreasingPathMatrix {
    public static void main(String[] args) {

    }

    public int longestIncreasingPath(int[][] matrix) {
        int maxPath=0;
        int[][] dp= new int[matrix.length][matrix[0].length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                maxPath=Math.max(maxPath,maxPathLen(matrix,dp,i,j));
            }
        }

        return maxPath;
    }


    public static int maxPathLen(int[][] matrix,int[][] dp,int x,int y){
        int max=1;
        int[] diff={0,1,0,-1,0};
        if(isValid(matrix,x,y)){
            if(dp[x][y]>0)
                return dp[x][y];
            for(int i=0;i<diff.length-1;i++){
                int x1=x+diff[i];
                int y1=y+diff[i+1];
                if(isValid(matrix,x1,y1)){
                    if(matrix[x][y]<matrix[x1][y1]){
                        max=Math.max(max,1+maxPathLen(matrix,dp,x1,y1));
                    }
                }
            }
            dp[x][y]=max;
        }

        return dp[x][y];
    }

    public static boolean isValid(int[][] matrix ,int x,int y){
        if(x<0||x>=matrix.length||y<0||y>=matrix[0].length)
            return false;

        if(matrix[x][y]<0)
            return false;

        return true;
    }
}
