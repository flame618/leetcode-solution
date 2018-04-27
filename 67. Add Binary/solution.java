class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1;
        int carry = 0;
        while(i >= 0 || j >= 0)
        {
            int num1 = 0, num2 = 0;
            if(i >= 0) num1 = a.charAt(i--) - '0';
            if(j >= 0) num2 = b.charAt(j--) - '0';
            int sum = num1 + num2 + carry;
            carry = sum >> 1;
            res = res.append(sum & 1);
        }
        if(carry == 1) res.append('1');
        return res.reverse().toString(); 
    }
}
