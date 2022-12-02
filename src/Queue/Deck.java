package Queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deck {
    public static void main(String[] args){
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(20);
        deque.add(10);
        deque.addLast(30);

        System.out.println(deque.remove());
        System.out.println(deque.removeLast());
    }

}
