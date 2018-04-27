class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int l1 = matrix.length, l2 = matrix[0].length, l = l1 * l2;
        int lo = 0, hi = l - 1;
        while(lo <= hi)
        {
            int mid = (lo + hi) / 2;
            int x = mid / l2, y = mid % l2;
            int cur = matrix[x][y];
            if(target == cur) return true;
            else if(target > cur) lo = mid + 1;
            else hi = mid - 1;
        }
        return false;
    }
}
