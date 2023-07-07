class Solution {
    public String solution(String s) {
        String answer = "";
        int l = s.length();
        
        if(l == 1) {
            return s;
        } else if(l % 2 == 0) {
            answer = s.substring(l/2-1, l/2) + s.substring(l/2, l/2+1);
        } else {
            answer = s.substring(l/2, l/2+1);
        }
        
        return answer;
    }
}