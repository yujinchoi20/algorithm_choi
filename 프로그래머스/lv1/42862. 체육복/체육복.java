import java.util.Arrays;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] arr = new int[n+1];
        Arrays.fill(arr, 1);
        
        for(int i = 0; i < lost.length; i++) {
            arr[lost[i]]--;
        } 
        for(int i = 0; i < reserve.length; i++) {
            arr[reserve[i]]++;
        }
        
        if(arr[1] == 0 && arr[2] > 1) {
            arr[1]++; arr[2]--;
        }
        if(arr[2] == 0 && arr[1] > 1) {
            arr[2]++; arr[1]--;
        }
        if(arr[n] == 0 && arr[n-1] > 1) {
            arr[n]++; arr[n-1]--;
        } 
        if(arr[n-1] == 0 && arr[n] > 1) {
            arr[n-1]++; arr[n]--;
        }
        
        for(int i = 2; i < n; i++) {
            if(arr[i] == 0 && arr[i+1] > 1) {
                arr[i]++; arr[i+1]--;
            } 
            if(arr[i] == 0 && arr[i-1] > 1) {
                arr[i]++; arr[i-1]--;
            }
        }
        
        for(int i = 1; i <= n; i++) {
            if(arr[i] != 0) answer++;
        }
        
        return answer;
    }
}