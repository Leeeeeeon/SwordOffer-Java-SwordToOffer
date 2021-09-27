import java.util.Stack;

/**
 * Created by z47 on 2021/6/9.
 */
public class t21IsPopOrder {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA == null || popA == null){return false;}
        Stack<Integer> stack = new Stack<Integer>();
        int popIndex = 0;                                      //初始化出栈下标
        for (int i = 0; i < pushA.length; i++) {               //依照入栈pushA顺序遍历
            stack.push(pushA[i]);                              //直接入栈
            while (!stack.isEmpty() && stack.peek() == popA[popIndex]){     //当且仅当栈不为空 且 栈顶与出栈序列当前值相等时
                stack.pop();                                                //出栈 出栈序号+1
                popIndex++;
            }
        }
        return stack.isEmpty();                                //通过判断遍历结束后stack的情况 为空则都出栈了 反之不符合
    }
}
