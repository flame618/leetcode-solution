class Solution {
    /*
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for(int i = 1; i <= length; i++) set.add(i);
        for(int cur : nums) if(set.contains(cur)) set.remove(cur);
        res.addAll(new ArrayList(Arrays.asList(set.toArray())));
        return res;
    }
    */
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int length = nums.length;
        List<Integer> res = new ArrayList<>();
        for(int i = 0; i < length; i++)
        {
            int val = Math.abs(nums[i]) - 1;
            if(nums[val] > 0)
            {
                nums[val] = -nums[val];
            }
        }
        for(int i = 0; i < length; i++)
        {
            if(nums[i] > 0) res.add(i + 1);
        }
        return res;
    }
}
