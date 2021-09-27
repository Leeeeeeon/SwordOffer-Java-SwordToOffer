public class t67CutRope {
    public int cutRope(int target) {
        if (target == 2) {return 1;}
        if (target == 3) {return 2;}
        int temp = 0;
        for (int i = 2; i < target; i++) {
            int multiResult = (int) (Math.pow(target/i,i-target%i) * Math.pow(target/i + 1,target%i));
            if (multiResult > temp){
                temp = multiResult;
            }
        }
        return temp;
    }
    public int cutRope2(int target){
        int a = 0;
        int c = 0;
        int maxValue = 2;
        if (target == 2) {return 1;}
        if (target == 3) {return 2;}
        if (target % 3 == 0) {
            maxValue = (int)Math.pow(3, target / 3);
        } else{
            a = target - 2;
            c = a % 3;
            maxValue = maxValue * (int)Math.pow(3, a / 3);
            if (0 != c) {
                maxValue = maxValue * c;
            }
        }
        return maxValue;
    }
}
