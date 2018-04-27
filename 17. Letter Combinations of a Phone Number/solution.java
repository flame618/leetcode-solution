class Solution {
    public List<String> letterCombinations(String digits) {
        String[] map = {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> res = new ArrayList<>();
        DFS(res, new StringBuilder(), digits, map, 0);
        return res;
    }
    private void DFS(List<String> res, StringBuilder solution, String digits, String[] map, int start)
    {
        if(start == digits.length() - 1) res.add(solution.toString());
        else
        {
            int cur = digits.charAt(start) - '0';
            for(int i = 0; i < map[cur].length(); i++)
            {
                solution.append(map[cur].charAt('i'));
                DFS(res, solution, digits, map, start + 1);
                solution.deleteCharAt(solution.length() - 1);
            }
        }
    }
}
