package StackImplem;
import java.util.*;
public class InBuiltStack {
    public static void main(String[] args){
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(10);
        stack.push(11);
        stack.push(8);
        stack.push(5);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
