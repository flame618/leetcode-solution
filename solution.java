class Solution {
    public String longestPalindrome(String s) {
        int res = 1, start = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int j = i, k = i, l1 = 1, start1 = 0;
            while(j > 0 && k < s.length() - 1)
            {
                j--;
                k++;
                if(s.charAt(j) == s.charAt(k))
                {
                    l1 += 2;
                    start1 = j;
                } 
                else break;
            }
            int l2 = 1, start2 = 0;
            if(i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1))
            {
                l2 = 2;
                j = i;
                k = i + 1;
                start2 = j;
                while(j > 0 && k < s.length() - 1)
                {
                    j--;
                    k++;
                    if(s.charAt(j) == s.charAt(k))
                    {
                        start2 = j;
                        l2 += 2;
                    } 
                    else break;
                }
            }
            int maxL = 0, maxStart = 0;
            if(l1 >= l2)
            {
                maxL = l1;
                maxStart = start1;
            }
            else
            {
                maxL = l2;
                maxStart = start2;
            }
            if(maxL > res)
            {
                res = maxL;
                start = maxStart;
            }
        }
        System.out.println(res + "&&" + start);
        return s.substring(start, res + start);
    }
}
