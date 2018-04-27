class Solution {
    public boolean isHappy(int n) {
        int slow = n, fast = n;
        do
        {
            slow = getHappy(slow);
            fast = getHappy(fast);
            fast = getHappy(fast);
        }while(fast != slow);
        return fast == 1 ? true : false;
    }
    private int getHappy(int n)
    {
        int sum = 0;
        while(n != 0)
        {
            int num = n % 10;
            sum += num * num;
            n = n / 10;
        }
        return sum;
    }
}
