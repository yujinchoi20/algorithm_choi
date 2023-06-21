import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        
        for (String num : s.split(" ")) {
            if(num.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(num));
            }
        }
        
        for (int i : stack) {
            answer += i;
        }
        
        return answer;
    }
}