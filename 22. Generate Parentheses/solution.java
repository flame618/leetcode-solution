class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        backtracking(res, 0, 0, new StringBuilder(), n);
        return res;
    }   //通过记录当前左右括号的数量，来选择性的加入新括号（加入左括号原则：左括号数目小于n,加入右括号原则：右括号数目小于左括号）
    private void backtracking(List<String> res, int left, int right, StringBuilder solution, int n)
    {
        if(left == n && right == n)
        {
            res.add(solution.toString());
        }
        else
        {
            if(left < n)
            {
                backtracking(res, left + 1, right, solution.append('('), n);
                solution.deleteCharAt(solution.length() - 1);
            }
            if(right < left)
            {
               backtracking(res, left, right + 1, solution.append(')'), n); 
                solution.deleteCharAt(solution.length() - 1);
            }
            
        }
    }
}
