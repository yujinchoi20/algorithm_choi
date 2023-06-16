class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if(n % 6 == 0) {
            answer = n / 6;
        } else { 
            for(int i = 1; i < 100; i++) {
                if(n * i % 6 == 0) {
                    answer = (n * i) / 6;
                    break;
                }
            }
        }
        
        return answer;
    }
}