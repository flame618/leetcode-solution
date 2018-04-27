class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res = new ArrayList<>();
        int[] arr = new int[rowIndex + 1];
        arr[0] = 1;
        for(int i = 1; i <= rowIndex; i++)
        {
            for(int j = i; j > 0; j--)
            {
                arr[j] += arr[j -1];
            }
        }
        for(int i = 0; i <= rowIndex; i++)
        {
            res.add(arr[i]);
        }
        return res;
    }
}
