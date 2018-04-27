class Solution {
    public int hammingDistance(int x, int y) {
        int d = x ^ y;
        int count = 0;
        while(d != 0)
        {
            if((d & 1) == 1) count++;
            d = d >> 1;
        }
        return count;
    }
}
