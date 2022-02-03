package com.nanos.dsa.tree;

public class ValidateBinarySearchTree {
      public static class TreeNode {
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

    public static void main(String[] args) {
        /*TreeNode o1= new TreeNode(5);
        TreeNode o2= new TreeNode(1);
        TreeNode o3= new TreeNode(4);
        TreeNode o4= new TreeNode(3);
        TreeNode o5= new TreeNode(6);
        o1.left=o2;
        o1.right=o3;
        o3.left=o4;
        o3.right=o5;*/
        TreeNode o1= new TreeNode(-2147483648);
        TreeNode o2= new TreeNode(-2147483648);

        o1.left=o2;

        System.out.println(isValidBST(o1));
    }

    public static boolean isValidBST(TreeNode root) {
        long min=Long.MIN_VALUE;
        long max= Long.MAX_VALUE;
        return isValidBSTNode(root,min,max);
    }
    public static boolean isValidBSTNode(TreeNode root,long min,long max){
        if(root==null)
            return true;


          if(min> root.val||max< root.val){
              return false;
          }
        return isValidBSTNode(root.left, min,root.val-1L)&& isValidBSTNode(root.right, root.val+1L, max);
    }

}
