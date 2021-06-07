/**
 * Created by z47 on 2021/6/7.
 */
public class t12Exponent {
    public double Power(double base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        double sum = 1;
        if (exponent > 0) {
            for (int i = exponent; i > 0; i--) {
                sum *= base;
            }
        }
        if (exponent < 0) {
            for (int i = exponent * -1; i > 0; i--) {
                sum *= base;
            }
            sum = 1 / sum;
        }
        return sum;
    }

    public double Power2(double base, int exponent) {
        int n = Math.abs(exponent);
        if (n == 0) return 1;
        if (n == 1) return base;
        //递归：若n为偶数，则a^n=a^(n/2)*a^(n/2)；若n为奇数，则a^n=(a^(n-1)/2)*(a^((n-1)/2))*a，时间复杂度为O(log(n))
        double result = Power2(base, n >> 1);  //将n的二进制右移一位，意味着除以2，求得a^(n/2)或a^((n-1)/2)
        result *= result;  //将a^(n/2)或a^((n-1)/2)进行平方，变为a^n或a^(n-1)
        if ((n & 1) == 1) result *= base;  //在n的二进制右移递归后，若n为奇数，二进制最低位一定是1，这样就再乘一次a。偶数二进制的最低位为0
        if (exponent < 0) result = 1 / result;  //若指数为负数，则求倒数
        return result;
    }
}
