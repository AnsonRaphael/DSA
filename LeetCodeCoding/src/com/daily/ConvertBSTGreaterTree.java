package com.daily;

public class ConvertBSTGreaterTree {
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

    int vl=0;
    public TreeNode convertBST(TreeNode root) {

        if(root==null)
            return root;
        maxTree(root);
        return root;
    }
    public  void maxTree(TreeNode root){
        if(root==null)
            return ;

        maxTree(root.right);
        vl=vl+root.val;
        root.val=vl;
        maxTree(root.left);
    }
}
