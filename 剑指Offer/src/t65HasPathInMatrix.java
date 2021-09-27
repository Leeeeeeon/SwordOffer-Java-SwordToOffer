public class t65HasPathInMatrix {
    public boolean hasPath (char[][] matrix, String word) {
        char[] wordChars = word.toCharArray();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == wordChars[0]){
                    boolean result = choosePath(matrix,wordChars,i,j,0);
                    if (result)return true;
                }
            }
        }
        return false;
    }
    public boolean choosePath(char[][] matrix, char[] wordChars, int i, int j, int k){
        if (k == wordChars.length - 1 && matrix[i][j] == wordChars[k])return true;
        if (matrix[i][j] != wordChars[k]){
            return false;
        }else {
            matrix[i][j] = '#';
            if (i+1 < matrix.length){
                if (choosePath(matrix,wordChars,i+1,j,k+1)) return true;
            }
            if (i-1 >= 0){
                if (choosePath(matrix,wordChars,i-1,j,k+1)) return true;
            }
            if (j+1 < matrix[i].length){
                if (choosePath(matrix,wordChars,i,j+1,k+1)) return true;
            }
            if (j-1 >= 0){
                if (choosePath(matrix,wordChars,i,j-1,k+1)) return true;
            }
            matrix[i][j] = wordChars[k];
        }return false;
    }
}
