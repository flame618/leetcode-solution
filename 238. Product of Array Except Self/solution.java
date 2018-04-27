class Solution {
    public int[] productExceptSelf(int[] nums) {
        int helper = 1, count = 0, index = 0;
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0) helper *= nums[i];
            else{count++; index = i;} 
        }
        if(count > 1) return new int[nums.length];
        else if(count == 1) 
        {
            int[] res = new int[nums.length];
            res[index] = helper;
            return res;
        }
        int pre = 1;
        for(int i = 0; i < nums.length; i++)
        {
            helper = helper * pre / nums[i];
            pre = nums[i];
            nums[i] = helper;
        }
        return nums;
    }
}
