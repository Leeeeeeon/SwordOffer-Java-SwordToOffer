/**
 * Created by z47 on 2021/6/8.
 */
public class t16MergeTwoLinkedLists {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode Merge1(ListNode list1,ListNode list2) {
        if (list1 == null && list2 == null) {return null;}
        if (list1 == null){return list2;}
        if (list2 == null){return list1;}
        ListNode listNode1 = list1;
        ListNode listNode2 = list2;
        ListNode result = new ListNode(0);
        ListNode temp = result;
        while (listNode1 != null && listNode2 != null){
            if (listNode1.val > listNode2.val){
                temp.next = listNode2;
                temp = temp.next;
                listNode2 = listNode2.next;
            }else if (listNode1.val <= listNode2.val){
                temp.next = listNode1;
                temp = temp.next;
                listNode1 = listNode1.next;
            }
        }
        if (listNode1 == null){
            temp.next = listNode2;
        }
        if (listNode2 == null){
            temp.next = listNode1;
        }
        return result.next;
    }
//    递归版本
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }
        if(list1.val <= list2.val){
            list1.next = Merge(list1.next, list2);
            return list1;
        }else{
            list2.next = Merge(list1, list2.next);
            return list2;
        }
    }
}
