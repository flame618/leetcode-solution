class Solution {
    public int removeDuplicates(int[] nums) {
        int result = 0, i = 0;
        while( i < nums.length)
        {
            int curNum = nums[i];
            while(i < nums.length && curNum == nums[i])
                i++;
            nums[result] = curNum;
            result++;
        }
        return result;
    }
}
