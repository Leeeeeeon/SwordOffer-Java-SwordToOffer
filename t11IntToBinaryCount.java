/**
 * Created by z47 on 2021/6/7.
 */
public class t11IntToBinaryCount {
    public int NumberOf1String(int n) {
        int sum = 0;
        String binaryString = Integer.toBinaryString(n);
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i)=='1'){
                sum++;
            }
        }
        return sum;
    }

    public int NumberOf1(int n) {
        int sum = 0;
        for (int i = 0; i < 32; i++) {
            int temp = n & 1;               //& 与比较二进制最右值 都为1结果为1
            if (temp == 1){
                sum++;
            }
            n>>=1;                          //二进制向右移动n位 左边正数用0补齐 负数1补齐 0110 1101 变为 0011 0110
        }
        return sum;
    }
}
