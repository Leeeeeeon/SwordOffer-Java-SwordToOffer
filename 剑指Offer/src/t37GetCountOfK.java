/**
 * Created by z47 on 2021/8/27.
 */
public class t37GetCountOfK {
    public int GetNumberOfK(int [] array , int k) {
        if (array == null) return 0;
        int result = 0;
        for (int i = 0; i < array.length && array[i]<=k; i++) {
            if (array[i] == k){
                result++;
                for (int j = i+1; j < array.length && array[j]==k; j++) {
                    result++;
                }
            }
        }
        return result;
    }
}
