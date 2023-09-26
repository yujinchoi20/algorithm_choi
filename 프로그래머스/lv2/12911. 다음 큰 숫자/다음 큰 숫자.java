class Solution {
    public int solution(int n) {
        int answer = 0;
        int cnt = Integer.bitCount(n);
        
        while(true) {
            ++n;

            int reCnt = Integer.bitCount(n);
            
            if(cnt == reCnt) {
                answer = n;
                break;
            }
        }
        
        return answer;
    }
}