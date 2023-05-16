class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        String answer = "";
        
        int len = my_strings.length;
        for(int i = 0; i < len; i++) {
            int s = parts[i][0];
            int e = parts[i][1];
            
            answer += my_strings[i].substring(s, e+1);
        }
        
        return answer;
    }
}