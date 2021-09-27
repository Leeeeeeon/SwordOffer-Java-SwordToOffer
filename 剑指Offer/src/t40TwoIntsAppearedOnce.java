import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by z47 on 2021/9/5.
 */
public class t40TwoIntsAppearedOnce {
    public int[] FindNumsAppearOnce (int[] array) {
        if (array == null || array.length == 0)return null;
        Arrays.sort(array);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int arr : array) {
            if (arrayList.contains(arr)){
                arrayList.remove(arrayList.size()-1);
            }else {
                arrayList.add(arr);
            }
        }
        int result[] = new int[2] ;
        if (arrayList.size() != 0){
            result[0] = arrayList.get(0);
            result[1] = arrayList.get(1);
        }
        return result;
    }
}
