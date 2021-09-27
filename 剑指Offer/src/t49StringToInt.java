
/**
 * Created by z47 on 2021/9/13.
 */
public class t49StringToInt {
    public int StrToInt(String str) {
        if (str == null||str .equals("")){
            return 0;
        }
        char[] list = str.toCharArray();
        int result = 0;
        for (int i = list[0] == '+' || list[0] == '-' ? 1 : 0;i<list.length;i++){
            if (list[i] >= '0' && list[i] <= '9'){
                int temp = ((int)list[i]-(int)('0'));
                result = result*10 + temp ;
            }else {
                return 0;
            }
        }
        if (list[0] == '-'){
            return result*-1;
        }else return result;
    }
}

