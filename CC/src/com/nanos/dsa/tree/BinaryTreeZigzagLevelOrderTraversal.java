package com.nanos.dsa.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
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


    public static void main(String[] args) {

    }
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root==null)
            return new ArrayList<>();

        List<List<Integer>> res= new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        q.offer(root);
        boolean fl= false;
        while(!q.isEmpty()){
            List<Integer> data = new ArrayList<>();
            int siz= q.size();
            for(int i=0;i<siz;i++){
                TreeNode node =q.poll();
                if(node!=null){
                    data.add(node.val);
                    q.offer(node.left);
                    q.offer(node.right);
                }
            }
            if(fl){
                data=reverse(data);
                fl=false;
            }else{
                fl=true;
            }
            if(data.size()!=0)
            res.add(data);
        }
        return res;
    }

    public static List<Integer> reverse(List<Integer> data){
        List<Integer> res= new ArrayList<>();
        for (int i=data.size()-1;i>=0;i--){
            res.add(data.get(i));
        }
        return res;
    }

}
