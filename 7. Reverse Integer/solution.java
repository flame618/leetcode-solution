class Solution {
    public int reverse(int x) {
        int result = 0, n = 0, x1 = x, temp = 0;
        while(x1 != 0)
        {
            n = x1 % 10;
            temp = result * 10 + n;
            if((temp - n) / 10 != result)
                return 0;
            result = temp;
            x1 = x1 / 10;
        }
        return result;
    }
}
