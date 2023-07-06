class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        if(n == 1) {
            return answer;
        }
        
        while(n != 1) {
            if(answer > 500) {
                answer = -1;
                break;
            }
            
            if(n % 2 == 0) {
                n /= 2;
            } else {
                n *= 3;
                n += 1;
            }
            
            answer++;
        }

        return answer;
    }
}