
class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int n = 0, d = 0;
        
        if(denom1 != denom2) {
            d = denom1 * denom2;
            n = numer1 * denom2 + numer2 * denom1;
        } else {
            d = denom1;
            n = numer1 + numer2;
        }
        
        int t = div(n, d);
        answer[0] = n / t;
        answer[1] = d / t;
        
        return answer;
    }
    
    public int div(int n, int d) {
        int m = Math.min(n, d);
        
        for(int i = m; i >= 1; i--) {
            if(n % i == 0 && d % i == 0) {
                return i;
            }
        }
        
        return 1;
    }
}