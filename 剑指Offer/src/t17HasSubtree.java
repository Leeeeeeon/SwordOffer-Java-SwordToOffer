/**
 * Created by z47 on 2021/6/8.
 */
public class t17HasSubtree {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {this.val = val;}
    }
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        boolean result = false;                                 //初始一个返回值
        if (root1!=null && root2!=null){                        //如果俩树有一为空 则直接返回false
            if (root1.val == root2.val){                        //如果当前俩树根节点值相等 则调用DoesTree1HasTree2判定他们的子树是否一致
                result = DoesTree1HasTree2(root1,root2);
            }
            if (!result){result = HasSubtree(root1.left,root2);}//如果result为false则 取树A的左右子树再继续进行对比
            if (!result){result = HasSubtree(root1.right,root2);}
        }
        return result;
    }
    public boolean DoesTree1HasTree2(TreeNode root1,TreeNode root2){
        if (root1 == null && root2 != null){return false;}      //树A遍历完 树B未遍历完 返回false
        if (root2 == null){return true;}                        //树B遍历完 返回true
        if (root1.val != root2.val){return false;}              //遍历中出现两个节点不同 则俩树不存在包含关系 返回false
        return DoesTree1HasTree2(root1.left,root2.left)&&DoesTree1HasTree2(root1.right,root2.right);
    }
}
