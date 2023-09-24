class Solution {
    public int solution(int n) {
        int answer = 0;
        int div = 1;
        
        while(div <= n) {
            if(n % div == 0) {
                ++answer;
            }
            div += 2;
        }
        
        return answer;
    }
}