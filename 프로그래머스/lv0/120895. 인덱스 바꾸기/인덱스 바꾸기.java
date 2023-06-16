class Solution {
    public String solution(String my_string, int num1, int num2) {
        String answer = "";
        String[] str = my_string.split("");
        String s1 = str[num2], s2 = str[num1];
        
        for(int i = 0; i < str.length; i++) {
            if(i == num1) {
                answer += s1;
            } else if(i == num2) {
                answer += s2;
            } else {
                answer += str[i];
            }
        }
        
        return answer;
    }
}