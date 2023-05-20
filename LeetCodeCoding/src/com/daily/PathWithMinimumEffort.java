package com.daily;

public class PathWithMinimumEffort {
    public static void main(String[] args) {
        PathWithMinimumEffort path = new PathWithMinimumEffort();
        int[][] heights = {{1,2,2},{3,8,2},{5,3,5}};
        System.out.println(path.minimumEffortPath(heights));
    }


    public int minimumEffortPath(int[][] heights) {

        int s=0,e=1000_000,m=0,ans=0;
        while(s<e){
            m=s+(e-s)/2;

            boolean possible = dfs(heights,new boolean[heights.length][heights[0].length],0,0,m);
            if(possible){
                e=m;
                ans=m;
            }else{
                s=m+1;
            }
        }

        return ans;
    }

    public boolean dfs(int[][] heights,boolean[][] visited,int r,int c,int k){
        if(r==heights.length-1&&c==heights[0].length-1){
            return true;
        }
        if(visited[r][c])
            return false;
        boolean res=false;
        visited[r][c]=true;
        int[] diff ={0,-1,0,1,0};
        for(int j=0;j<diff.length-1;j++){
            int nr=r+diff[j];
            int nc=c+diff[j+1];
            if(safe(heights,visited,r,c,nr,nc,k)){
                res = dfs(heights,visited,nr,nc,k);
                if(res){
                    return true;
                }

            }
        }

        return false;
    }

    public boolean safe(int[][] heights,boolean[][] visited,int r,int c,int nr,int nc,int k){
        if(nr<0||nc<0||nr>heights.length-1||nc>heights[0].length-1){
            return false;
        }
        if(visited[nr][nc])
            return false;
        if(Math.abs((heights[r][c]-heights[nr][nc]))>k)
            return false;

        return true;
    }

}
