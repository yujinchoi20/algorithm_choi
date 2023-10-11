import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0;
        String[] str = s.split("");
        String[] newStr = new String[str.length*2];
        Stack<String> stack = new Stack<>();
        
        for(int i = 0; i < str.length; i++) {
            newStr[i] = newStr[i+str.length] = str[i];
        }
        
        for(int i = 0; i < str.length; i++) {
            stack = new Stack<>(); //회전할 때 마다 stack 초기화
            
            for(int j = i; j < i + str.length; j++) {
                if(stack.isEmpty()) { //빈 스택일 때, push
                    stack.push(newStr[j]);
                    continue;
                }
                
                //괄호 짝 찾기 
                if(newStr[j].equals(")")) {
                    if(stack.peek().equals("(")) {
                        stack.pop();
                    }
                } else if(newStr[j].equals("}")) {
                    if(stack.peek().equals("{")) {
                        stack.pop();
                    }
                } else if(newStr[j].equals("]")) {
                    if(stack.peek().equals("[")) {
                        stack.pop();
                    }
                } else {
                    stack.push(newStr[j]);
                }
            }
            
            if(stack.size() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}