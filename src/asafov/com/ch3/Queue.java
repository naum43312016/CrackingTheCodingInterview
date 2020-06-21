package asafov.com.ch3;

import java.util.NoSuchElementException;

public class Queue {

    private int data;
    private Queue next;

    public Queue(int data) {
        this.data = data;
    }
    public Queue() {}

    private Queue first;
    private Queue last;
    public void add(int item){
        Queue q = new Queue(item);
        if (last!=null){
            last.next = q;
        }
        last = q;
        if (first==null){
            first=q;
        }
    }
    public int remove(){
        if (first==null) throw new NoSuchElementException();
        int d = first.data;
        first = first.next;
        if (first==null){
            last=null;
        }
        return d;
    }
    public int peek(){
        if (first==null) throw new NoSuchElementException();
        return first.data;
    }
    public boolean isEmpty(){
        return first==null;
    }
}
