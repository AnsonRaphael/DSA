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
        System.out.println(isSymmetric(o1));
    }
    public static boolean isSymmetric(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        if(root==null)
            return true;
        while (!queue.isEmpty()){
            int size= queue.size();
            int [] arr= new int[size];
            for (int i = 0; i < size; i++) {
                TreeNode tmp=queue.poll();
                if(tmp==null)
                    arr[i]=-200;
                else
                    arr[i]=tmp.val;
                if(tmp!=null&&tmp.left!=null)
                    queue.offer(tmp.left);
                else
                    queue.offer(null);
                if(tmp!=null&&tmp.right!=null)
                    queue.offer(tmp.right);
                else
                    queue.offer(null);
            }
            int st=0,en=size-1;
            while (st<=en){
                if(arr[st]!=arr[en])
                    return false;
                st++;
                en--;
            }

        }
        return true;
    }
}
