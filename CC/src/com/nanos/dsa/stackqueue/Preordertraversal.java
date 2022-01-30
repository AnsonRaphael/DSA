package com.nanos.dsa.stackqueue;

import java.util.ArrayList;
import java.util.Stack;

public class Preordertraversal {
    class Node {
        int data;
        Node left, right;

        Node(int item) {
            data = item;
            left = right = null;
        }
    }
        ArrayList<Integer> preOrder(Node root)
        {
            // Code
            ArrayList<Integer> res= new ArrayList<>();
                Stack<Node> st= new Stack<>();
                Node cur=root;
                while (cur!=null||!st.isEmpty()){
                    while (cur!=null){
                        res.add(cur.data);
                        st.push(cur);
                        cur=cur.left;
                    }
                    Node pop= st.pop();
                    cur=pop.right;
                }
            return res;
        }
}
