class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxL = 0, i = 0, j = 0;
        int length = s.length();
        Set<Character>unique = new HashSet<>();
        while(i < length && j < length)
        {
            if(!unique.contains(s.charAt(j)))
            {
                unique.add(s.charAt(j));
                maxL = Math.max(maxL, j - i + 1);
                j++;
            }
            else
            {
                unique.remove(s.charAt(i));
                i++;
            }
        }
        return maxL;
    }
}
