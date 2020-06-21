package asafov.com.ch2;

public class Partition {
    public void part(Node n,int x){
        if (n==null || n.next==n) return;
        while (n!=null){
            Node t = n;
            if (n.data>=x){
                while (t.next!=null){
                    if (t.data<x){
                        int tm = t.data;
                        t.data=n.data;
                        n.data = tm;
                    }
                    t=t.next;
                }
            }
            n=n.next;
        }

    }

    public static void main(String[] args) {
        int[] a = {10,5,2,7,8,5,1,6,8,4,3,1,6};
        Node n = new Node().createList(a);
        new Partition().part(n,5);
        while (n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
}
