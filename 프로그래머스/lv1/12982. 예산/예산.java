import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        
        for(int i = 0; i < d.length; i++) {
            sum += d[i];    
        }
        
        if(sum <= budget) {
            answer = d.length;
        } else {
            Arrays.sort(d);
            sum = 0;
            
            int idx = 0;
            while(sum <= budget) {
                sum += d[idx];
                idx++;
            }
            answer = idx - 1;
        }
        
        return answer;
    }
}