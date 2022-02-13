package com.AlgorithmI;

import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersinEachNode {

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right, Node _next) {
            val = _val;
            left = _left;
            right = _right;
            next = _next;
        }
    };

    public Node connect(Node root) {
        if(root==null)
            return root;
        Queue<Node> queue = new LinkedList<>();
        if(root.left!=null)
            queue.offer(root.left);
        if(root.right!=null)
            queue.offer(root.right);
        while (!queue.isEmpty()){
            int size= queue.size();
            Node pr=queue.poll();
            if(pr.left!=null)
            queue.offer(pr.left);
            if(pr.right!=null)
            queue.offer(pr.right);
            for (int i = 1; i < size; i++) {
                Node cr=queue.poll();
                pr.next=cr;
                pr=cr;
                if(pr.left!=null)
                    queue.offer(pr.left);
                if(pr.right!=null)
                    queue.offer(pr.right);
            }
        }
        return root;
    }
}
