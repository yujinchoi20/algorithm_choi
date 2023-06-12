class Solution {
    public int solution(int[][] board, int k) {
        int answer = 0;
        int row = board.length; 
        int col = board[0].length;
        
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(i+j <= k) answer += board[i][j];
            }
        }
        
        return answer;
    }
}