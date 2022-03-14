package com.daily;

import java.util.ArrayList;
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {

        Stack<String> st= new Stack<>();
        String[] tokn=path.split("/");
        for (int i = 0; i < tokn.length; i++) {
            String lm=tokn[i];
            if(lm.equals("")||lm.equals(".")||lm.equals("/"))
                continue;
            if(lm.equals("..")){
                if(!st.isEmpty())
                st.pop();
            }else
                st.push(lm);
        }
        ArrayList<String> res= new ArrayList<>(st);
        return "/"+String.join("/",res);
    }
}
