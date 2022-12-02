package LinkedList;

public class CustomLinkedlist {
    private  Node head;   // head and tail are reference variable pointing to nodes
    private  Node tail;
    public int size;

    public CustomLinkedlist(){
        this.size = 0;
    }

    public void insertAtbeg(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;

        if(tail== null){
            tail = head;
        }
        size++;
    }
    public void insertAtend(int value){
        if(tail==null){
            insertAtbeg(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insert(int value, int index){
        if(index==0){
            insertAtbeg(value);
            return;
        }
        if(index == size){
            insertAtend(value);
            return;
        }
        Node temp = head;
        for(int i=1; i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(value,temp.next);
        temp.next = node;
        size ++;
    }

    public Node get(int  index){
        Node node = head;
        for(int i=0; i<index; i++){
            node = node.next;
        }
        return node;
    }


        public  void display(){
        Node temp;
        temp = head;
        while(temp!=null) {
            System.out.print(temp.value + "-> ");
            temp = temp.next;
        }
            System.out.println();
    }
    private class Node{
        int value;
        Node next;  //It pointing to another object of type node

        public Node(int value){
            this.value = value;
        }
        public Node(int value, Node next){
            this.value = value;
            this.next = next;
        }

    }


}


