package com.daily;

public class SpiralMatrixII {

    public int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int rows=0,rowe=n-1,cols=0,cole=n-1;
        int c=1;
        while(rows<=rowe&&cols<=cole){

            for(int i=cols;i<=cole;i++){
                res[rows][i]=c;
                c++;
            }
            rows++;
            for(int i=rows;i<=rowe;i++){
                res[i][cole]=c;
                c++;
            }
            cole--;

            if(rows<=rowe&&cols<=cole){
                for(int i=cole;i>=cols;i--){
                    res[rowe][i]=c;
                    c++;
                }
                rowe--;
                for(int i=rowe;i>=rows;i--){
                    res[i][cols]=c;
                    c++;
                }
                cols++;
            }
        }
        return res;
    }

}
