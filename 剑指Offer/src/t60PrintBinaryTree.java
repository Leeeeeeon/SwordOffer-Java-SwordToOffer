import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class t60PrintBinaryTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }

    //更简单的递归方法
    public ArrayList<ArrayList<Integer>> print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();  //用包含多个列表的总列表存储最终结果
        printLines(pRoot, 1, result);
        return result;
    }

    private void printLines(TreeNode root, int depth, ArrayList<ArrayList<Integer>> list) {
        if (root == null) return;
        if (depth > list.size()) list.add(new ArrayList<Integer>());  //如果遍历到的二叉树层数比结果列表中子列表的数目多，就开辟一个新子列表存放这一层的节点值
        list.get(depth - 1).add(root.val);  //列表是从0开始索引的，depth从1开始索引，为了匹配所以depth-1，在结果列表的对应子列表中插入每一层的节点值
        printLines(root.left, depth + 1, list);  //递归存放当前根节点的左子节点
        printLines(root.right, depth + 1, list);  //递归存放当前根节点的右子节点
    }

    //思路与PrintBinaryTreeZigzag相同，去掉了之字形打印的逻辑
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        ArrayList<Integer> temp;
        queue1.offer(pRoot);
        while (!queue1.isEmpty()||!queue2.isEmpty()){
            if (!queue1.isEmpty()){
                temp = new ArrayList<>();
                while (!queue1.isEmpty()){
                    TreeNode treeNode = queue1.poll();
                    if (treeNode!=null){
                        temp.add(treeNode.val);
                        queue2.add(treeNode.left);
                        queue2.add(treeNode.right);
                    }
                }
                if (!temp.isEmpty()){
                    result.add(temp);
                }
            }else if (!queue2.isEmpty()){
                temp = new ArrayList<>();
                while (!queue2.isEmpty()){
                    TreeNode treeNode = queue2.poll();
                    if (treeNode!=null){
                        temp.add(treeNode.val);
                        queue1.add(treeNode.left);
                        queue1.add(treeNode.right);
                    }
                }
                if (!temp.isEmpty()){
                    result.add(temp);
                }
            }
        }
        return result;
    }
}
