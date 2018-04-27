class Solution {
    /*
    public int subarraySum(int[] nums, int k) {
        int length = nums.length, count = 0;
        for(int i = 0; i < length; i++)
        {
            int sum = 0;
            for(int j = i; j < length; j++)
            {
                sum += nums[j];
                if(sum == k) count++;
            }
        }
        return count;
    }
    */
    public int subarraySum(int[] nums, int k) {
        int length = nums.length, count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        for(int i = 0; i < length; i++)
        {
            sum += nums[i];
            if(map.containsKey(sum - k)) count += map.get(sum - k); //sum是到当前（i）元素所有元素的和，如果0到i的子元素和为sumj，0到j元素和，且sumj + k = sum,则k就是j到i的元素和且满足要求，所以sumj = sum - k就代表着之前的任意一组0到j的元素和，只要满足，则会出现满足要求的k
            map.put(sum, map.getOrDefault(sum, 0) + 1); //k = sum - sumj 要记录和为sumj的组合有多少个，则对应的k的组合也有多少个
        }
        return count;
    }
}
