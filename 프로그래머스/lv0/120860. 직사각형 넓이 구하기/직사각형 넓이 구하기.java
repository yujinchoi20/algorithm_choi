import java.util.*;

class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        Arrays.sort(dots, Comparator.comparingInt((int[] d) -> d[1]));
        Arrays.sort(dots, Comparator.comparingInt((int[] d) -> d[0]));
        
        int x1 = dots[0][0]; int y1 = dots[0][1];
        int x2 = dots[1][0]; int y2 = dots[1][1];
        int x3 = dots[2][0]; int y3 = dots[2][1];
        
        int row = (int)Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        int col = (int)Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));
        
        answer = row * col;
        
        return answer;
    }
}