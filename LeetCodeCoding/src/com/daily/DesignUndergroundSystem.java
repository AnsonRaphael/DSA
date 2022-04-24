package com.daily;

import java.util.HashMap;

public class DesignUndergroundSystem {
    class UndergroundSystem {
        HashMap<String,String> startToEnd;
        HashMap<Integer,String> idStart;
        public UndergroundSystem() {
           startToEnd= new HashMap<>();
           idStart= new HashMap<>();
        }

        public void checkIn(int id, String stationName, int t) {
            idStart.put(id,stationName+" "+t);
        }

        public void checkOut(int id, String stationName, int t) {
            String[] info=idStart.get(id).split(" ");
            int diff=t-Integer.valueOf(info[1]);
            String key = info[0]+" "+stationName;
            if(startToEnd.containsKey(key)){
                String[] endInfo = startToEnd.get(key).split(" ");
                 diff= Integer.valueOf(endInfo[0])+diff;
                 int no =Integer.valueOf(endInfo[1])+1;
                startToEnd.put(key,diff+" "+no);
            }else {
                startToEnd.put(key,diff+" "+1);
            }
            idStart.remove((Integer)id);
        }

        public double getAverageTime(String startStation, String endStation) {
            String key = startStation+" "+endStation;
            String[] data=startToEnd.get(key).split(" ");
            return Double.valueOf(data[0])/Double.valueOf(data[1]);
        }
    }
}
