/**
 * Created by z47 on 2021/6/3.
 */
public class t6MinNumber {
    public int t6MinNumber(int [] array) {
        if(array.length==0){return 0;}
        int low = 0;
        int high = array.length -1;
        while(low < high){
            int mid =(low + high)/2;
            if(array[mid]<array[high]){
                high = mid;
            }
            else if (array[mid]>array[high]){
                low = mid+1;
            }
            else{
                high = high - 1;
            }
        }
        return array[low];
    }
}
