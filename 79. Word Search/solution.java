class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(DFS(board, word.toCharArray(), i, j, 0)) return true;
            }
        }
        return false;
    }
    private boolean DFS(char[][] board, char[] word, int i, int j, int l)
    {
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || word[l] != board[i][j] || l > word.length - 1) return false;
        if(l == word.length - 1 && board[i][j] == word[l] ) return true;
        board[i][j] ^= 256;
        boolean res = DFS(board, word, i + 1, j, l + 1) || DFS(board, word, i - 1, j, l + 1)
        || DFS(board, word, i, j + 1, l + 1) || DFS(board, word, i, j - 1, l + 1);
        board[i][j] ^= 256;
        return res;
    }
}
