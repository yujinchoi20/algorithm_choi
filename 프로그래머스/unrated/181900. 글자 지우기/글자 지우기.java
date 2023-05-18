class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        char[] cArr = my_string.toCharArray();
        
        for(int idx : indices) {
            cArr[idx] = ' ';
        }
        
        for(char c : cArr) {
            if(c != ' ') {
                answer += c;
            }
        }
        
        return answer;
    }
}