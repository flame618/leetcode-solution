class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int length = nums.length;
        List<List<Integer>> re = new ArrayList<>();
        if(length < 4) return re;
        Arrays.sort(nums);
        for(int i = 0; i < length - 3; i++)
        {
            re.addAll(threeSum(nums, target - nums[i], i + 1, length - 1));
            while(i + 1 < length - 3 && nums[i] == nums[i + 1]) i++;
        }
        return re;
    }
    
    private List<List<Integer>> threeSum(int[] nums, int target, int start, int end)
    {
        int length = end - start + 1;
        List<List<Integer>> re = new ArrayList<>();
        for(int i = start; i < end - 1; i++)
        {
            int j = i + 1, k = end, m = target - nums[i];
            while(j < k)
            {
                int numJ = nums[j], numK = nums[k];
                if(numJ + numK > m) k--;
                else if(numJ + numK < m) j++;
                else
                {
                    List<Integer> four = new ArrayList<>();
                    four.add(nums[start - 1]);
                    four.add(nums[i]);
                    four.add(nums[j++]);
                    four.add(nums[k--]);
                    re.add(four);
                    while(j < k && numJ == nums[j]) j++;
                    while(j < k && numK == nums[k]) k--;
                }
            }
            while(i + 1 < end - 1 && nums[i + 1] == nums[i]) i++;
        }
        return re;
    }
}
