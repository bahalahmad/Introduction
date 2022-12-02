package Queue;

public class CustomQueue {
    public int data[];
    public static final int DEFAULT_SIZE = 5;
    int end = -1;

    CustomQueue() {
        this(DEFAULT_SIZE);
    }
    CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int item){
        if(isFull()){
            System.out.println("Queue is Full");
            return false;
        }
        data[++end] =item;
        return true;
    }
    public boolean isFull() {
        return end == data.length-1;
    }

    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot Insert item in empty queue");
        }
        int removed = data[0];
        for(int i=1; i<end;i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
   public void display(){
        for(int i=0; i<end; i++){
            System.out.print(data[i] + "-->" );
        }
       System.out.println(end);
   }
    public boolean isEmpty() {
        return end == -1;
    }


}
