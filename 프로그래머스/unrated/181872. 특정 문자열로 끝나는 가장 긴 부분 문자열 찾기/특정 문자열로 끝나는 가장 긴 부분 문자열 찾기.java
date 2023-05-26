class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = myString.lastIndexOf(pat);
        
        for(int i = 0; i < idx; i++) {
            answer += myString.substring(i, i+1);    
        }
        answer += pat;
        
        return answer;
    }
}