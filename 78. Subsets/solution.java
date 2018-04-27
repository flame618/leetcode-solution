class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        double l = Math.pow(2, nums.length) - 1;
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i <= l; i++)
        {
            int j = i, k = 0;
            List<Integer> temp = new ArrayList<>();
            while(k < nums.length)
            {
                if((j & 1) == 1) temp.add(nums[k]);
                j = j >> 1;
                k++;
            }
            res.add(temp);
        }
        return res;
    }
}
