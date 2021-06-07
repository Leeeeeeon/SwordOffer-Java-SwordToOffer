/**
 * Created by z47 on 2021/6/3.
 */

public class t4ReconstructBinaryTree {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public TreeNode reConstructBinaryTree(int [] pre, int [] in) {
        TreeNode tree = reConstruct(pre,in,0,pre.length-1,0,in.length-1);
        return tree;
    }

    public TreeNode reConstruct(int[] pre,int[] in,int sPre,int ePre,int sIn,int eIn){
        if(sPre>ePre||sIn>eIn){
            return null;
        }
        TreeNode tree = new TreeNode(pre[sPre]);
        for(int i = sIn;i <= eIn; i++){
            if(in[i]==pre[sPre]){
                tree.left=reConstruct(pre,in,sPre+1,sPre+i-sIn,sIn,i-1);
                tree.right=reConstruct(pre,in,sPre+i-sIn+1,ePre,i+1,eIn);
            }
        }
        return tree;
    }

}


