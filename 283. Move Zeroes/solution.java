class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length;
        int j = 0;
        for(int i = 0; i < length; i++)
        {
            if(nums[i] != 0) nums[j++] = nums[i];
        }
        for(int i = j; i < length; i++)
        {
            nums[i] = 0;
        }
    }
}
