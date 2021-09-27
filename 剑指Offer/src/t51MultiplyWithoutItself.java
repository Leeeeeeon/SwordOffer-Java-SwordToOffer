/**
 * Created by z47 on 2021/9/13.
 */
public class t51MultiplyWithoutItself {
    public int[] multiply(int[] A) {
        int[] result = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            int temp = 1;
            for (int j = 0; j < A.length; j++) {
                if (i != j){
                    temp *= A[j];
                }
            }
            result[i] = temp;
        }
        return result;
    }
}
