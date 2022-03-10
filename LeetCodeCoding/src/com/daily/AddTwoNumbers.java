package com.daily;

public class AddTwoNumbers {
    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode();
        ListNode res1=res;
        int car=0;
        while(l1!=null&&l2!=null){
            int sum = l1.val+l2.val+car;
            car =sum/10;
            sum=sum%10;
            res.next=new ListNode(sum);
            res= res.next;
            l1=l1.next;
            l2=l2.next;
        }
        while(l1!=null){
            int sum = l1.val+car;
            car =sum/10;
            sum=sum%10;
            res.next=new ListNode(sum);
            res= res.next;
            l1=l1.next;
        }
        while(l2!=null){
            int sum = l2.val+car;
            car =sum/10;
            sum=sum%10;
            res.next=new ListNode(sum);
            res= res.next;
            l2=l2.next;
        }
        if(car!=0)
            res.next=new ListNode(car);

        return res1.next;
    }
}
