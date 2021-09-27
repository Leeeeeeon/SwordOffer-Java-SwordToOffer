import java.util.ArrayList;

/**
 * Created by z47 on 2021/6/10.
 */
public class t24BinaryTreePaths {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {this.val = val;}
    }

    private ArrayList<ArrayList<Integer>> arrayLists = new ArrayList<ArrayList<Integer>>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        if (root == null || root.val > target){return arrayLists;}
        HasTargetPath(new ArrayList<Integer>(),root,target);
        return arrayLists;
    }
    public void HasTargetPath(ArrayList<Integer> arrayList,TreeNode root, int target){
        if (root.val <= target){
            arrayList.add(root.val);
            if (root.left == null && root.right == null){
                if (root.val == target){
                    arrayLists.add(arrayList);
                }
            }
            ArrayList<Integer> arrayListRight = new ArrayList<Integer>();
            arrayListRight.addAll(arrayList);
            if (root.left != null){
                HasTargetPath(arrayList,root.left,target-root.val);
            }if (root.right != null){
                HasTargetPath(arrayListRight,root.right,target-root.val);
            }
        }
    }

    private ArrayList<ArrayList<Integer>> listAll = new ArrayList<ArrayList<Integer>>();
    private ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<ArrayList<Integer>> FindPath2(TreeNode root,int target) {
        if(root == null) return listAll;
        list.add(root.val);
        target -= root.val;
        if(target == 0 && root.left == null && root.right == null)
            listAll.add(new ArrayList<Integer>(list));
        FindPath2(root.left, target);
        FindPath2(root.right, target);
        list.remove(list.size()-1);
        return listAll;
    }
}
