import java.util.ArrayList;

/**
 * Created by z47 on 2021/9/17.
 */
public class t55EntranceOfLoopLinkedList {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        ArrayList<ListNode> listNodeArrayList = new ArrayList<ListNode>();
        while (pHead!=null){
            if (!listNodeArrayList.contains(pHead)){
                listNodeArrayList.add(pHead);
                pHead = pHead.next;
            }else return pHead;
        }
        return null;
    }
}
