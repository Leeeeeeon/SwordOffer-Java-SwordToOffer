import java.util.ArrayList;

/**
 * Created by z47 on 2021/9/9.
 */
public class t42SumOfTwoIntsInArray {
    public ArrayList<Integer> FindNumbersWithSum(int [] array, int sum) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i]+array[j] == sum){
                    if (result.size() == 0){
                        result.add(array[i]);
                        result.add(array[j]);
                    }else if (result.get(0)*result.get(1) > array[i]*array[j]){
                        result.clear();
                        result.add(array[i]);
                        result.add(array[j]);
                    }
                }else if (array[i]+array[j] > sum){
                    j = array.length;break;
                }
            }
        }
        return result;
    }
//      更优解
//    public ArrayList<Integer> findNumbersWithSum(int[] array, int sum) {
//        ArrayList<Integer> list = new ArrayList<Integer>();  //使用一个列表存放相加等于sum且乘积最小的两个数
//        if (array == null || array.length < 2) return list;
//        int i = 0, j = array.length - 1;  //使用一头一尾两个游标向中间遍历
//        while (i < j) {
//            if (array[i] + array[j] == sum) {
//                list.add(array[i]);
//                list.add(array[j]);
//                return list;
//            } else if (array[i] + array[j] > sum) {  //当相加的和大于sum时，右边游标向左移
//                j--;
//            } else {  //当相加的和小于sum时，左边游标向右移，乘积是倒抛物线，越远离对称轴乘积越小，所以最终遇到的第一组两个数一定是乘积最小
//                i++;
//            }
//        }
//        return list;
//    }
}
