import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        for(int i = 0; i < k; i++) {
            answer[i] = -1;
        }
        
        ArrayList<Integer> reArr = new ArrayList<>();
        int[] re = Arrays.stream(arr).distinct().toArray(); //[0, 1, 2, 3]
        
        int len = re.length;
        if(len <= k) {
            for(int i = 0; i < len; i++) {
                answer[i] = re[i];
            }
        } else {
            for(int i = 0; i < k; i++) {
                answer[i] = re[i];
            }
        }
        
        return answer;
    }
}