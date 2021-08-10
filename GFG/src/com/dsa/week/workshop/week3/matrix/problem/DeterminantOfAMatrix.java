package com.dsa.week.workshop.week3.matrix.problem;

public class DeterminantOfAMatrix {
    public static void main(String[] args) {
      int  N = 4;
        int matrix[][] = {{1, 0, 2, -1},
            {3, 0, 0, 5},
            {2, 1, 4, -3},
            {1, 0, 5, 0}};
        System.out.println(determinantOfMatrix(matrix,N));
    }

    static int determinantOfMatrix(int matrix[][], int n)
    {
        // code here
        int D=0;
        if(n==1){
            return matrix[0][0];
        }
        int [][]temp=new int[n][n];
        int sign=1;

        for (int i=0;i<n;i++){
            getCofactor(matrix,temp,0,i,n);
            D+=sign*matrix[0][i]*determinantOfMatrix(temp,n-1);

            sign=-1*sign;
        }
        return D;
    }
    static void getCofactor(int[][] mat,int [][]temp,int p,int q,int n){
        int i=0,j=0;

        for (int row=0;row<n;row++){
            for (int col=0;col<n;col++){
                if(row!=p&&col!=q){
                    temp[i][j++]=mat[row][col];
                    if(j==n-1){
                        j=0;
                        i++;
                    }
                }
            }
        }

    }


}
