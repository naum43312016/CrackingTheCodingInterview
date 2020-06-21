package asafov.com.ch2;

public class Node {
    public Node next;
    public int data;

    public Node(int data) {
        this.data = data;
    }
    public Node(){}

    public Node createList(int[] arr){
        if (arr==null || arr.length==0){
            return null;
        }
        Node head = new Node(arr[0]);
        Node n = head;
        int i=1;
        while (i<arr.length){
            n.next = new Node(arr[i++]);
            n=n.next;
        }
        return head;
    }

    public void print(Node node){
        while (node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }
}
