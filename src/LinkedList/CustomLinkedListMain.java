package LinkedList;

public class CustomLinkedListMain {
    public static  void main(String[] args){
        CustomLinkedlist list = new CustomLinkedlist();
        list.insertAtbeg(20);
        list.insertAtbeg(30);
        list.insertAtbeg(40);
        list.insertAtbeg(50);

        list.insertAtend(11);

        list.display();
        list.insert(10,4);
        list.display();
    }
}
