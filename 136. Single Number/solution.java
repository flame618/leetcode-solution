class Solution {
    /*
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int cur : nums)
        {
            if(set.contains(cur)) set.remove(cur);
            else set.add(cur);
        }
        return (int)set.toArray()[0];
    }
    */
    public int singleNumber(int[] nums) {
        int result = 0;
        for(int cur : nums)
            result ^= cur;
        return result;
    }
}
