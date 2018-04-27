class Solution {
    /* time limit exceed
    public int maxProduct(int[] nums) {
        int length = nums.length;
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < length; i++)
        {
            int curPro = 1;
            for(int j = i; j < length; j++)
            {
                curPro *= nums[j];
                res = Math.max(res, curPro);
            }
        }
        return res;
    }
    */
    public int maxProduct(int[] nums) {
        int res = nums[0], imax = res, imin = res;
        for(int i = 1; i < nums.length; i++)
        {
            if(nums[i] < 0) //如果当前数为负数，则最大的变成最小的，最小的变成最大的
            {
                int temp = imax;
                imax = imin;
                imin =temp;
            }
            imax = Math.max(nums[i], imax * nums[i]);   //如果当前累积最大乘积乘以当前数比当前数还小，则抹去之前的最大乘积，从当前数开始重算
            imin = Math.min(nums[i], imin * nums[i]);
            res = Math.max(res, imax);
        }
        return res;
    }
}
