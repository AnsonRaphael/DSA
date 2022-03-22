package com.daily;

public class MinimumDominoRotationsForEqualRow {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int mn=Integer.MAX_VALUE;
        for (int i = 1; i <=6 ; i++) {
            int bottomRot=0;
            int topRot=0;
            for (int j = 0; j < tops.length; j++) {

                if(!(tops[j]==i||bottoms[j]==i)){
                    bottomRot=Integer.MAX_VALUE;
                    topRot=Integer.MAX_VALUE;
                    break;
                }
                if(tops[j]==i&&bottoms[j]!=i) topRot++;
                else if(tops[j]!=i&&bottoms[j]==i) bottomRot++;
            }
            int lm=Math.min(bottomRot,topRot);
            mn=Math.min(mn,lm);
        }

        return mn==Integer.MAX_VALUE?-1:mn;
    }
}
