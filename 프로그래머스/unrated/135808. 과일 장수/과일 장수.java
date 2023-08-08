import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int[] arr = reverse(score);
        int len = arr.length;
        int idx = 0;
        
        while(len >= m) {
            answer += arr[idx + m - 1] * m;
            idx += m;
            len -= m;
        }
        
        return answer;
    }
    
    public int[] reverse(int[] arr){
        int[] reverseArr = new int[arr.length];
        Arrays.sort(arr);
        
        for(int i = arr.length-1, j = 0; i >= 0; i--, j++) {
            reverseArr[j] = arr[i];
        }
        
        return reverseArr;
    }
}