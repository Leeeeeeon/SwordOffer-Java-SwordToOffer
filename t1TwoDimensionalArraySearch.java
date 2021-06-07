/**
 * Created by z47 on 2021/6/3.
 */
public class t1TwoDimensionalArraySearch {

    public boolean TwoDimensionalArraySearch(int target, int [][] array) {
        int i=0;
        int j=0;
        int iLength = array.length;
        int jLength = array[0].length;
        while(i != iLength && j != jLength){
            if (array[i][j]==target) {
                return true;
            }
            else if (array[i][j] < target){
                if(j+1==jLength){
                    i++;
                    j=0;
                }
                else j++;
            }
            else if (array[i][j] > target){i++;j=0;}
        }
        return false;
    }
}

