import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        int arrLen = 1;
        
        while(arrLen < len){
            arrLen *= 2;
            
            if(arrLen > len) {
                break;
            } else if(arrLen == len) {
                return arr;
            }
        }
        
        int[] answer = new int[arrLen];
        //Arrays.fill(answer, 0);
        
        for(int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
}