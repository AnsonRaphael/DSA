package com.practice;

public class LowestCommonAncestorofaBinaryTree {
    public static class TreeNode {
        int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null)
            return null;

        TreeNode foundLeft=lowestCommonAncestor(root.left,p,q);
        TreeNode foundright=lowestCommonAncestor(root.right,p,q);

        if((foundLeft==q&&foundright==p)&&(foundLeft==p&&foundright==q))
        return root;
        if((foundLeft==q&&root==p)||(foundLeft==p&&root==q)||(foundright==q&&root==p)||(foundright==q&&root==p))
            return root;

        if(foundLeft==p||foundright==p)
            return p;
        if(foundLeft==q||foundright==q)
            return q;
        if(root==p)
            return p;
        if(root==q)
            return q;
        if(foundLeft!=null)
            return foundLeft;
        if(foundright!=null)
            return foundright;
        return null;
    }
}
