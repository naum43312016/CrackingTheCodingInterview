package asafov.com.ch3;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        ShelterQueue s=  new ShelterQueue();
        s.enqueue(0);
        s.enqueue(1);
        s.enqueue(1);
        s.enqueue(0);
        System.out.println(s.dequeueCat());
    }
}
