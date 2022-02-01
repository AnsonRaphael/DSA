package com.nanos.dsa.stackqueue;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

class Node{
    int key,value;
    Node prev,next;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public Node() {
        this(0,0);
    }
}
public class LRUCaches {


   static class LRUCache {
       Node head=new Node();
       Node tail=new Node();
       HashMap<Integer,Node> cache;
       int capacity;

        public LRUCache(int capacity) {
            cache= new HashMap<>();
            this.capacity=capacity;
            head.next=tail;
            tail.prev=head;
        }

        public int get(int key) {
            int val=-1;
            if(cache.containsKey(key)){
                Node accessNode = cache.get(key);
                val=accessNode.value;
                removeNode(accessNode);
                Node newNode= new Node(key,accessNode.value);
                cache.put(key,newNode);
                moveToFirst(newNode);
            }
            return val;
        }

        public void put(int key, int value) {

            if(cache.containsKey(key)){
                Node accessNode = cache.get(key);
                removeNode(accessNode);
                Node newNode= new Node(key,value);
                cache.put(key,newNode);
                moveToFirst(newNode);
            }else{
                if(cache.size()==capacity){
                    cache.remove(tail.prev.key);
                    removeNode(tail.prev);
                }
                Node newNode = new Node(key, value);
                cache.put(key,newNode);
                moveToFirst(newNode);
            }

        }
        public void removeNode(Node node){
            node.prev.next=node.next;
            node.next.prev=node.prev;

        }
        public void moveToFirst(Node node){
            Node temp= head.next;
            head.next=node;
            node.prev=head;
            node.next=temp;
            temp.prev=node;
        }
        public void display(){
            Node l =head.next;
            while (l!=null&&l!=head){
                System.out.print(" key: "+l.key+" val: "+l.value+" ->");
                l=l.next;
            }
            System.out.println("cache:-");
            Iterator<Map.Entry<Integer, Node>> iteratr = cache.entrySet().iterator();
            while (iteratr.hasNext()){
                Map.Entry<Integer, Node> entry= iteratr.next();
                System.out.println(" key :" +entry.getKey()+" val: "+entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        LRUCache cache = new LRUCache(2);
        cache.put(1,0);
        cache.display();
        cache.put(2,2);
        cache.display();
        cache.get(1);
        cache.display();
        cache.put(3,3);
        cache.display();
        cache.get(2);
        cache.display();
        cache.put(4,4);
        cache.display();
        cache.get(1);
        cache.display();
        cache.get(3);
        cache.display();
        cache.get(4);
        cache.display();

   }
}















//////////////////////////////
//class LRUCache {
//    LinkedList<Integer> lruIndex;
//    HashMap<Integer,Integer> cache;
//    int capacity;
//
//    public LRUCache(int capacity) {
//        cache= new HashMap<>();
//        lruIndex = new LinkedList<>();
//        this.capacity=capacity;
//    }
//
//    public int get(int key) {
//        int val=-1;
//        if(cache.containsKey(key)){
//            val= cache.get(key);
//            lruIndex.remove((Integer)key);
//            lruIndex.addFirst(key);
//        }
//        return val;
//    }
//
//    public void put(int key, int value) {
//
//        if(cache.containsKey(key)||lruIndex.size()<capacity){
//            cache.put(key,value);
//            if(cache.containsKey(key))
//                lruIndex.remove((Integer)key);
//            lruIndex.addFirst(key);
//        }else if(!cache.containsKey(key)&&lruIndex.size()<capacity){
//            cache.put(key,value);
//            lruIndex.addFirst(key);
//            capacity++;
//        }else{
//            int keyremove=lruIndex.getLast();
//            lruIndex.remove((Integer)keyremove);
//            cache.remove((Integer)keyremove);
//            cache.put(key,value);
//            lruIndex.addFirst(key);
//        }
//
//
//    }
//
//
//
//}
//
///**
// * Your LRUCache object will be instantiated and called as such:
// * LRUCache obj = new LRUCache(capacity);
// * int param_1 = obj.get(key);
// * obj.put(key,value);
// */