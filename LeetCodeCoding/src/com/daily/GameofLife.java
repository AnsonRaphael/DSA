package com.daily;

import java.util.Arrays;

public class GameofLife {
    public static void main(String[] args) {
        int[][] board={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        gameOfLife(board);
        System.out.println(Arrays.deepToString(board));
    }


    public static void gameOfLife(int[][] board) {
        int row = board.length;
        int col = board[0].length;
        int[][] res=new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(isSet(board,i,j))
                    res[i][j]=1;
                else
                    res[i][j]=0;
            }
        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                board[i][j]=res[i][j];
            }
        }


    }

    public static boolean isSet(int[][] board,int r,int c){
        int row = board.length;
        int col = board[0].length;
        int count=0;
        boolean islive=board[r][c]==1?true:false;
        if(r-1>=0&&r-1<row&&c-1>=0&&c-1<col){
            if(board[r-1][c-1]==1)
                count++;
        }
        if(r-1>=0&&r-1<row&&c>=0&&c<col){
            if(board[r-1][c]==1)
                count++;
        }
        if(r-1>=0&&r-1<row&&c+1>=0&&c+1<col){
            if(board[r-1][c+1]==1)
                count++;
        }
        if(r>=0&&r<row&&c-1>=0&&c-1<col){
            if(board[r][c-1]==1)
                count++;
        }
        if(r>=0&&r<row&&c+1>=0&&c+1<col){
            if(board[r][c+1]==1)
                count++;
        }
        if(r+1>=0&&r+1<row&&c-1>=0&&c-1<col){
            if(board[r+1][c-1]==1)
                count++;
        }
        if(r+1>=0&&r+1<row&&c>=0&&c<col){
            if(board[r+1][c]==1)
                count++;
        }
        if(r+1>=0&&r+1<row&&c+1>=0&&c+1<col){
            if(board[r+1][c+1]==1)
                count++;
        }

        if((count<2||count>3))
            return false;
        else if(islive&& (count==2||count==3))
            return true;
        else if(!islive && count==3)
            return true;
        else
            return false;
    }
}
