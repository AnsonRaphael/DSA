package com.daily;

public class IncreasingOrderSearchTree {
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
        TreeNode node1= new TreeNode(3);
        TreeNode node2= new TreeNode(2);
        TreeNode node3= new TreeNode(4);
        TreeNode node4= new TreeNode(1);
        node1.left=node2;
        node1.right=node3;
        node2.left=node4;
        TreeNode head = increasingBST(node1);
        display(head);
    }

    private static void display(TreeNode head) {
        while(head!=null){
            System.out.println(head.val);
            head=head.right;
        }
    }
    static TreeNode newHead=null,head=null;
    public static TreeNode increasingBST(TreeNode root) {
        increasingBSTInorder(root);
        return head;
    }
    public static void increasingBSTInorder(TreeNode root) {
        if(root==null)
            return ;
       increasingBSTInorder(root.left);
        if(newHead==null) newHead=root;
        if(head==null) head=root;
        else {
            newHead.right = root;
            newHead = root;
            root.left = null;
        }
        increasingBSTInorder(root.right);
    }
}
