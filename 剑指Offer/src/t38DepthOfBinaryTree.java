/**
 * Created by z47 on 2021/9/4.
 */

public class t38DepthOfBinaryTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public int TreeDepth(TreeNode root) {
        if (root == null)return 0;
        return findTreeDepth(root);
    }
    public int findTreeDepth(TreeNode root){
        int leftDepth=0;
        int rightDepth=0;
        if (root.left != null){
            leftDepth += findTreeDepth(root.left);
        }
        if (root.right != null){
            rightDepth += findTreeDepth(root.right);
        }
        return 1 + ((leftDepth >= rightDepth) ? leftDepth : rightDepth);
    }

//    public int treeDepth(TreeNode root) {
//        if (root == null) return 0;
//        int leftDepth = treeDepth(root.left);  //递归求出当前根节点左子树和右子树的深度
//        int rightDepth = treeDepth(root.right);
//        return Math.max(leftDepth, rightDepth) + 1;  //从底向上递归返回左右子树深度的较大值，加1即当前根节点的深度
//    }
}
