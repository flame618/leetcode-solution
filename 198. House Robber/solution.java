class Solution {
    /*
    public int rob(int[] nums) {
        int l = nums.length;
        if(l < 1) return 0;
        int[] Y = new int[l];
        int[] N = new int[l];
        N[0] = 0;
        Y[0] = nums[0];
        for(int i = 1; i < l; i++)
        {
            Y[i] = N[i - 1] + nums[i];
            N[i] = Math.max(Y[i - 1], N[i - 1]);
        }
        return Math.max(Y[l - 1], N[l - 1]);
    }
    */
    public int rob(int[] nums) {
        int l = nums.length;
        if(l < 1) return 0;
        int rob = nums[0], noRob = 0;
        int res = 0;
        for(int i = 1; i < l; i++)
        {
            int temp = rob;
            rob = noRob + nums[i];
            noRob = Math.max(temp, noRob);
        }
        return Math.max(rob, noRob);
    }
}
