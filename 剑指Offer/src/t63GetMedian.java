import java.util.ArrayList;
import java.util.Collections;

public class t63GetMedian {
    ArrayList<Integer> arrayList = new ArrayList<Integer>();
    public void Insert(Integer num) {
        arrayList.add(num);
        Collections.sort(arrayList);
    }

    public Double GetMedian() {
        int temp = arrayList.size();
        if (temp % 2 == 1){
            return Double.valueOf(arrayList.get(temp/2));
        }else {
            return (arrayList.get(temp/2)+arrayList.get(temp/2-1))/2.0;
        }
    }
}
