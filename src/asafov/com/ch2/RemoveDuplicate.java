package asafov.com.ch2;

public class RemoveDuplicate {
    /*
    remove duplicates from linked list O(1) space
     */
    public void removeDup(Node head){
        if (head == null) return;
        Node previous = head;
        Node current = previous.next;
        while (current != null) {
            Node runner = head;
            while (runner != current) {
                if (runner.data == current.data) {
                    Node tmp = current.next;
                    previous.next = tmp;
                    current = tmp;
                    break;
                }
                runner = runner.next;
            }
            if (runner == current) {
                previous = current;
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Node n = new Node(1);
        n.next=new Node(2);
        n.next.next=new Node(3);
        n.next.next.next=new Node(1);
        new RemoveDuplicate().removeDup(n);
        while (n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}
