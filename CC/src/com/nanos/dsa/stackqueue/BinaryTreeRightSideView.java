package com.nanos.dsa.stackqueue;

import java.util.*;

public class BinaryTreeRightSideView {
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

    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> lm = new ArrayList<>();
        Queue<TreeNode> dq  =new LinkedList<>();
        dq.add(root);
        while (!dq.isEmpty()){
            int sz= dq.size();
            for (int i = 0; i < sz; i++) {
                TreeNode curr = dq.peek();
                dq.remove();
                if(i==sz-1)
                    lm.add(curr.val);

                if(curr.left!=null)
                    dq.add(curr.left);

                if(curr.right!=null)
                    dq.add(curr.right);
            }
        }
        return lm;
    }




}
