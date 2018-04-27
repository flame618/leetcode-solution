class Solution {
    public String addStrings(String num1, String num2) {
        int i1 = num1.length() - 1, i2 = num2.length() - 1;
        int carry = 0;
        StringBuilder res = new StringBuilder();
        while(i1 >= 0 || i2 >= 0)
        {
            int digit1 = 0, digit2 = 0;
            if(i1 >= 0) digit1 = num1.charAt(i1--) - '0';
            if(i2 >= 0) digit2 = num2.charAt(i2--) - '0';
            int sum = digit1 + digit2 + carry;
            carry = sum / 10;
            res.append(sum % 10);
        }
        if(carry == 1) res.append('1');
        return res.reverse().toString();
    }
}
