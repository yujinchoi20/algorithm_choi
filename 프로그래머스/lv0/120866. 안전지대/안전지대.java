class Solution {
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[] ddx = {-1, 1, -1, 1};
    static int[] ddy = {1, 1, -1, -1};
    static boolean[][] visit;

    public int solution(int[][] board) {
        int answer = 0;
        int len = board.length;
        visit = new boolean[len][len];
        
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] == 1) {
                    for(int k = 0; k < 4; k++) {
                        int tx = i + dx[k];
                        int ty = j + dy[k];
                        
                        if(chk(tx, ty, len) && board[tx][ty] != 1 && !visit[tx][ty]) {
                            board[tx][ty] = -1;
                        }
                    }
                    
                    for(int k = 0; k < 4; k++) {
                        int tx = i + ddx[k];
                        int ty = j + ddy[k];
                        
                        if(chk(tx, ty, len) && board[tx][ty] != 1 && !visit[tx][ty]) {
                            board[tx][ty] = -1;
                        }
                    }
                }
            }
        }
        
        for(int i = 0; i < len*len; i++) {
            int x = i / len;
            int y = i % len;
            if(board[x][y] == 0) 
                answer++;
        }
        
        return answer;
    }
    
    public static boolean chk(int x, int y, int l) {
        return x >= 0 && y >= 0 && x < l && y < l;
    }
}