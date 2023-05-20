package com.sgmttree;
class TreeNode{
    TreeNode left;
    TreeNode right;
    int start;
    int end;
    int sum;
    public TreeNode(int start,int end,int sum){
        this.start=start;
        this.end=end;
        this.sum=sum;
    }
    public TreeNode(int start,int end){
        this.start=start;
        this.end=end;
    }
}
public class RangeSumQueryMutable {
    TreeNode root;

    public RangeSumQueryMutable(int[] nums) {
        this.root= buildTree(nums,0,nums.length-1);
    }

    public void update(int index, int val) {
        updateHelper(root, index, val);
    }
    void updateHelper(TreeNode root, int i, int val){
        if(root==null)
            return;
        int mid= root.start+(root.end-root.start)/2;
        if(i<=mid)
            updateHelper(root.left,i,val);
        else
            updateHelper(root.right,i,val);
        if(root.start==root.end&&i==root.start){
            root.sum=val;
            return;

        }

        root.sum=root.left.sum+root.right.sum;


    }

    public int sumRange(int left, int right) {
        return sumRangeHelper(root, left, right);
    }
    public int sumRangeHelper(TreeNode root, int i, int j){
        if(root==null || j<root.start || i > root.end ||i>j )
            return 0;
        if(i<=root.start&&j<=root.end){
            return root.sum;
        }
        int mid=root.start+(root.end-root.start)/2;
        return sumRangeHelper(root.left,i,Math.min(mid,j)) +
                sumRangeHelper(root.right,Math.min(mid+1,i),j);
    }

    public TreeNode buildTree(int nums[],int s,int e){
        if(nums==null||nums.length==0||s>e){
            return null;
        }
        if(s==e){
            return new TreeNode(s,e,nums[s]);
        }
        TreeNode curent= new TreeNode(s,e);
        int m= s+(e-s)/2;
        curent.left=buildTree(nums,s,m);
        curent.right=buildTree(nums,m+1,e);
        curent.sum=curent.left.sum+curent.right.sum;
        return curent;

    }
}
