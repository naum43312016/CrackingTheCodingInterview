package asafov.com.ch2;

public class Palindrome {

    public boolean isPalindrome(Node n){
        Node rev = reverse(n);
        return isEqual(n,rev);
    }

    public boolean isEqual(Node n,Node r){
        while (n!=null && r!=null){
            if (n.data!=r.data) return false;
            n=n.next;
            r=r.next;
        }
        return true;
    }

    public Node reverse(Node n){
        if (n==null) return null;
        Node head = null;
        while (n!=null){
            Node node = new Node(n.data);
            node.next = head;
            head=node;
            n=n.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] a1={7,1,1,7};
        Node n1 = new Node().createList(a1);
        boolean ans = new Palindrome().isPalindrome(n1);
        System.out.println(ans);
    }
}
