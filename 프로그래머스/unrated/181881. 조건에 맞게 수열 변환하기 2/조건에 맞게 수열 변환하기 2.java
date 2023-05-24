import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int[] tmp = new int[arr.length];
        int answer = 0;
        
        while(true) {
            answer++;
            for(int i = 0; i < arr.length; i++){
                tmp[i] = arr[i];
            }
            
            for(int i = 0; i < arr.length; i++) {
                if(arr[i] >= 50 && arr[i] % 2 == 0) {
                    arr[i] /= 2;
                } else if(arr[i] < 50 && arr[i] % 2 != 0){
                    arr[i] = arr[i] * 2 + 1;
                }                 
            }
            
            if(Arrays.equals(tmp, arr)) break;
        }
        return answer-1;
    }
}