package com.datastructureI;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
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
    public List<Integer> inorderTraversal(TreeNode root) {
          if(root==null)
              return new ArrayList<>();
        List<Integer> res= new ArrayList<>();
        List<Integer> left = inorderTraversal(root.left);
        if(left!=null&&!left.isEmpty())
        res.addAll(left);

        res.add(root.val);

        List<Integer> right = inorderTraversal(root.right);
        if(right!=null&&!right.isEmpty())
        res.addAll(right);

        return res;
    }
    public List<Integer> inorderTraversal1(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<Integer> res= new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
        TreeNode curr=root;
        while (curr!=null||!stack.isEmpty()) {

            while (curr!=null){
                stack.push(curr);
                curr=curr.left;
            }
            curr=stack.pop();
            res.add(curr.val);
            curr=curr.right;
        }

        return res;
    }
}
