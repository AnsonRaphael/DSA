package com.dsa.week.workshop.week3.matrix;

public class SearchInARowWiseAndColumnWiseSortedMatrix {
    public static void main(String[] args) {
        int mat[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        search(mat, 4, 29);
    }

    private static void search(int[][] mat, int n, int k) {

       int i=0,j=n-1;
       while(i<n&&j>=0){
           if(mat[i][j]==k){
               break;
           }

           if(mat[i][j]<k){
               i++;
           }else if(mat[i][j]>k){
               j--;
           }
       }
       System.out.println(i+" "+j);
    }

}
