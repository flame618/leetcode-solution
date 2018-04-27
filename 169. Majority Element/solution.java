class Solution {
    /*
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[(nums.length - 1) / 2];  
    }
    */
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        for(int cur : nums)
        {
            if(count == 0) candidate = cur;
            count += (cur == candidate) ? 1 : -1;
        }
        return candidate;
    }
    
}
