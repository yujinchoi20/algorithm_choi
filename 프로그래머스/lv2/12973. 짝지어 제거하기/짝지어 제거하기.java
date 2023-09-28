import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            String str = s.substring(i, i+1);
            
            if(stack.isEmpty()) {
                stack.push(str);
                continue;
            }
            
            if(str.equals(stack.peek())) {
                stack.pop();
            } else {
                stack.push(str);
            }
        }
        
        if(stack.size() == 0) {
            answer = 1;
        }
        
        return answer;
    }
}