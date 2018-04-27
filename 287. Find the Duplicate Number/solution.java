class Solution {
    public int findDuplicate(int[] nums) {
        int length = nums.length;
        Set set = new HashSet();
        for(int i = 0; i < length; i++)
        {
            if(set.contains(nums[i])) return nums[i];
            set.add(nums[i]);
        }
        return -1;
    }
}
