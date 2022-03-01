package com.datastructureI;

import java.util.LinkedList;
import java.util.Queue;

public class TwoSumIVInputisaBST {
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

    }
    public static boolean findTarget(TreeNode root, int k) {
         if(root==null)
             return false;
        Queue<TreeNode> queue= new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode c = queue.poll();
            int t= k-c.val;
            TreeNode fn=searchBST(root,t);
            if(fn!=null&&fn!=c)
                return true;
            if(c.left!=null)
            queue.add(c.left);

            if(c.right!=null)
                queue.add(c.right);
        }
        return false;
    }

    public static TreeNode searchBST(TreeNode root, int val) {
        if(root==null)
            return null;

        if(root.val==val)
            return root;

        if(root.val<val)
            return searchBST(root.right,val);
        else
            return searchBST(root.left,val);
    }
}
