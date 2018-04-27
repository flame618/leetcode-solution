class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for(int i = 1; i <= num; i++)
        {
            res[i] = res[i >> 1] + (i & 1);   //means：i 跟 i>>1两数之间只差位，其他的都一模一样，i比i>>1多出了个位数，判断这个个位数是0还是1即可
        }   //位运算优先级较低，一定要记得加括号
        return res;
    }
}
