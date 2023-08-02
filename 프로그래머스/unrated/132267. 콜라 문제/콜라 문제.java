class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        int remain = 0;
        
        while(n >= a) {
            answer += (n/a) * b;
            remain = (n % a);
            
            n = (n/a)*b + remain;
        }
        
        return answer;
    }
}