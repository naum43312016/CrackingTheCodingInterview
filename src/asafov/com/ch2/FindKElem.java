package asafov.com.ch2;
/*
Remove k-th element from tail in one dir linked list
 */
public class FindKElem {
    public int findElemFromTail(Node head,int k){
        if (head==null) return -1;
        //1 2 3 4 5 6 7 8
        Node pre = head;
        Node tail = pre;
        int i=1;
        while (i<=k){
            tail=tail.next;
            i++;
        }
        while (true){
            int count = 1;
            while (tail!=null && count<=k){
                tail=tail.next;
                count++;
            }
            while (count>1){
                pre=pre.next;
                count--;
            }
            if (tail==null){
                return pre.data;
            }
        }
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        n.next=new Node(2);
        n.next.next=new Node(3);
        n.next.next.next=new Node(4);
        n.next.next.next.next=new Node(5);
        int ans = new FindKElem().findElemFromTail(n,3);
        System.out.println(ans);
    }
}
