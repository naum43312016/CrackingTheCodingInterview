package asafov.com.ch3;

import java.util.EmptyStackException;

public class Stack {

    private int data;
    private Stack next;

    public Stack(int data) {
        this.data = data;
    }

    private int size=0;
    public Stack() {
    }

    private Stack top;

    public int pop(){
        if (top==null) throw new EmptyStackException();
        int d = top.data;
        top=top.next;
        size--;
        return d;
    }
    public void push(int item){
        Stack s = new Stack(item);
        s.next = top;
        size++;
        top = s;
    }

    public int getSize() {
        return size;
    }

    public int peek(){
        if (top==null) throw new EmptyStackException();
        return top.data;
    }
    public boolean isEmpty(){
        return top == null;
    }
}
