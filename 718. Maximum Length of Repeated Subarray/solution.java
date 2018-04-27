class Solution {
    public int findLength(int[] A, int[] B) {
        int l1 = A.length, l2 = B.length;
        int[][] dp = new int[l1][l2];
        int res = 0;
        for(int i = 0; i < l1; i++)
        {
            dp[i][0] = A[i] == B[0] ? 1 : 0;
        }
        for(int i = 0; i < l2; i++)
        {
            dp[0][i] = A[0] == B[i] ? 1 : 0;
        }
        for(int i = 1; i < l1; i++)
        {
            for(int j = 1; j < l2; j++)
            {
                dp[i][j] = A[i] == B[j] ? dp[i-1][j-1] + 1 : 0;
                res = Math.max(res, dp[i][j]);
            }
        }
        return res;
    }
}
