class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k <= 1) return 0;
        int length = nums.length;
        int count = 0, left = 0, curProduct = 1;
        for(int right = 0; right < length; right++)
        {
            curProduct *= nums[right];
            while(curProduct >= k)
            {   //有种情况是left == right时， curProduct被除的变成了1，相当于没有累乘，这时curProduct必小于k，会被强制退出循环
                curProduct /= nums[left++]; //最后left所停留在的位置是刚好满足curProduct < k的值，累乘的元素数量总共少了0-left-1（组合起来包括{left-1}，{left-1,left -2}...... {left -1，left-2, ...0}共left个元素，所以最后要减去）
            }
            count += right + 1 - left;  //left为0时，right每增加1，会多出right + 1种组合(多出来的组合包括{right}，{right-1,right}, {0,...right-1,right}共right + 1种组合,当前总共组合数等于上一轮组合数加上这一轮相比上一轮多出来的组合数减去相比上一轮少去的组合数)
        }
        return count;
    }
}
