import java.util.ArrayList;

/**
 * Created by z47 on 2021/9/13.
 */
public class t50DuplicatedIntInArray {
    public int duplicate (int[] numbers) {
        ArrayList list = new ArrayList();
        for (int i = 0; i < numbers.length; i++) {
            if (list.contains(numbers[i])){
                return numbers[i];
            }else {
                list.add(numbers[i]);
            }
        }
        return -1;
    }
    //更简洁版
    public int duplicateBetter (int[] numbers) {
        int count[] = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            if (++count[numbers[i]]==2)return numbers[i];
        }
        return -1;
    }
}
