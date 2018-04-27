class Solution {
    private boolean[] visited;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Integer>[] map = new ArrayList[numCourses];
        int l = prerequisites.length;
        visited = new boolean[numCourses];
        for(int i = 0; i < numCourses; i++)
        {
            map[i] = new ArrayList<Integer>();  //对数组每个list进行实例化
        }
        for(int i = 0; i < l; i++)
        {
            map[prerequisites[i][1]].add(prerequisites[i][0]);  //把每个顶点的所有下一个顶点都列出来，相当于邻接表表示图的方式
        }
        for(int i = 0; i < numCourses; i++)
        {
            if(!DFS(map, i)) return false;  //如果从任何一个顶点出发出现了环则返回false，需要遍历从每一个顶点出发的情况是因为图可能是非连通图
        }
        return true;
    }
    private boolean DFS(List<Integer>[] map, int course)
    {
        if(visited[course]) return false;
        visited[course] = true;
        for(int i = 0; i < map[course].size(); i++)
        {
            if(!DFS(map, map[course].get(i))) return false;
        }
        visited[course] = false;
        return true;
    }
}
