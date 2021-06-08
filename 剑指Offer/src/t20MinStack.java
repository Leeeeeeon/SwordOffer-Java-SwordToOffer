import java.util.Stack;

/**
 * Created by z47 on 2021/6/8.
 */
public class t20MinStack {

    Stack<Integer> stack = new Stack<Integer>();
    Stack<Integer> min = new Stack<Integer>();

    public void push(int node) {
        if (min.empty()){                           //min为空直接入栈
            min.push(node);
        }else if (node < min.peek()){               //如果node小于min当前栈顶 入栈node
            min.push(node);
        }else {                                     //否则再次入栈min当前栈顶数值
            min.push(min.peek());
            //min.push(Math.min(node,min.peek()));
        }
        stack.push(node);                           //始终入栈stack
    }

    public void pop() {                             //因为入栈时 当node大于min栈顶时 入栈了min最小值 所以可以进行出栈 直到最小值同stack一起出栈
        min.pop();
        stack.pop();
    }

    public int top() {                              //stack栈顶
        return stack.peek();
    }

    public int min() {                              //min栈顶
        return min.peek();
    }
}
