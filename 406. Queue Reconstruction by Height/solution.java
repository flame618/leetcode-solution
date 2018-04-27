class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, new Comparator<int[]>(){
           public int compare(int[] a, int[] b)
           {
               if(a[0] == b[0]) return a[1] - b[1];
               else return b[0] - a[0];
           } 
        });
        int m = people.length;
        int n = 2;
        int[][] res = new int[m][n];
        int l = 0;
        for(int i = 0; i < m; i++)
        {
            insert(res, people[i][1], people[i][0], l);
            l++;
        }
        return res;
    }
    private void insert(int[][] arr, int index, int num, int l)
    {
        for(int i = l; i > index; i--)
        {
            arr[i][0] = arr[i - 1][0];
            arr[i][1] = arr[i - 1][1];
        }
        arr[index][0] = num;
        arr[index][1] = index;
    }
}
