/**
 * Created by z47 on 2021/6/8.
 */
public class t18MirrorBinaryTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {this.val = val;}
    }
    public TreeNode Mirror (TreeNode pRoot) {
        if (pRoot == null){return null;}
        TreeNode treeNode = Mirror(pRoot.left); //将递归交换后的左子树存在treeNode内
        pRoot.left = Mirror(pRoot.right);       //将递归交换后的右子树替换左子树
        pRoot.right = treeNode;                 //将treeNode替换右子树
        return pRoot;
    }
}
