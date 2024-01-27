import java.util.Queue;
import java.util.LinkedList;

class Solution {
    static int answer = 0;
    static int n, m;
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};
    static int[][] visited;
     
    public static int solution(int[][] maps) {
        n = maps.length;
        m = maps[0].length;
        visited = new int[maps.length][maps[0].length];
        
        visited[0][0] = 1;
        bfs(maps, 0, 0); //호출
        answer = visited[maps.length-1][maps[0].length-1];
        
        if(answer == 0) {
            answer = -1;
        }
        
        return answer;
    }
    
	public static void bfs(int[][] maps, int x, int y) {
		Queue<int[]> queue = new LinkedList<>();
		queue.add(new int[]{0, 0});
		
		while(!queue.isEmpty()) {
			int[] current = queue.poll();
			x = current[0];
			y = current[1];
			
			for(int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(isRange(nx, ny, n-1, m-1) && 
						visited[nx][ny] == 0 && 
                        maps[nx][ny] == 1) {
					visited[nx][ny] = visited[x][y] + 1;
					queue.add(new int[] {nx, ny});
				}
			}
		}
	}
    
    //범위 체크
    public static boolean isRange(int nx, int ny, int rx, int ry) {
        return nx >= 0 && nx <= rx && ny >= 0 && ny <= ry; 
    }
}