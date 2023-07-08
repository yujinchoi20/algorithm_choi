class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for(int i = left; i <= right; i++) {
            int re = primeNum(i);
            if(re % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }
        }
        
        return answer;
    }
    
    public static int primeNum(int n) {
        int cnt = 0;
        
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                cnt++;
            }
        }
        
        return cnt;
    }
}