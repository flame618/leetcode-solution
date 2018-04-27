class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for(int i : nums)
        {
            map.put(i, map.getOrDefault(i, 0) +  1);
        }
        for(int key : map.keySet())
        {
            int frequency = map.get(key);
            if(bucket[frequency] == null)
            {
                bucket[frequency] = new ArrayList();
            }
            bucket[frequency].add(key); //bucket数组表示下标对应的是出现次数，数值是个list，里面放置着出现该下标频率的所有数字.
        }
        List<Integer> res = new ArrayList<>();
        for(int i = bucket.length - 1; i >= 0 && res.size() < k; i--)
        {
            if(bucket[i] != null)
            {
                res.addAll(bucket[i]);
            }
        }
        return res;
    }
}
