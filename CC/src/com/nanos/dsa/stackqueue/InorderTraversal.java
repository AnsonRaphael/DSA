package com.nanos.dsa.stackqueue;

import java.util.ArrayList;
import java.util.Stack;

public class InorderTraversal {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
        ArrayList<Integer> inOrder(Node root) {
            // Code
            ArrayList<Integer> res = new ArrayList<>();
            Stack<Node> st = new Stack<>();
            Node cur = root;
            while (cur != null || !st.isEmpty()) {

                while (cur!=null){
                    st.push(cur);
                    cur=cur.left;
                }
                Node p=st.pop();
                res.add(p.data);

                cur=p.right;
            }
        return res;
    }
}
