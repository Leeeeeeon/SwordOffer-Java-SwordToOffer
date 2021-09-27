/**
 * Created by z47 on 2021/6/15.
 */
public class t31NumberOf1Appears {
    public int NumberOf1Between1AndN_Solution(int n) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            stringBuffer.append(i);
        }
        int sum = 0;
        for (int i = 0; i < stringBuffer.length(); i++) {
            if (stringBuffer.charAt(i) == '1'){
                sum++;
            }
        }
        return sum;
    }
}
