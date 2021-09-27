/**
 * Created by z47 on 2021/6/15.
 */
public class t30BiggestSumOfSubArray {
    public int FindGreatestSumOfSubArray(int[] array) {
        if (array == null || array.length == 0){return 0;}
        int sum = array[0];              //存放最大连续子序列的和
        int temp = array[0];             //存放当前元素为末尾元素的子数组的最大值
        for (int i = 1; i < array.length; i++) {
            temp = Math.max(temp + array[i], array[i]);
            if (sum < temp){sum = temp;}
        }
        return sum;
    }
}
