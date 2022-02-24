package com.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class CloneGraph {

    static class  Node {
        public int val;
        public List<Node> neighbors;
        public Node() {
            val = 0;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val) {
            val = _val;
            neighbors = new ArrayList<Node>();
        }
        public Node(int _val, ArrayList<Node> _neighbors) {
            val = _val;
            neighbors = _neighbors;
        }
    }


    public static void main(String[] args) {
        Node n1= new Node(1);
        Node n2= new Node(2);
        Node n3= new Node(3);
        Node n4= new Node(4);
        n1.neighbors.add(n2);
        n1.neighbors.add(n4);
        n2.neighbors.add(n1);
        n2.neighbors.add(n3);
        n3.neighbors.add(n2);
        n3.neighbors.add(n4);
        n4.neighbors.add(n1);
        n4.neighbors.add(n3);
        display(n1,new HashSet<>());
        System.out.println("--------------------");
        display(cloneGraph(n1),new HashSet<>());
    }



    public static Node cloneGraph(Node node) {
    // create clone and map old and new node
        HashMap<Node,Node> oldtoNew = new HashMap<>();
        HashSet<Node> visited = new HashSet<>();
        createMap(node,oldtoNew,visited);
     // connect nodes
        createconnection(node,oldtoNew,new HashSet<>());
        return oldtoNew.get(node);
    }

    public static void createconnection(Node node, HashMap<Node,Node> oldtoNew,HashSet<Node> visited){
        if(!visited.contains(node)){
            visited.add(node);
            Node copyNode=oldtoNew.get(node);
            for (int i = 0; i < node.neighbors.size(); i++) {
                copyNode.neighbors.add(oldtoNew.get(node.neighbors.get(i)));
            }

            for (int i = 0; i < node.neighbors.size(); i++) {
                createconnection(node.neighbors.get(i),oldtoNew,visited);
            }

        }
    }


    public static void createMap(Node node, HashMap<Node,Node> oldtoNew,HashSet<Node> visited){
        if(!visited.contains(node)){
            Node copyNode = new Node(node.val);
            oldtoNew.put(node,copyNode);
            visited.add(node);
            for (int i = 0; i < node.neighbors.size(); i++) {
                createMap(node.neighbors.get(i),oldtoNew,visited);
            }
            //node.val=-node.val;
        }
    }


    public static void display(Node node,HashSet<Node> visited){
        if(!visited.contains(node)){
            System.out.println(node.val);
           visited.add(node);
            for (int i = 0; i < node.neighbors.size(); i++) {
                display(node.neighbors.get(i),visited);
            }
            //node.val=-node.val;
        }
    }
}
