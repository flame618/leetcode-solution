class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();
        for(String str : strs)
        {
            char[] c = str.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!map.containsKey(key))
            {
                List<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(key, temp);
            }
            else
            {
                map.get(key).add(str);
            }
        }
        res.addAll(new ArrayList(map.values()));
        return res;
    }
}
