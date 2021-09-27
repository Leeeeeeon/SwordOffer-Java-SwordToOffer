/**
 * Created by z47 on 2021/6/9.
 */
public class t23IsPostorderTraversal {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence.length == 0){return false;}
        return IsBst(sequence,0,sequence.length-1);
    }
    public boolean IsBst(int [] sequence,int left, int right){
        if (left >= right){return true;}                //开始和结束索引相遇 说明已经遍历到根节点 整个数组确实为后序遍历二叉树
        int leftNum = left;     //后序遍历是先左节点，再右节点，最后根节点，因此数组开头元素一定是二叉树左下角最小节点，sequence[right]一定是根节点
        while (sequence[leftNum]<sequence[right]){      //遍历后计算了所有比根节点小的元素个数 也就是左子树元素个数 此刻sequence[leftNum]就指向了右子树的最小节点
            leftNum++;
        }
        for (int i = leftNum; i < right; i++) {         //由底向上遍历右子树 一旦有元素小于根节点 那就不是二叉搜索树BST
            if (sequence[i]<sequence[right]){
                return false;
            }
        }
        return IsBst(sequence,0,leftNum - 1) && IsBst(sequence,leftNum,right-1);    //递归左子树 右子树
    }
}
