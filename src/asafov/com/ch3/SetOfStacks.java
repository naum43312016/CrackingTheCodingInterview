package asafov.com.ch3;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class SetOfStacks {
    private List<Stack> list = new ArrayList<>();
    private int MAX_SIZE = 3;

    public SetOfStacks() {}

    public void push(int item){
        if (list.size()==0){
            Stack s = new Stack();
            s.push(item);
            list.add(s);
        }else{
            if (list.get(0).getSize()>3){
                changeList();
            }
            list.get(0).push(item);
            //System.out.println("size=" + list.get(0).getSize() + " data="+item);
        }
    }
    public int pop(){
        if (list.size()==0) throw new EmptyStackException();
        Stack s =list.get(0);
        int d = s.pop();
        if (s.isEmpty()){
            list.remove(0);
        }
        return d;
    }

    private void changeList() {
        list.add(new Stack());
        Queue q = new Queue();
        for (int i=0;i<list.size();i++){
            if (!list.get(i).isEmpty()){
                q.add(list.get(i).pop());
            }
        }
        int j=1;
        while (j<list.size()){
            for (int k=0;k<MAX_SIZE;k++){
                if (q.isEmpty()) break;
                list.get(j).push(q.remove());
            }
            j++;
        }
    }
}
