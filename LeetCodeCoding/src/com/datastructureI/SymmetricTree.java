package com.datastructureI;

public class SymmetricTree {
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

    public boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;

        return isSymmetricCheck(root.left,root.right);
    }
    public static boolean isSymmetricCheck(TreeNode left,TreeNode right) {
        if(left==null&&right==null)
            return true;
        if((left==null&&right!=null)||(left!=null&&right==null))
            return false;
        if(left.val!=right.val)
            return false;
        return isSymmetricCheck(left.left,right.right)&&isSymmetricCheck(left.right,right.left);

    }
}
