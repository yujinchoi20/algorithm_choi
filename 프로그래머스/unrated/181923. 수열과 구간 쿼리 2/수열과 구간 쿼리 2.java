import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int len = queries.length;
        int[] answer = new int[len];
        
        Arrays.fill(answer, -1);
        
        for(int i = 0; i < len; i++) {
            System.out.print(answer[i]);
        }
        for(int i = 0; i < len; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];
            
            int min = Integer.MAX_VALUE;
            for(int j = s; j <= e; j++) {
                if(arr[j] > k) {
                    min = Math.min(min, arr[j]);
                }
            }

            if(min != Integer.MAX_VALUE)
                answer [i] = min;
        }
        return answer;
    }
}