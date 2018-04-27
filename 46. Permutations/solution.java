class Solution {
    private boolean[] isVisited;
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> re = new ArrayList<>();
        permutation(nums, re, new ArrayList<Integer>());
        return re;
    }
    private void permutation(int[] nums, List<List<Integer>> re, List<Integer> solution)
    {
        if(solution.size() == nums.length)
        {
            re.add(new ArrayList<Integer>(solution));
                return;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(solution.contains(nums[i])) continue;
            solution.add(nums[i]);
            permutation(nums, re, solution);
            solution.remove(solution.size() - 1);
        }
    }
}
