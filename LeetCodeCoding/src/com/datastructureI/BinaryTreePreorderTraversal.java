package com.datastructureI;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePreorderTraversal {
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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root==null)
            return  new ArrayList<Integer>();
        List<Integer> res= new ArrayList<Integer>();
        Stack<TreeNode> tmp= new Stack<TreeNode>();
        tmp.push(root);
        while(!tmp.isEmpty()){
            TreeNode lm= tmp.pop();
            res.add(lm.val);
            if(lm.right!=null)
                tmp.push(lm.right);
            if(lm.left!=null)
                tmp.push(lm.left);
        }
        return res;
    }
}
