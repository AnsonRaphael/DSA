package com.nanos.dsa.arrays;

public class CellsWithOddValuesMatrix {
    public static void main(String[] args) {
        int m=2;
        int n=3;
        int[][] indices={{0,1},{1,1}};
        System.out.println(oddCells(m,n,indices));
    }
    public static int oddCells(int m, int n, int[][] indices) {
        boolean [] rowbol=new boolean[m];
        boolean[] colbol=new boolean[n];
        int rowcount=0,colcount=0;
        for(int i=0;i<indices.length;i++){
            rowbol[indices[i][0]]^=true;
            colbol[indices[i][1]]^=true;
            rowcount+=rowbol[indices[i][0]]?1:-1;
            colcount+=colbol[indices[i][1]]?1:-1;
        }
        return (rowcount*n)+(colcount*m)-(2*rowcount*colcount);
    }
}
