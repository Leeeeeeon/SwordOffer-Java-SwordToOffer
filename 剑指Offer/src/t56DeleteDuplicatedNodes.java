/**
 * Created by z47 on 2021/9/17.
 */
public class t56DeleteDuplicatedNodes {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode deleteDuplication(ListNode pHead) {
        ListNode result = new ListNode(0);
        result.next = pHead;
        ListNode pre = result;  //pre游标指向当前确定不重复的节点，current为遍历游标，一直往后遍历
        ListNode current = pHead;  //遍历游标由原链表首节点开始遍历，所以新头节点的值不会加入比较
        while (current!=null){
            if (current.next != null && current.next.val == current.val){
                while (current.next != null && current.next.val == current.val){
                    current = current.next;
                }
                pre.next = current.next;  //上面循环后current指向最后一个重复的节点，所以current.next指向接下来第一个不重复的节点，将pre的下一跳指向这个不重复节点
                current = current.next;  //pre的下一跳跳过所有重复节点，链接到后面第一个不重复节点后，继续从下一跳节点遍历
            }else {  //如果没有重复节点，就把pre后移一位，并且current游标也指向下一个节点，从下一个节点继续遍历判断
                pre = pre.next;
                current = current.next;
            }
        }
        return result.next;
    }
}
