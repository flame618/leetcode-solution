class Solution {
    public void nextPermutation(int[] nums) {   //先从右向左找出第一个前边比挨着的后边小的数（说明它后面都是降序排序），然后找出它后面第一个比它大的数跟它交换，然后再让后面的数进行翻转。
        for(int i = nums.length - 1; i > 0; i--)
        {
            if(nums[i - 1] < nums[i])
            {
                int justLarger = 0;
                for(int j = i; j < nums.length; j++)
                {
                    if(j + 1 == nums.length || nums[j] > nums[i - 1] && nums[j + 1] <= nums[i - 1])
                    {
                        justLarger = j;
                        break;
                    }
                }
                swap(nums, i - 1, justLarger);
                reverse(nums, i, nums.length - 1);
                return;
            }
        }
        reverse(nums, 0, nums.length - 1);
    }
    
    private void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    private void reverse(int[] arr, int i, int j)
    {
        int m = i, n = j;
        while(m < n)
        {
            swap(arr, m++, n--);
        }
    }
}
