import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by z47 on 2021/9/23.
 */
public class t59PrintBinaryTreeZigzag {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Stack<TreeNode> stack1 = new Stack<TreeNode>();
        Stack<TreeNode> stack2 = new Stack<TreeNode>();
        stack1.push(pRoot);
        ArrayList<Integer> temp;
        int layer = 1;
        while (!stack1.isEmpty() || !stack2.isEmpty()){
            if (layer%2 == 0){
                temp = new ArrayList<Integer>();
                while (!stack2.isEmpty()){
                    TreeNode treeNode = stack2.pop();
                    if (treeNode!=null){
                        temp.add(treeNode.val);
                        stack1.push(treeNode.right);
                        stack1.push(treeNode.left);
                    }
                }
                if (!temp.isEmpty()){
                    result.add(temp);
                    layer++;
                }
            }else {
                temp = new ArrayList<Integer>();
                while(!stack1.empty()){
                    TreeNode treeNode = stack1.pop();
                    if (treeNode!=null){
                        temp.add(treeNode.val);
                        stack2.push(treeNode.left);
                        stack2.push(treeNode.right);
                    }
                }
                if (!temp.isEmpty()){
                    result.add(temp);
                    layer++;
                }
            }
        }
        return result;
    }
}
