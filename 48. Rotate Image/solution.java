class Solution {
    public void rotate(int[][] matrix) {
        int m = matrix.length;
        int l = (m - 1) / 2;
        for(int i = 0; i <= l; i++)
        {
            for(int j = 0; j < m; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[m - 1 - i][j];
                matrix[m - 1 - i][j] = temp;
            }
        }
        for(int i = 0; i < m; i++)
        {
            for(int j = i + 1; j < m; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
}
