package com.datastructureI;

public class PathSum {

    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        return hasPathSum1(root,targetSum);

    }
    public boolean hasPathSum1(TreeNode root, int targetSum) {
        boolean res=false;
        if(root.left==null&&root.right==null){
            if(targetSum-root.val==0)
                return true;
        }else{
            if(root.left!=null)
                res=hasPathSum1(root.left, targetSum-root.val);
            if(res==true)
                return true;
            if(root.right!=null)
                res=hasPathSum1(root.right, targetSum-root.val);
            if(res==true)
                return true;
        }


        return false;
    }
}
