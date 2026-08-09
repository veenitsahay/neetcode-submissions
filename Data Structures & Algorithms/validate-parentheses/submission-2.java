class Solution {
    public boolean isValid(String s) {
        char[] ch = s.toCharArray();
        if(ch.length % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();

        for(char c: ch){
            if(c == '(' || c == '[' || c == '{'){
                stack.push(c);
                continue;
            }
            if(c == ')' &&  !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            } else if(c == ']' &&  !stack.isEmpty() && stack.peek() == '['){
                stack.pop();
            }
            else if(c == '}' &&  !stack.isEmpty() && stack.peek() == '{'){
                stack.pop();
            }else{
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}
