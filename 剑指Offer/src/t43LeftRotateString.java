/**
 * Created by z47 on 2021/9/10.
 */
public class t43LeftRotateString {
    public String LeftRotateString(String str,int n) {
        if (str.length() < n){return "";}
        StringBuffer stringBuffer = new StringBuffer();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            stringBuffer.append(str.charAt(i));
        }
        for (int j = stringBuffer.length(); j < str.length(); j++) {
            sb.append(str.charAt(j));
        }
        for (int k = 0; k < stringBuffer.length(); k++) {
            sb.append(stringBuffer.charAt(k));
        }
        return sb.toString();
    }

    //队列方法
//    public String leftRotateString(String str, int n) {
//        if (str == null || str.length() == 0) return "";
//        char[] charArray = str.toCharArray();  //将字符串拆成字符数组，用于下面队列的入列出列
//        Queue<Character> queue = new LinkedList<Character>();
//        for (int i = 0; i < charArray.length; i++) {
//            queue.offer(charArray[i]);  //将队列中排入字符数组
//        }
//        for (int i = 0; i < n; i++) {  //借鉴约瑟夫环的思想，每左移一次就把队列头部元素弹出再放回队列尾部，完成循环左移
//            queue.offer(queue.poll());
//        }
//        String result = "";
//        while (queue.size() != 0) {
//            result += queue.poll();  //将队列排列后的结果转为字符串
//        }
//        return result;
//    }

    //reverse方法
    //按照剑指offer书上的方法，两次翻转字符串。
//    class Solution {
//        public:
//        string LeftRotateString(string str, int n) {
//            reverse(str.begin(), str.end());
//            reverse(str.begin(), str.begin() + str.size() - n);
//            reverse(str.begin() + str.size() - n, str.end());
//            return str;
//        }
//    };
}
