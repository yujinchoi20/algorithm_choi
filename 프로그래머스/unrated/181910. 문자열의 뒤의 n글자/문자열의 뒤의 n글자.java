class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        String[] str = my_string.split("");
        int len = str.length;
        
        for(int i = len-n; i < len; i++) {
            answer += str[i];
        }
        
        return answer;
    }
}