import java.util.ArrayList;

public class t61SerializeBinaryTree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    String Serialize(TreeNode root) {
        if (root == null) return "#";
        else return root.val + "," + Serialize(root.left) + "," + Serialize(root.right);
    }
    int length = -1;
    TreeNode Deserialize(String str) {
        String[] s = str.split(",");
        length++;TreeNode tree = null;
        if (!s[length].equals("#")){
            tree = new TreeNode(Integer.parseInt(s[length]));
            tree.left = Deserialize(str);
            tree.right = Deserialize(str);
        }
        return tree;
    }
}
