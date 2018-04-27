class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        DFS(res, candidates, target, new ArrayList<Integer>(), 0, 0);
        return res;
    }
    private void DFS(List<List<Integer>> res, int[] candidates, int target, List<Integer> solution, int sum, int deepth)
    {
        if(sum == target)
        {
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < solution.size(); i++)
            {
                int cur = solution.get(i);
                for(int j = 0; j < cur; j++)
                {
                    temp.add(candidates[i]);
                }
            }
            res.add(temp);
            return;
        }
        if(deepth == candidates.length) return;
        int cur = candidates[deepth];
        int k = (target - sum) / cur;
        for(int i = 0; i <= k; i++)
        {
            solution.add(i);
            DFS(res, candidates, target, solution, sum + i * candidates[deepth], deepth + 1);
            solution.remove(solution.size() - 1);
        }
    }
}
