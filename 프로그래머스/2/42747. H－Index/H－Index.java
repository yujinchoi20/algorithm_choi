import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length; i++) {
            int h = citations.length - i;
            
            if(citations[i] >= h) {
                answer = h;
                break;
            }
        } //처음엔 citations[i] == h 으로 생각했음..
        
        return answer;
    }
}