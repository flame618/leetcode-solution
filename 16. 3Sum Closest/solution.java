class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        int length = nums.length;
        for(int i = 0; i < length - 2; i++)
        {
            int j = i + 1;
            int k = length - 1;
            while(j < k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                if(sum == target) return sum;
                if(sum > target) k--;
                else j++;
                if(Math.abs(sum - target) < Math.abs(ans - target)) ans = sum;
            }
        }
        return ans;
    }
}
