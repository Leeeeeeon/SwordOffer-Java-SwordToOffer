import java.util.ArrayList;
import java.util.List;

public class t64MaxValueInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        if (size > num.length || num.length == 0 || size == 0)return result;
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < num.length; i++) {
            arrayList.add(num[i]);
        }
        for (int i = 0; i <= num.length - size; i++) {
            List<Integer> temp = arrayList.subList(i,i + size);
            result.add(findMaxInWindows(temp));
        }
        return result;
    }
    public int findMaxInWindows(List<Integer> temp){
        int max = 0;
        for (Integer integer : temp) {
            if (max < integer) {
                max = integer;
            }
        }
        return max;
    }
}
