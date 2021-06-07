/**
 * Created by z47 on 2021/6/7.
 */
public class t13ReorderArray {
    public int[] reOrderArray (int[] array) {
        // write code here
        int[] arrOdd = new int[array.length];
        int[] arrEven = new int[array.length];
        int odd = 0 , even = 0 ;
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2==1){
                arrOdd[odd] = array[i];
                odd++;
            }else {
                arrEven[even] = array[i];
                even++;
            }
        }
        for (int i = 0; i < odd; i++) {
            result[i] = arrOdd[i];
        }
        for (int i = 0; i < even; i++) {
            result[i+odd] = arrEven[i];
        }
        return result;
    }

    public int[] reorderArray2(int[] array) {
        if (array.length == 0 || array.length == 1) return array;  //数组中没有元素或只有一个元素不需要排序
        int oddCount = 0, oddBegin = 0;  //对奇数个数进行计数，作为第一个偶数放置的索引位置，计数索引处前面的元素都是奇数
        int[] tempArray = new int[array.length];  //将排序后的元素放在一个辅助数组中
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) oddCount++;  //奇数的二进制最低位一定是1，遇到奇数就把计数器加1
        }
        for (int i = 0; i < array.length; i++) {
            if ((array[i] & 1) == 1) tempArray[oddBegin++] = array[i];  //如果遇到奇数就从辅助数组开头放置
            else tempArray[oddCount++] = array[i];  //如果遇到偶数就跳过奇数个数的索引数，从辅助数组后面开始放置偶数
        }
        System.arraycopy(tempArray, 0, array, 0, array.length);  //将辅助数组的所有元素复制替换掉原数组中的元素
        return array;
    }
}
