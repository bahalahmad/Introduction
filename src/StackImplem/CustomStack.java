package StackImplem;

public class CustomStack {
    public int data[];
    public static final int DEFAULT_SIZE = 5;
    int ptr = -1;
    public CustomStack()
    {
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int element)  {
        if(isFull())
        {
            System.out.println("Stack is Full");
        }
        ptr++;
        data[ptr] = element;
        return  true;
    }
    public int pop() throws  StackException {
        if (isEmpty()) {
            throw new StackException("Cannot pop out from Empty stack");
        }
        int value = data[ptr];
        ptr--;
        return  value;
    }
    public boolean isFull() {
        return  ptr == data.length-1;
    }
    public boolean isEmpty() {
       return  ptr == -1;
    }


}
