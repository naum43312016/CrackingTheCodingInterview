package asafov.com.ch3;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.Queue;

public class ShelterQueue {
    Queue<Animal> queue = new LinkedList<>();
    public void enqueue(int id){
        queue.add(new Animal(id));
    }

    public Animal dequeueAny(){
        if (queue.isEmpty()) throw new EmptyStackException();
        return queue.poll();
    }
    public Animal dequeueDog(){
        if (queue.isEmpty()) throw new EmptyStackException();
        if (queue.peek().id==0){
            return queue.poll();
        }
        Animal animal=null;
        Queue<Animal> tmp = new LinkedList<>();
        while (!queue.isEmpty()){
            Animal a = queue.poll();
            if (a.id==0){
                animal = a;
            }else {
                tmp.add(a);
            }
        }
        Queue<Animal> q = new LinkedList<>();
        while (!tmp.isEmpty()){
            q.add(tmp.poll());
        }
        while (!queue.isEmpty()){
            q.add(queue.poll());
        }
        queue = q;
        return animal;
    }
    public Animal dequeueCat(){
        if (queue.isEmpty()) throw new EmptyStackException();
        if (queue.peek().id==1){
            return queue.poll();
        }
        Animal animal=null;
        Queue<Animal> tmp = new LinkedList<>();
        while (!queue.isEmpty()){
            Animal a = queue.poll();
            if (a.id==1){
                animal = a;
            }else {
                tmp.add(a);
            }
        }
        Queue<Animal> q = new LinkedList<>();
        while (!tmp.isEmpty()){
            q.add(tmp.poll());
        }
        while (!queue.isEmpty()){
            q.add(queue.poll());
        }
        queue = q;
        return animal;
    }
}

class Animal{
    int id;//0 dog 1 cat

    public Animal(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                '}';
    }
}
