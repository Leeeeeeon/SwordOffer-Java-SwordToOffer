/**
 * Created by z47 on 2021/6/10.
 */
public class t25ComplicatedLinkedListCopy {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;
        RandomListNode(int label) {this.label = label;}
    }
    public RandomListNode Clone(RandomListNode pHead) {
        if (pHead == null){return null;}
        RandomListNode randomListNode = pHead;  //初始化一个当前所遍历的节点的游标 用于从前往后遍历链表
        while (randomListNode != null){         //当前节点存在时，在原链表中一个隔一个插入克隆节点
            RandomListNode temp = new RandomListNode(randomListNode.label);
            temp.next = randomListNode.next;
            randomListNode.next = temp;
            randomListNode = temp.next;
        }
        randomListNode = pHead;                 //游标重新回到链表开头
        while (randomListNode != null){
            randomListNode.next.random = randomListNode.random == null ? null : randomListNode.random.next;
            randomListNode = randomListNode.next.next;
        }
        randomListNode = pHead;                 //游标重新回到链表开头
        RandomListNode cloneHead = pHead.next;  //指定克隆首节点
        while (randomListNode != null){
            RandomListNode temp = randomListNode.next;  //找到当前节点的克隆节点
            randomListNode.next = temp.next;            //当前节点的next重新指向原链表next 不再指向克隆节点
            temp.next = temp.next == null ? null : temp.next.next;  //克隆节点的next不再指向原链表 指向下一个克隆节点
            randomListNode = randomListNode.next;
        }
        return cloneHead;   //返回克隆复制的新链表首节点
    }
}
