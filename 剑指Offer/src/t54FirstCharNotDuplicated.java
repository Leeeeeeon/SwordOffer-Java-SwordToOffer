import java.util.HashMap;

/**
 * Created by z47 on 2021/9/16.
 */
public class t54FirstCharNotDuplicated {
    StringBuffer sb = new StringBuffer();
    public void Insert(char ch) {
        sb.append(ch);
    }
    public char FirstAppearingOnce() {
        char[] charArrays = sb.toString().toCharArray();
        HashMap<Character,Integer> hashMap = new HashMap<Character,Integer>();
        for (int i = 0; i < charArrays.length; i++) {
            if (!hashMap.containsKey(charArrays[i])){
                hashMap.put(charArrays[i],1);
            }else {
                hashMap.put(charArrays[i],hashMap.get(charArrays[i])+1);
            }
        }
        for (int i = 0; i < charArrays.length; i++) {
            if (hashMap.get(charArrays[i]) == 1){
                return charArrays[i];
            }
        }
        return '#';
    }
}
