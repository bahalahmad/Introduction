package QueueImplem;
import java.util.*;
class InbuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(20);
        queue.add(30);
        queue.add(50);
        queue.add(60);
        queue.add(90);

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
       // System.out.println(queue.remove());
        System.out.println(queue.peek());
    }

}
