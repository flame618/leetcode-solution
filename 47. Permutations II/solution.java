class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {  //为了避免结果重复，先排序，重复的元素挨在一起，对于某个重复元素，只有它前面的那个重复元素用过了，才可以使用这个元素。
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        Arrays.sort(nums);
        DFS(res, nums, new ArrayList<Integer>(), used);
        return res;
    }
    private void DFS(List<List<Integer>> res, int[] nums, List<Integer> solution, boolean[] used)
    {
        int length = nums.length;
        if(solution.size() == length)
        {
            res.add(new ArrayList<>(solution));
        }
        else
        {
            for(int i = 0; i < length; i++)
            {
                if(used[i]) continue;
                if(i > 0 && nums[i] == nums[i - 1] && !used[i - 1]) continue;
                solution.add(nums[i]);
                used[i] = true;
                DFS(res, nums, solution, used);
                used[i] = false;
                solution.remove(solution.size() - 1);
            }
        }
    }
}
