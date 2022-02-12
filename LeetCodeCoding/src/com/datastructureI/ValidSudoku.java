package com.datastructureI;

import java.util.HashSet;

public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board={
                {'.','.','.','.','5','.','.','1','.'},
                {'.','4','.','3','.','.','.','.','.'},
                {'.','.','.','.','.','3','.','.','1'},
                {'8','.','.','.','.','.','.','2','.'},
                {'.','.','2','.','7','.','.','.','.'},
                {'.','1','5','.','.','.','.','.','.'},
                {'.','.','.','.','.','2','.','.','.'},
                {'.','2','.','9','.','.','.','.','.'},
                {'.','.','4','.','.','.','.','.','.'}};
        System.out.println(isValidSudoku(board));
    }
    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            HashSet<Integer> set=new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if(set.contains(board[i][j]-'0'))
                    return false;
                if(board[i][j]=='.')
                    continue;
                if(board[i][j]!='.'&&board[i][j]-'0'<=9&&board[i][j]-'0'>=0){
                    set.add(board[i][j]-'0');
                }else {
                    return false;
                }

            }
        }

        for (int i = 0; i < board[0].length; i++) {
            HashSet<Integer> set=new HashSet<>();
            for (int j = 0; j < board.length; j++) {
                if(set.contains(board[j][i]-'0'))
                    return false;
                if(board[j][i]=='.')
                    continue;
                if(board[j][i]!='.'&&board[j][i]-'0'<=9&&board[j][i]-'0'>=0){
                    set.add(board[j][i]-'0');
                }else {
                    return false;
                }

            }
        }

        for (int i = 0; i < board.length; i+=3) {
            for (int j = 0; j < board[0].length; j+=3) {
                HashSet<Integer> set=new HashSet<>();
                for (int k = i; k < i+3; k++) {
                    for (int l = j; l <j+3 ; l++) {
                        if(set.contains(board[k][l]-'0'))
                            return false;
                        if(board[k][l]=='.')
                            continue;
                        if(board[k][l]!='.'&&board[k][l]-'0'<=9&&board[k][l]-'0'>=0){
                            set.add(board[k][l]-'0');
                        }else {
                            return false;
                        }
                    }
                }
            }
        }

        return true;

    }
}
