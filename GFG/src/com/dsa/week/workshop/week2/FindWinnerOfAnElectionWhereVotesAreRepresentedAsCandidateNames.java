package com.dsa.week.workshop.week2;

import java.util.HashMap;

public class FindWinnerOfAnElectionWhereVotesAreRepresentedAsCandidateNames {
    public static void main(String[] args) {
       String votes[] = {"john", "johnny", "jackie",
                "johnny", "john", "jackie",
                "jamie", "jamie", "john",
                "johnny", "jamie", "johnny",
                "john"};
        HashMap<String,Integer> votMap= new HashMap<>();
        for (int i=0;i<votes.length;i++){
            if(votMap.containsKey(votes[i])){
                int count = votMap.get(votes[i]);
                votMap.put(votes[i],++count);
            }else{
                votMap.put(votes[i],1);
            }
        }
        String result=null;
        int maxCount=0;
        for (String can: votMap.keySet()){
            int count = votMap.get(can);
            if(maxCount==count){
                if(result!=null){
                    if(can.compareTo(result)<0){
                        result=can;
                    }
                }else{
                    result=can;
                }
            }
            if(maxCount<count){
                result=can;
                maxCount=count;
            }
        }

        System.out.println(result);

    }
}
