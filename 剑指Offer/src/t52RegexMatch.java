/**
 * Created by z47 on 2021/9/13.
 */
public class t52RegexMatch {
    public boolean match (String str, String pattern) {
        if (str == null || pattern == null) return false;
        char[] target = str.toCharArray();
        char[] temp = pattern.toCharArray();
        return match(target,0,temp,0);
    }
    public boolean match (char[] str , int i, char[] pattern, int j){
        //如果模式数组已经遍历完，查看字符串数组是否遍历完，遍历完则完全匹配，没遍历完说明不匹配
        if (j == pattern.length) return i == str.length;
        if (j < pattern.length - 1 && pattern[j+1] == '*'){
            //如果str还没有遍历完，并且当前字符与pattern当前模式匹配，或者遇到匹配任何字符的'.'
            if (i != str.length && (str[i] == pattern[j] || pattern[j] == '.')){
                return match(str,i,pattern,j+2) || match(str,i+1,pattern,j);
                //match(str,i+1,pattern,j+2)省略了
            }else return match(str,i,pattern,j+2);
        }else if (i != str.length && (str[i] == pattern[j] || pattern[j]=='.')){
            return match(str,i+1,pattern,j+1);
        }else return false;
    }
}
