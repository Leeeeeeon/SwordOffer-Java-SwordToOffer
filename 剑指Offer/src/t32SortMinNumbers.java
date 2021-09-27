import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by z47 on 2021/6/15.
 */
public class t32SortMinNumbers {
    public String PrintMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0){return "";}
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                int a = Integer.valueOf(numbers[i]+""+numbers[j]);
                int b = Integer.valueOf(numbers[j]+""+numbers[i]);
                if (a > b){
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        String str = new String();
        for (int i = 0; i < numbers.length; i++) {
            str += String.valueOf(numbers[i]);
        }
        return str;
    }

    public String printMinNumber2(int[] numbers) {
        String str = "";
        ArrayList<Integer> list = new ArrayList<Integer>();  //将数组中的元素都放入一个列表中便于利用列表的排序方法
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {  //通过比较器将list列表中的元素进行排序
            public int compare(Integer str1, Integer str2) {
                String s1 = str1 + "" + str2;  //通过引号""将整数对象转化为字符串
                String s2 = str2 + "" + str1;
                return s1.compareTo(s2);  //比较两个整数互相颠倒后拼接成的两个大整数的大小
            }
        });
        for (int j : list) {
            str += j;  //将列表中从小到大排序过的元素都以字符串形式拼接，形成拼接的最小整数
        }
        return str;
    }
}
