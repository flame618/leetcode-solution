class Solution {
    public int rob(int[] nums) {
        int length = nums.length;
        if(length == 0) return 0;
        int[] N = new int[length];
        int[] Y = new int[length];
        N[0] = 0;
        Y[0] = nums[0];
        for(int i = 1; i < length; i++)
        {
            if(i == 1)
            {
                Y[i] = N[0] + nums[i];
                N[i] = N[0];
            }
            else
            {
                Y[i] = N[i - 1] + nums[i];
                N[i] = Math.max(N[i - 1], Y[i - 1]);
            }
        }
        int max1 = Math.max(Y[length - 1], N[length - 1]);
        N[length - 1] = 0;
        Y[length - 1] = nums[length - 1];
        for(int i = length - 2; i >= 0; i--)
        {
            if(i == length - 2)
            {
                Y[i] = N[length - 1] + nums[i];
                N[i] = N[length - 1];
            }
            else
            {
                Y[i] = N[i + 1] + nums[i];
                N[i] = Math.max(N[i + 1], Y[i + 1]);
            }
        }
        int max2 = Math.max(Y[0], N[0]);
        return Math.max(max1, max2);
    }
}
