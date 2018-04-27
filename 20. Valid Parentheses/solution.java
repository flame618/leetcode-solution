class Solution {
    public boolean isValid(String s) {
        if((s.length() & 1) == 1)
            return false;
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++)
        {
            char curChar = s.charAt(i);
            if(curChar == '(')
            {
                stack.push(')');
            }
            else if(curChar == '{')
            {
                stack.push('}');
            }
            else if(curChar == '[')
            {
                stack.push(']');
            }
            else if(stack.isEmpty() || stack.pop() != curChar)
            {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
