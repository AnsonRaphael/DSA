package com.nanos.dsa.string;

public class RobotReturnOrigin {
    public static void main(String[] args) {
        String moves="UD";
        System.out.println(judgeCircle(moves));
    }
    public static boolean judgeCircle(String moves) {
        int x=0,y=0;
        for(char c:moves.toCharArray()){
            if(c=='U'){
                y++;
            }
            if(c=='D'){
                y--;
            }
            if(c=='R'){
                x++;
            }
            if(c=='L'){
                x--;
            }
        }
        if(x==0&&y==0)
            return true;
        else
            return false;
    }
}
