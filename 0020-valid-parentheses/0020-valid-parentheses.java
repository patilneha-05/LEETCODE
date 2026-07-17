class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<>();

        if(s.isEmpty()) return false;

        for(char ch : s.toCharArray()){

            if(ch == '(' || ch == '[' || ch == '{'){
                stack.push(ch);
            }
            else{
                
                if(stack.isEmpty())
                    return false;

                char top = stack.pop();
                if(top != '(' && ch == ')' || top != '[' && ch == ']' || top != '{' && ch == '}'){
                    return false;
                }
            }

            
        }
        
        if(stack.isEmpty())
            return true;

        return false;
        
    }
}