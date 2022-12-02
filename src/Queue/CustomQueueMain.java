package Queue;

public class CustomQueueMain {
    public static void main(String[] args) throws QueueException {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(20);
        queue.insert(30);
        queue.insert(11);
        queue.insert(23);
        queue.insert(16);

        // System.out.println(queue.peek());
        //System.out.println(queue.remove());
        //System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();
    }
}
