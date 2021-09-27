/**
 * Created by z47 on 2021/9/22.
 */
public class t57FindNextNode {
    public class TreeLinkNode {
        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null;

        TreeLinkNode(int val) {
            this.val = val;
        }
    }
    public TreeLinkNode GetNext(TreeLinkNode pNode) {
        if (pNode == null)return null;
        if (pNode.right != null){
            TreeLinkNode treeLinkNode = pNode.right;
            while (treeLinkNode.left != null){
                treeLinkNode = treeLinkNode.left;
            }
            return treeLinkNode;
        }else{
            TreeLinkNode treeLinkNode = pNode;
            while(treeLinkNode.next!=null){
                if(treeLinkNode.next.left==treeLinkNode){
                    return treeLinkNode.next;
                }
                treeLinkNode = treeLinkNode.next;
            }
            return null;
        }
    }
}
