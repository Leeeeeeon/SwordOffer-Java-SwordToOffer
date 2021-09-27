import java.util.Arrays;

/**
 * Created by z47 on 2021/9/11.
 */
public class t45PokerStraight {
    public boolean IsContinuous(int [] numbers) {
        Arrays.sort(numbers);
        int sum0 = 0;
        for (int i = 0; i < 4 && sum0 < 5; i++) {
            if (numbers[i] == 0){
                sum0++;
            }else {
                if (numbers[i] == numbers[i+1])return false;
                if (numbers[i] + 1 != numbers[i+1]){
                    if (numbers[i+1] - numbers[i] > sum0 + 1){
                        return false;
                    }else {
                        sum0 -= numbers[i+1] - numbers[i] - 1;
                    }
                }
            }
        }
        return !(sum0 == 4 && numbers[4] == 0);
    }
}
