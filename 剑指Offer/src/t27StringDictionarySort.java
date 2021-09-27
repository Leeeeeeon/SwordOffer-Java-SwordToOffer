import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by z47 on 2021/6/11.
 */

/*
 * 输入一个字符串,按字典序打印出该字符串中字符的所有排列。例如输入字符串abc,则打印出由字符a,b,c所能排列出来的所有字符串abc,acb,bac,bca,cab和cba。
 * 输入描述：输入一个字符串,长度不超过9(可能有字符重复),字符只包括大小写字母。
 * 原理图：https://uploadfiles.nowcoder.com/images/20170705/7578108_1499250116235_8F032F665EBB2978C26C4051D5B89E90
 * */
public class t27StringDictionarySort {
    public ArrayList<String> Permutation(String str) {
        ArrayList<String> result = new ArrayList<String>();         //字母按各种排列情况的结果
        if (str != null && str.length()>=1){
            char[] cs = str.toCharArray();
            StringSort(cs,0,result);
            Collections.sort(result);                   //对各种排列情况输出的字符串按照字典序排序
        }
        return result;
    }
    public void StringSort(char[] cs,int i,ArrayList<String> result){
        if (i == cs.length-1){      //当交换索引到达字符数组最后一位，这种情况已经交换完成，输出字符组合结果
            if (!result.contains(new String(cs))){
                result.add(new String(cs));
            }
        }else {
            for (int j = i; j < cs.length; j++) {
                swap(cs,i,j);
                StringSort(cs,i+1,result);  //在上一行已交换一次的基础上再对已交换元素的后面元素进行交换 如ABCD交换AB为BACD后 再对ACD进行遍历
                swap(cs,i,j);       //回退到之前的状态，(如ABC交换AB后为BAC 下一次for循环交换AC 回退后交换才为CBA)避免已改变值的字符数组影响其他不同情况下的交换
            }
        }
    }
    public void swap(char[] cs,int i,int j){
        char temp = cs[i];
        cs[i] = cs[j];
        cs[j] = temp;
    }
}
