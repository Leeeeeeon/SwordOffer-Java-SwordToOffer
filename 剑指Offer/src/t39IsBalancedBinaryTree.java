/**
 * Created by z47 on 2021/9/4.
 */
public class t39IsBalancedBinaryTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
}
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root==null) return true;
        return treeDepth(root) != -1;
    }
    public int treeDepth(TreeNode root){
        if (root == null) return 0;  //如果当前根节点为空，深度返回0
        int leftDepth = treeDepth(root.left);  //递归到树底部计算当前根节点左子树的深度，从底向上计算过程中如果发现一处不平衡，直接返回-1，也不会再递归总根节点的右子树
        if (leftDepth == -1) return -1;
        int rightDepth = treeDepth(root.right);  //在当前根节点左子树平衡的前提下再递归计算右子树的深度，如果右子树有一处不平衡也直接返回-1，递归结束
        if (rightDepth == -1) return -1;
        return Math.abs(rightDepth - leftDepth) > 1 ? -1 : Math.max(leftDepth, rightDepth) + 1;  //核心的计算树深度的代码，如果当前根节点的左右子树深度相差超过1则不平衡，否则返回当前根节点的深度
    }
}
