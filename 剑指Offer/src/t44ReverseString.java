/**
 * Created by z47 on 2021/9/10.
 */
public class t44ReverseString {
    public String ReverseSentence(String str) {
        int left = 0;
        int right = 0;
        StringBuffer sb = new StringBuffer();
        while (left < str.length()){
            if (str.charAt(right) == ' '){
                sb.insert(0,str.substring(left,right));
                sb.insert(0,' ');
                left = right + 1;
            }else if (right == str.length()-1){
                sb.insert(0,str.substring(left));
                left = right + 1;
            }
            right++;
        }
        return sb.toString();
    }

    //将字符串分割成数组 以" "为分割依据
//    public String ReverseSentence(String str) {
//        if(str.trim().equals("")){
//            return str;
//        }
//        String[] a = str.split(" ");
//        StringBuffer o = new StringBuffer();
//        int i;
//        for (i = a.length; i >0;i--){
//            o.append(a[i-1]);
//            if(i > 1){
//                o.append(" ");
//            }
//        }
//        return o.toString();
//    }
}
