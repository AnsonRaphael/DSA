package com.nanos.dsa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {


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

    class Solution {
        public List<List<Integer>> levelOrder(TreeNode root) {
            if(root==null)
                return new ArrayList<>();
            List<List<Integer>> res= new ArrayList<>();
            Queue<TreeNode> queue= new LinkedList<>();
            queue.add(root);
            while(!queue.isEmpty()){
                List<Integer> data= new ArrayList<>();
                int siz=queue.size();
                for(int i=0;i<siz;i++){
                    TreeNode node = queue.poll();
                    if(node!=null){
                        data.add(node.val);
                        queue.offer(node.left);
                        queue.offer(node.right);
                    }
                }
                if(data.size()!=0)
                    res.add(data);
            }

            return res;
        }
    }
}
