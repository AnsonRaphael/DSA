package com.nanos.dsa.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
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
        TreeNode o3= new TreeNode(3);
        o1.left=null;
        o1.right=o2;
        o2.left=o3;
        o2.right=null;
        System.out.println(inorderTraversal(o1));
        System.out.println(inorderTraversalIterator(o1));
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
          if(root==null)
              return new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        List<Integer> left=inorderTraversal(root.left);
        if(left!=null&&!left.isEmpty())
        ll.addAll(left);

        ll.add(root.val);
        List<Integer> righ=inorderTraversal(root.right);
        if(righ!=null&&!righ.isEmpty())
        ll.addAll(righ);
        return ll;
    }
    public static List<Integer> inorderTraversalIterator(TreeNode root) {

        List<Integer> ll = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();

        TreeNode curr=root;
        while (curr!=null||!st.isEmpty()){

            while (curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            TreeNode tgm=st.pop();
            ll.add(tgm.val);
            curr=tgm.right;
        }
        return ll;
    }
}
