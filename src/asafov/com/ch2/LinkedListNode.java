package asafov.com.ch2;

import java.util.Objects;

/*
doubly linked list
 */
public class LinkedListNode {
    LinkedListNode prev;
    LinkedListNode next;
    int data;
    public LinkedListNode(int d){
        data=d;
    }

    public void print(LinkedListNode list){
        if (list==null){
            System.out.println("list is empty");
        }
        while (list!=null){
            int d = list.data;
            Integer prev=null;
            Integer next=null;
            if (list.prev!=null){
                prev=list.prev.data;
            }
            if (list.next!=null){
                next=list.next.data;
            }
            System.out.println(d + " prev="+prev + " next="+next);
            list=list.next;
        }
    }

    public LinkedListNode() {}

    public LinkedListNode createList(int[] arr){
        int i = 0;
        if (arr==null || arr.length==0) return null;
        LinkedListNode head = new LinkedListNode(arr[i++]);
        LinkedListNode node = head;

        while (i<arr.length){
            LinkedListNode t = new LinkedListNode(arr[i++]);
            node.next = t;
            t.prev = node;
            node=node.next;
        }
        return head;
    }
}
