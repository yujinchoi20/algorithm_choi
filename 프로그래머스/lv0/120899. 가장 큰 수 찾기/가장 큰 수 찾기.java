import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int m = 0, idx = -1;
        
        for(int i = 0; i < array.length; i++) {
            if(m < array[i]) {
                m = array[i];
                idx = i;
            }
        }
        
        answer[0] = m;
        answer[1] = idx;
        
        return answer;
    }
}