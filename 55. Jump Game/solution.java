class Solution {
    public boolean canJump(int[] nums) {
        int length = nums.length, last = length - 1;
        for(int i = length - 1; i >= 0; i--)
        {
            if(i + nums[i] >= last)
                last = i;
        }
        return last == 0;
    }
}
