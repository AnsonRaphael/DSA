package com.daily;

public class KthSmallestElementBST {
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

    int k;
    Integer result=0;
    public int kthSmallest(TreeNode root, int k) {

        this.k=k;
        DFS(root);
        return result;
    }

    public void DFS(TreeNode node){
        if(node==null)
            return ;

        DFS(node.left);

        int rl=node.val;
        k--;
        if(k==0){
            result=rl;
        }
        DFS(node.right);

    }
}
