package StackImplem;

public class DynamicStackMain {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new DynamicStack(5);

        stack.push(12);
        stack.push(10);
        stack.push(11);
        stack.push(8);
        stack.push(5);
        stack.push(12);
        stack.push(50);
        stack.push(55);
        //stack.push(12);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
