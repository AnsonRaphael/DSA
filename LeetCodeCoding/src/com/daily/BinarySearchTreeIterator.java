package com.daily;

import java.util.Stack;

public class BinarySearchTreeIterator {
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
    Stack<TreeNode> stack = new Stack<>();

    public BinarySearchTreeIterator(TreeNode root) {
        populate(root);
    }
    private void populate(TreeNode root){
        while(root!=null){
            stack.add(root);
            root=root.left;
        }
    }

    public int next() {
        TreeNode curnt=stack.pop();
        populate(curnt.right);
        return curnt.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
