import java.util.ArrayDeque;
import java.util.Deque;

public class Stack {
    public static void main(String[] args) {
        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(20);
        stack.push(50);
        stack.push(40);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

    }
}