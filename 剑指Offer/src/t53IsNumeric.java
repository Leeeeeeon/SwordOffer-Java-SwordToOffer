/**
 * Created by z47 on 2021/9/15.
 */
public class t53IsNumeric {

    public boolean isNumeric1(String str) {
        /*
         * 使用正则表达式，Java中转义字符需要两个斜杠“\\”，问号“？”表示0至1个匹配，星号“*”为0至多个匹配，
         * 加号“+”为1至多个匹配（不可以为0个），\\d表示十进制整数，方括号“[]”表示匹配括号内其中一个字符，因此整个正则表达式的含义为：
         * 匹配没有或者1个正号或负号：[\\+\\-]?；
         * 后接0至多位数字：\\d*；
         * 可以有1个或没有小数，若有1个小数，小数点后面有一至多个数字：(\\.\\d+)?；
         * 可以有1个或没有科学计数法，若有则E或e后面可以包含0个或1个正号或负号，科学计数法后面要有1至多个数字：([eE][\\+\\-]?\\d+)?；
         * 前面说一开始正负号后面，小数点前面可以有0个数字，因为在Java和Python中，例如“.2”也是数字。
         * */
        return str.matches("[\\+\\-]?\\d*(\\.\\d+)?([eE][\\+\\-]?\\d+)?");
    }
    //传统方法
    public boolean isNumeric (String str) {
        char[] target = str.toCharArray();
        int length = target.length;
        int sumP = 0;
        boolean symbol = false;
        boolean hasNum = false;
        while (target[length-1]==' '&&length!=1)length--;
        for (int i = 0; i < length; i++) {
            if (target[i]!=' '){
                if (target[i] == '+'||target[i] == '-'){
                    if (i == length-1)return false;
                    if (symbol)return false;
                    symbol = true;
                }
                else if (target[i] == '.'){
                    if (sumP > 0||i == length - 1){
                        return false;
                    }else {
                        sumP++;
                    }
                }else if (target[i] == 'e'){
                    if (i == length-1 || !hasNum){
                        return false;
                    }else if (target[i+1] == '+'||target[i+1] == '-'){
                        return isInteger(target,i+2,length);
                    }else if (target[i+1] == '.'){
                        return false;
                    }else return isInteger(target,i+1,length);
                }
                if (target[i] >= '0' && target[i] <= '9'){
                    hasNum = true;
                }else {
                    return false;
                }
            }
        }
        return hasNum;
    }
    public boolean isInteger(char[] target,int n,int length){
        if (n > length-1)return false;
        for (int i = n; i < length; i++) {
            if (target[i]<'0' || target[i]>'9'){
                return false;
            }
        }
        return true;
    }
}
