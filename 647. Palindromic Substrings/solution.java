class Solution {
    public int countSubstrings(String s) {
        int length = s.length();
        int count = 0;
        for(int i = 0; i < length; i++)
        {
            int left = i, right = i;
            boolean ji = true, ou = true;
            while(left >= 0 && right < length)
            {
                if((ji && s.charAt(left) == s.charAt(right)) && (ou && (right + 1 < length && s.charAt(left) == s.charAt(right + 1))))                       {
                   count += 2;
                    left--;
                    right++;
                }  
                else if((ji && s.charAt(left) == s.charAt(right)) && !(ou && (right + 1 < length && s.charAt(left) == s.charAt(right + 1)))) 
                {
                    count++;
                    left--;
                    right++;
                    ou = false;
                }
                else if(!(ji && s.charAt(left) == s.charAt(right)) && (ou && (right + 1 < length && s.charAt(left) == s.charAt(right + 1))))
                {
                    count++;
                    left--;
                    right++;
                    ji = false;
                } 
                else
                {
                    break;
                }
            }
        }
        return count;
    }
}
