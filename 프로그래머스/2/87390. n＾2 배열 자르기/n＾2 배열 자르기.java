class Solution {
    public int[] solution(int n, long left, long right) {
        int[] answer = new int[(int)(right - left) + 1];
        
        for(long l = left; l <= right; l++) {
            int i = (int)(l/n); //row
            int j = (int)(l%n); //col
            
            answer[(int)(l-left)] = Math.max(i, j) + 1; //row, col 중에 큰 값
        }   
        
        return answer;
    }
}