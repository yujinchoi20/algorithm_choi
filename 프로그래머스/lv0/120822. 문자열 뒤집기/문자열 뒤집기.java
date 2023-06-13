class Solution {
    public String solution(String my_string) {
        String answer = "";
        int s = my_string.length();
        for(int i = 0; i < s; i++) {
            answer += my_string.charAt(s-i-1);
        }
        return answer;
    }
}