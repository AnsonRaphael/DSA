package com.dsa.week.workshop.week3.matrix;

public class ABooleanMatrixQuestion {
    public static void main(String[] args) {
        int arr[][] = {
                {1, 0, 0, 1},
                {0, 0, 1, 0},
                {0, 0, 0, 0}};

        Matrix2DArrayUtil.printMatrix(arr, arr.length, arr[0].length);
        modifyMatrix2(arr, arr.length, arr[0].length);

        Matrix2DArrayUtil.printMatrix(arr, arr.length, arr[0].length);
    }

    static void modifyMatrix1(int arr[][], int r, int c) {
        int arrRow[] = new int[r];
        int arrCol[] = new int[c];
        // set auxiliary array flags
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arr[i][j] == 1) {
                    arrRow[i] = 1;
                    arrCol[j] = 1;
                }
            }
        }

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (arrRow[i] == 1||arrCol[j] == 1) {
                    arr[i][j]=1;
                }
            }
        }

    }

    static void modifyMatrix2(int arr[][], int r, int c) {

        // set row and col flag if there is at least  1 in first row and col.
        int firstRow=0,firstCol=0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(arr[0][j]==1)
                    firstRow=1;
                if(arr[i][0]==1)
                    firstCol=1;
            }
        }

        // use first row and col as auxiliary array
        // first and second steps can be written in same nested loops
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(arr[i][j]==1){
                arr[0][j]=1;
                arr[1][0]=1;
                }
            }
        }

        // set 1 when auxiliary values are 1
        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {

                if(arr[0][j]==1||arr[i][0]==1){
                    arr[i][j]=1;
                }
            }
        }

        for (int i = 1; i < r; i++) {
            for (int j = 1; j < c; j++) {
                if(firstRow==1)
                    arr[0][j]=1;
                if (firstCol==1)
                    arr[i][0]=1;
            }
        }

    }
}
