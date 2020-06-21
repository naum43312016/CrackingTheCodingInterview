package asafov.com.ch3;

public class ThreeStacksArray {
    private Stack[] array;

    public ThreeStacksArray() {
        array = new Stack[3];
        for (int i=0;i<array.length;i++){
            array[i]=new Stack();
        }
    }

    public void push(int arrIndex,int data){
        array[arrIndex].push(data);
    }
    public int pop(int arrIndex){
        return array[arrIndex].pop();
    }
    public int peek(int arrIndex){
        return array[arrIndex].peek();
    }
    public boolean isEmpty(int arrIndex){
        return array[arrIndex].isEmpty();
    }
}
