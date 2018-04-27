class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int length = nums.length;
        boolean flag = false;
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for(int i = 1; i < length; i++)
        {
            if(nums[i] < nums[i - 1]) flag = true;
            if(flag) min = Math.min(min, nums[i]);
        }
        flag = false;
        for(int i = length - 2; i >= 0; i--)
        {
            if(nums[i] > nums[i + 1]) flag = true;
            if(flag) max = Math.max(max, nums[i]);
        }
        int l = 0, r = length - 1;
        for(; l < length && nums[l] <= min ; l++);
        for(; r >= 0 && nums[r] >= max; r--);
        return l >= r ? 0 : r - l + 1;
    }
}
