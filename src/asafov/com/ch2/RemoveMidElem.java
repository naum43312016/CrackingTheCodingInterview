package asafov.com.ch2;

public class RemoveMidElem {

    public void removeMid(Node mid){
        if (mid==null || mid.next==null) return;
        mid.data=mid.next.data;
        mid.next=mid.next.next;
    }
    public static void main(String[] args) {
        Node n = new Node(1);
        n.next=new Node(2);
        n.next.next=new Node(3);
        n.next.next.next=new Node(4);
        n.next.next.next.next=new Node(5);
        new RemoveMidElem().removeMid(n.next.next);
        while (n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}
