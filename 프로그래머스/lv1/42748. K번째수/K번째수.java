import java.util.Arrays;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int l = commands.length;
        int[] answer = new int[l];
        int[] arr;
        
        for(int i = 0; i < l; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            arr = new int[end-start+1];
            
            for(int j = start; j <= end; j++) {
                arr[j-start] = array[j-1];
            }
            
            Arrays.sort(arr);
            answer[i] = arr[commands[i][2]-1];
        }
        
        return answer;
    }
}