/**
 * Created by z47 on 2021/9/22.
 */
public class t58IsSymmetricalBinaryTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    }
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null)return true;
        if (pRoot.right == null && pRoot.left == null)return true;
        if (pRoot.left.val == pRoot.right.val){
            return compareLeftAndRight(pRoot.left,pRoot.right);
        }else return false;
    }
    boolean compareLeftAndRight(TreeNode pLeft,TreeNode pRight){
        if (pLeft == null && pRight == null)return true;
        else if (pLeft == null && pRight != null || pRight == null && pLeft != null) return false;
        else return pLeft.val == pRight.val && compareLeftAndRight(pLeft.left, pRight.right) && compareLeftAndRight(pLeft.right, pRight.left);
    }
}
