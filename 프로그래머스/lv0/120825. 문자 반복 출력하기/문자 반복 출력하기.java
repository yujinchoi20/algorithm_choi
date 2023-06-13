class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        
        for(int i = 0; i < my_string.length(); i++) {
            String s = my_string.substring(i, i+1); 
            for(int j = 0; j < n; j++) {
                answer += s;
            }           
        }
        
        return answer;
    }
}