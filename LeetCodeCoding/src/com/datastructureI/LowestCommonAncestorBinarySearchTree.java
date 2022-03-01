package com.datastructureI;

public class LowestCommonAncestorBinarySearchTree {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }
    public static void main(String[] args) {

    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return root;
        if(p.val>root.val&&q.val>root.val)
            return lowestCommonAncestor(root.right,p,q);
        if(p.val<root.val&&q.val<root.val)
            return lowestCommonAncestor(root.left,p,q);

        return root;
    }
}
