package asafov.com.ch3;

import java.util.EmptyStackException;
import java.util.TreeSet;

public class StackMinImpl {

    private int data;
    private StackMinImpl next;

    public StackMinImpl(int data) {
        this.data = data;
    }

    public StackMinImpl() {}

    private StackMinImpl top;

    private StackMinImpl min;
    private TreeSet<Integer> set = new TreeSet<>();
    public int pop(){
        if (top==null) throw new EmptyStackException();
        int d = top.data;
        top=top.next;
        set.remove(d);
        return d;
    }
    public void push(int item){
        StackMinImpl s = new StackMinImpl(item);
        s.next = top;
        top = s;
        set.add(s.data);
    }
    public int min(){
        if (set.size()<1) throw new EmptyStackException();
        return set.first();
    }
    public int peek(){
        if (top==null) throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
