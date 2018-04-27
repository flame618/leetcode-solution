class Solution {
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
        Map<Integer, Integer> sum1 = new HashMap<>();
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < B.length; j++)
            {
                int sum = A[i] + B[j];
                sum1.put(sum, sum1.getOrDefault(sum, 0) + 1);
            }
        }
        int res = 0;
        for(int i = 0; i < C.length; i++)
        {
            for(int j = 0; j < D.length; j++)
            {
                int sum = C[i] + D[j];
                res += sum1.getOrDefault(-sum, 0);
            }
        }
        return res;
    }
}
