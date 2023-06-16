class Solution {
    public int solution(int n) {
        int answer = 0;
        //1 2 3 5 7
        //4 6 8 9 10 
        
        for(int i = 1; i <= n; i++) {
            answer += prime(i);
        }
        
        return answer;
    }
    
    public int prime(int num) {
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return 1;
            }
        }
        
        return 0;
    }
}