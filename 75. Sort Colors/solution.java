class Solution {
    public void sortColors(int[] nums) {
        int length = nums.length;
        int red = 0, white = 0, blue = 0;
        for(int i = 0; i < length; i++)
        {
            switch(nums[i])
            {
                case 0: red++; break;
                case 1: white++; break;
                case 2: blue++; break;
            }
        }
        for(int i = 0; i < red; i++) nums[i] = 0;
        for(int i = 0; i < white; i++) nums[i + red] = 1;
        for(int i = 0; i < blue; i++) nums[i + red + white] = 2;
    }
}
