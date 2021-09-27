/**
 * Created by z47 on 2021/9/12.
 */
public class t47SumHarder {
    public int Sum_Solution(int n) {
        return (int) (Math.pow(n,2) + n) >> 1;

        //递归实现1+2+..+n;
//        int sum = n;
//        boolean flag = (sum > 0) && ((sum += Sum_Solution(--n)) > 0);
//        return sum;
    }
}
