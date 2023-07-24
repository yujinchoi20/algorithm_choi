import java.util.Arrays;

class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int l = sizes.length;
        
        int[] row = new int[l];
        int[] col = new int[l];
        
        for(int i = 0; i < l; i++) {
            row[i] = Math.min(sizes[i][0], sizes[i][1]);
            col[i] = Math.max(sizes[i][0], sizes[i][1]);
        }
        
        Arrays.sort(row);
        Arrays.sort(col);
        
        answer = row[l-1] * col[l-1];
        
        return answer;
    }
}