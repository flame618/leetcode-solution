class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        if(m == 0) return 0;
        int n = grid[0].length;
        int count = 0;
        for(int i = 0; i < m; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(grid[i][j] == '1')
                {
                    DFS(grid, i, j);//遍历出每一个点，如果遍历到为'1'的点，则从它开始向四面扩展，把扩展到的所有点变成0，扩展范围就是被0跟数组边缘包围的圈
                    count++;
                }
            }
        }
        return count;
    }
    private void DFS(char[][] grid, int i, int j)
    {
        int m = grid.length, n = grid[0].length;
        if(i >= m || i < 0 || j >= n || j < 0 || grid[i][j] == '0') return;
        grid[i][j] = '0';
        DFS(grid, i + 1, j);
        DFS(grid, i - 1, j);
        DFS(grid, i, j + 1);
        DFS(grid, i, j - 1);
    }
}
