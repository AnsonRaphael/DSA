package com.daily;

public class CopyListwithRandomPointer {

    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }

    public Node copyRandomList(Node head) {
        Node tmp=head;
        if(head==null)
            return head;
        // intertwine
        while (tmp!=null){
            Node nxt=tmp.next;
            Node rn=tmp.random;
            Node nl= new Node(tmp.val);
            nl.next=nxt;
            nl.random=rn;
            tmp.next=nl;
            tmp=nxt.next;
        }
        // re map  rndm
        Node tmplm=head;
        Node newN=head.next;
        while (tmplm!=null){
            if(tmplm.next!=null){
                tmplm.next.random=tmplm.random==null?null:tmplm.random.next;
                tmplm =tmplm.next.next;
            }
        }
        // re map nxt
        Node tmpl=head;

        while (tmpl!=null){
            Node nxt=tmpl.next;
            if(tmpl.next!=null)
            tmpl.next=tmpl.next.next;
            if(nxt.next!=null){
                nxt.next=nxt.next.next;
                tmpl=nxt.next;
            }else
            tmpl=null;
        }
        return newN;
    }
}
