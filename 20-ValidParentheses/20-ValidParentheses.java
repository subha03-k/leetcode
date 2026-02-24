// Last updated: 2/24/2026, 4:30:13 PM
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(char c : s.toCharArray()){
            if(c == '(')
            stack.push(')');
            else if(c == '{')
            stack.push('}');
            else if(c == '[')
            stack.push(']');
            else if(stack.isEmpty() || stack.pop() !=c)
            return false;
        }
        return stack.isEmpty();
    }
}