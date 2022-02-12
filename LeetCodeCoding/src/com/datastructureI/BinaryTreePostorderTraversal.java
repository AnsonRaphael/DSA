package com.datastructureI;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversal {
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
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<Integer> res= new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
        Stack<TreeNode> out= new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode curr=stack.pop();
            out.push(curr);
            if(curr.left!=null)
            stack.push(curr.left);
            if(curr.right!=null)
            stack.push(curr.right);
        }
        while (!out.isEmpty()) {
            res.add(out.pop().val);
        }
        return res;
    }
    public List<Integer> postorderTraversal1(TreeNode root) {
        if(root==null)
            return new ArrayList<>();
        List<Integer> res= new ArrayList<>();

        List<Integer> left =postorderTraversal1(root.left);
        if(left!=null&&!left.isEmpty()){
            res.addAll(left);
        }

        List<Integer> right =postorderTraversal1(root.right);
        if(right!=null&&!right.isEmpty()){
            res.addAll(right);
        }

        res.add(root.val);
        return res;
    }
}
