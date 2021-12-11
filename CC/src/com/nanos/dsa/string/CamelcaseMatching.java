package com.nanos.dsa.string;

import java.util.ArrayList;
import java.util.List;

public class CamelcaseMatching {
    public static void main(String[] args) {
        String[] queries={"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern="FB";
        System.out.println(camelMatch(queries,pattern));
    }
    public static List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> res= new ArrayList<>();
        for(int i=0;i<queries.length;i++){
            res.add(isMatching(queries[i],pattern));
        }
        return res;
    }
    public static Boolean isMatching(String query,String pattern){
        int q=0,p=0;
        while(q<query.length()&&p<pattern.length()){
            if(query.charAt(q)==pattern.charAt(p)){
                q++;
                p++;
            }else{
                if(!(query.charAt(q)>='a'&&query.charAt(q)<='z')){
                    return false;
                }else{
                    q++;
                }
            }
        }
        if(p!=pattern.length()){
            return false;
        }
        while(q<query.length()){
            if(!(query.charAt(q)>='a'&&query.charAt(q)<='z')){
                return false;
            }else{
                q++;
            }
        }
        return true;
    }
}
