class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);  //先排序，排序对之后的查找很重要，1:可以让大小数字两级分开，向右变大，向左变小，方便准确调整三数之和的大小，并且有重复数字的话会全部相邻，方便有效去除重复
        int length = nums.length;
        for(int i = 0; i < length - 2; i++)
        {
            int numI = nums[i];
            int target = (-1) * nums[i];
            int j = i + 1, k = length - 1;
            while(j < k)
            {
                int numJ = nums[j], numK = nums[k];
                if(nums[j] + nums[k] < target)
                {
                    j++;   
                }
                else if(nums[j] + nums[k] > target)
                {
                    k--;   
                }
                else
                {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[k]);
                    result.add(temp);
                    while(nums[j] == numJ && j < k) //找出接下来所有等于该值的nums[j]并去除，有效去除重复
                        j++;
                    while(nums[k] == numK && j < k) //去重复
                        k--;
                }
            }
            while(i + 1 < length - 2 && nums[i + 1] == numI)    //去重复
               i++;
        }
        return result;
    }
}
