package com.daily;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args) {

    }
    public int calPoints(String[] ops) {
        Stack<Integer> res= new Stack<>();
        //res.push(Integer.valueOf(ops[0]));
        for (int i = 0; i < ops.length; i++) {
            String sr=ops[i];
            if(sr.equalsIgnoreCase("+")){
                Integer opt1 = res.pop();
                Integer opt2=res.pop();
                res.push(opt2);
                res.push(opt1);
                res.push(opt1+opt2);
            }else if(sr.equalsIgnoreCase("D")){
                Integer opt2=res.pop();
                res.push(opt2);
                res.push(opt2*2);
            }else if(sr.equalsIgnoreCase("C")){
                res.pop();
            }else {
                res.push(Integer.valueOf(sr));
            }
        }
        int result=0;
        while (!res.isEmpty()){
            result+=res.pop();
        }
        return result;
    }
}
