/**
 * Created by z47 on 2021/6/4.
 */
public class t8JumpFloors {
    public int jumpFloor(int target) {
        int result = jumpCount(target,0);
        return result;
    }
    public int jumpCount(int target,int sum){
        if(target<0){return 0;}
        if(target==1||target==0){return 1;}
        int count1 = jumpCount(target-1,sum);
        int count2 = jumpCount(target-2,sum);
        return sum+count2+count1;
    }

    public int jumpFloor2(int target) {
        if(target<0){return 0;}
        if(target==1||target==0){return 1;}
//        else if (target == 1) return 1;
//        else if (target == 2) return 2;
        return jumpFloor2(target-1)+jumpFloor2(target-2);
    }

}
