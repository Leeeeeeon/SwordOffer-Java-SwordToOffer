import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by z47 on 2021/6/11.
 */
public class t29MinKIntegers {
    public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> result = new ArrayList<>();
        if (input == null || input.length == 0 || k > input.length){return result;}
        for (int i = 0; i < k; i++) {
            for (int j = i+1; j < input.length; j++) {
                if (input[i]>input[j]){
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
            result.add(input[i]);
        }
        return result;
    }

    public ArrayList<Integer> getLeastNumbers(int[] input, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        if (input == null || input.length == 0 || k > input.length) return list;
        Arrays.sort(input);
        for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
    }
}
