class Solution {
    public long solution(long n) {
        long answer = 0;
        
        for(long i = 1; i <= Math.sqrt(n); i++) {
            if(i*i == n) {
                answer = (i+1) * (i+1);
            }
        }
        
        if(answer == 0) {
            answer = -1;
        }
        
        return answer;
    }
}