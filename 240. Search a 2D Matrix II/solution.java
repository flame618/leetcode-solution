class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int m = 0, n = matrix[0].length - 1, l = matrix.length;
        while(m < l && n >= 0)
        {
            int cur = matrix[m][n];
            if(target == cur) return true;
            else if(target > cur) m++;
            else n--;
        }
        return false;
    }
}
