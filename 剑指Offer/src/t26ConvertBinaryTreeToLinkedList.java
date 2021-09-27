/**
 * Created by z47 on 2021/6/11.
 */
public class t26ConvertBinaryTreeToLinkedList {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {this.val = val;}
    }
    private TreeNode linkList = null;
    private TreeNode list = linkList;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null){return null;}
        ConvertBst(pRootOfTree);
        return linkList;
    }
    public void ConvertBst(TreeNode pRootOfTree) {
        if (pRootOfTree.left!=null){
            Convert(pRootOfTree.left);
        }
        if (list == null){linkList = pRootOfTree;list = pRootOfTree;}
        else{list.right = pRootOfTree;list.right.left = list;list = list.right;}
        if (pRootOfTree.right!=null){
            Convert(pRootOfTree.right);
        }
    }
}
