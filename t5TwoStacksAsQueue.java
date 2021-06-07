import java.util.Stack;

/**
 * Created by z47 on 2021/6/3.
 */
public class t5TwoStacksAsQueue {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
//        if (stack1.isEmpty() && stack2.isEmpty()) {
//            throw new RuntimeException("The queue is empty.");
//        }
        if(stack2.empty()){
            while(!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
