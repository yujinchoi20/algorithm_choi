import java.util.*;

class Solution {
    public int[] solution(int[] emergency) {
        int l = emergency.length;
        int[][] arr = new int[l][2];
        int[] answer = new int[l];
        
        for(int i = 0; i < l; i++) {
            for(int j = 0; j < 2; j++) {
                if(j == 0) {
                    arr[i][j] = i;
                } else {
                    arr[i][j] = emergency[i];
                }
            }
        }
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[1]).reversed());
        
        for(int i = 0; i < l; i++) {
            arr[i][1] = i+1;    
        }
        Arrays.sort(arr, Comparator.comparingInt((int[] o) -> o[0]));
        
        for(int i = 0; i < l; i++) {
            answer[i] = arr[i][1];
        }
        
        return answer;
    }
}