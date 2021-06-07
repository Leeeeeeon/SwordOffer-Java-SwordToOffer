/**
 * Created by z47 on 2021/6/4.
 */
public class t7Fibonacci {
    public int Fibonacci(int n) {
        int a = 1;
        int b = 1;
        if(n==1){
            return 1;
        }
        if(n==0){
            return 0;
        }
        while(n>2){
            int temp = a + b;
            a = b;
            b = temp;
            n--;
        }
        return b;
    }

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int f = 0, g = 1;
        for (int i = 0; i < n; i++) {
            f = f + g;  //前一项加后一项
            g = f - g;  //已经求和过的f减去g，会得到求和前的f，赋值给g
        }
        return f;
    }
}
