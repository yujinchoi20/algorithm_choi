class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                answer[i][j] = 0;
            }
        }
        
        int x = 0, y = 0;
        int dir = 0; //0:우, 1:하, 2:좌, 3:상
        int v = 1;
        
        while(v <= n*n) {
            answer[x][y] = v++;
            
            if(dir == 0) {
                if(y == n-1 || answer[x][y+1] != 0) { //경계에 있거나, 이미 방문 했다면
                    dir = 1; 
                    x++;
                } else {
                    y++;
                }
            } else if(dir == 1) {
                if(x == n-1 || answer[x+1][y] != 0) {
                    dir = 2;
                    y--;
                } else {
                    x++;
                }
            } else if(dir == 2) {
                if(y == 0 || answer[x][y-1] != 0) {
                    dir = 3;
                    x--;
                } else {
                    y--;
                }
            } else {
                if(answer[x-1][y] != 0) {
                    dir = 0;
                    y++;
                } else {
                    x--;
                }
            }
        }
        
        return answer;
    }
}