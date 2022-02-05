package com.nanos.dsa.tree;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {
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
        TreeNode o1= new TreeNode(1);
        TreeNode o2= new TreeNode(2);
        TreeNode o3= new TreeNode(2);
        TreeNode o4= new TreeNode(3);
        TreeNode o5= new TreeNode(4);
        TreeNode o6= new TreeNode(3);
        TreeNode o7= new TreeNode(4);
        o1.left=o2;
        o1.right=o3;
        o2.left=o4;
        o2.right=o5;
        o3.left=o7;
        o3.right=o6;
        System.out.println(isSymmetric1(o1));
    }
    // iterative
    public static boolean isSymmetric(TreeNode root) {
        if(root==null)
            return true;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while (!queue.isEmpty()){
            TreeNode lef=queue.poll();
            TreeNode right=queue.poll();
            if(lef==null&&right==null)
                continue;
            if(lef==null&&right!=null||lef!=null&&right==null)
                return false;
            if(lef.val!=right.val)
                return false;

            queue.offer(lef.left);

            queue.offer(right.right);

            queue.offer(lef.right);

            queue.offer(right.left);
        }

        return true;
    }

    public static boolean isSymmetric1(TreeNode root) {
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
