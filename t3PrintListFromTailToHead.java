import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by z47 on 2021/6/3.
 */
public class t3PrintListFromTailToHead {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public class Solution {
        public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            Stack<Integer> stack = new Stack<Integer>();
            while(listNode!=null){
                stack.push(listNode.val);
                listNode=listNode.next;
            }
            ArrayList<Integer> array = new ArrayList<Integer>();
            while(!stack.isEmpty()){
                array.add(stack.pop());
            }
            return array;
        }
    }
}
