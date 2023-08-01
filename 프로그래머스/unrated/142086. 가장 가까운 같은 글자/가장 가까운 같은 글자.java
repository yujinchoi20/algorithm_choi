import java.util.Arrays;

class Solution {
    public int[] solution(String s) {
        int l = s.length();
        int[] answer = new int[l];
        int[] alpha = new int[26];
        
        Arrays.fill(alpha, -1);
        
        for(int i = 0; i < l; i++) {
            int n = s.charAt(i) - '0' - 49;
            
            if(alpha[n] == -1) {
                answer[i] = -1;
                alpha[n] = i;
            } else {
                answer[i] = i - alpha[n];
                alpha[n] = i;
            }
        }
        
        return answer;
    }
}