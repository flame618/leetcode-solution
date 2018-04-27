class Solution {
    public double myPow(double x, int n) {
        if(n == 0)
            return 1;
        if(n < 0)
        {
            if(n == Integer.MIN_VALUE && x != 1 && x != -1)
                return 0;
            x = 1 / x;
            n = -n;
        }
        else if(x == 1)
        {
            return 1;
        }
        return (n % 2 == 0 ? myPow(x * x, n / 2) : x * myPow(x * x, n / 2));
    }
}
