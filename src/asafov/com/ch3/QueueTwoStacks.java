package asafov.com.ch3;

import java.util.EmptyStackException;

public class QueueTwoStacks {
    private Stack stack = new Stack();

    public void add(int item){
        stack.push(item);
    }

    public int get(){
        if (stack.getSize()==0) throw new EmptyStackException();
        Stack s = changeStack(stack);
        int d = s.pop();
        stack = changeStack(s);
        return d;
    }

    private Stack changeStack(Stack stack) {
        Stack newStack = new Stack();
        while (!stack.isEmpty()){
            newStack.push(stack.pop());
        }
        return newStack;
    }
}
