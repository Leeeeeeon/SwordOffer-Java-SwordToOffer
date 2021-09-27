public class t66RobotRange {
    int step = 0;
    boolean[][] booleans;
    public int movingCount(int threshold, int rows, int cols) {
         booleans = new boolean[rows][cols];
        countStep(threshold,rows,cols,0,0);
        return step;
    }
    public void countStep(int threshold, int rows, int cols, int i, int j){
        if (i/100 + i/10 + i + j/100 + j/10 + j <= threshold && !booleans[i][j]){
            step++;
            booleans[i][j] = true;
            if (i + 1 < rows){
                countStep(threshold,rows,cols,i+1,j);
            }
            if (j + 1 < cols){
                countStep(threshold,rows,cols,i,j+1);
            }
        }
    }
}
