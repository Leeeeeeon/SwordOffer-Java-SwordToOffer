import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by z47 on 2021/6/9.
 */
public class t22PreorderTraversal {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {this.val = val;}
    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        if (root == null){return arrayList;}
        arrayList.add(root.val);
        return HasTree(root,arrayList);
    }
    public ArrayList<Integer> HasTree(TreeNode root, ArrayList<Integer> array){
        if (root == null){return array;}
        if (root.left != null){array.add(root.left.val);}
        if (root.right != null){array.add(root.right.val);}
        array = HasTree(root.left,array);
        array = HasTree(root.right,array);
        return array;
    }

    public ArrayList<Integer> PrintFromTopToBottom2(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<TreeNode> queue = new ArrayList<TreeNode>();  //模拟一个队列来存放相应的二叉树节点
        if (root == null) return list;
        queue.add(root);
        while (queue.size() != 0) {  //当“队列中”有二叉树节点时不断循环
            //从“队列”中移除二叉树当前根节点，并赋给一个临时二叉树变量，按照下面queue添加元素的顺序一定是先添加左节点再添加右节点，所以移除顺序也一定能是前序遍历
            TreeNode temp = queue.remove(0);  //remove删除queue的第一个元素并返回 但ArrayList每次删除都会System.arraycopy() 消耗很严重 用LinkedList 比较好
            if (temp.left != null) {  //如果有左子树就将左节点添加到“队列”中
                queue.add(temp.left);
            }
            if (temp.right != null) {  //如果有右子树就将右节点添加到“队列”中
                queue.add(temp.right);
            }
            list.add(temp.val);  //将二叉树当前根节点的值添加到列表中
        }
        return list;
    }
}
