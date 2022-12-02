package Queue;

public class CircularQueueMain {
    public static void main(String[] args) throws CircularQueueException {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(30);
        queue.insert(60);
        queue.insert(50);
        queue.insert(190);
        queue.insert(10);


        queue.display();

        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.remove());
        queue.display();
        System.out.println(queue.remove());
        queue.display();
    }
}
