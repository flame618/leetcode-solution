class Solution {
    public int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while(lo < hi)  //寻找数组中最小值，也就是原升序数组的开头
        {
            int mid = (lo + hi) / 2;
            if(nums[mid] > nums[hi]) lo = mid + 1;//lo从mid + 1开始，因为mid对应的不可能是最小值，如[4,5,6,1,2,3],中间数大于hi数说明mid属于高数，低数在后
            else hi = mid; //hi从mid开始，因为这种情况下mid有可能是最小值如[5,6,1,2,3,4]，mid=2，对应的1为最小值
        }
        int min = lo;   //保存最小值对应索引，该索引数目意味着原始升序数组向右移位的数目
        lo = 0;
        hi = nums.length - 1;
        while(lo <= hi)
        {
            int mid = (lo + hi) / 2;
            int realMid = (mid + min) % nums.length;    //把mid向右移位后对应的就是真正的中间数
            if(target == nums[realMid]) return realMid;
            else if(target > nums[realMid]) lo = mid + 1;
            else hi = mid - 1;
        }
        return -1;
    }
}
