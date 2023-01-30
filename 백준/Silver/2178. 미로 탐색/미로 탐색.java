import java.io.*;
import java.util.*;

public class Main {
	static final int MAX = 100;
	static int N, M;
	static int MIN = Integer.MAX_VALUE;
	static int[][] path;
	static boolean[][] visit;
	
	//상 하 좌 우
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		path = new int[N][M];
		visit = new boolean[N][M]; 
		
		for(int i = 0; i < N; i++) {
			String s = br.readLine();
			for(int j = 0; j < M; j++) {
				path[i][j] = s.charAt(j) - '0'; //StringTokenizer 실패
			}
		}
		
		visit[0][0] = true;
		bfs(0, 0);
		System.out.println(path[N-1][M-1]);
	}
	
	public static void bfs(int row, int col) {
		Queue<int[]> queue = new LinkedList<>(); //[row, col] 형태를 저장
		queue.add(new int[] {row, col});
		
		while(!queue.isEmpty()) {
			int tmp[] = queue.poll(); //현재 위치
			int tx = tmp[0];
			int ty = tmp[1];
			
			for(int i = 0; i < 4; i++) { //상 하 좌 우 모두 탐색
				//다음 위치
				int nextX = tx + dx[i]; 
				int nextY = ty + dy[i];
				
				//범위를 벗어날 경우
				if(nextX < 0 || nextX >= N || nextY < 0 || nextY >= M) continue;
				//이미 방문 했거나 배열 요소가 0일 경우 
				if(visit[nextX][nextY] || path[nextX][nextY] == 0) continue;
				
				queue.add(new int[] {nextX, nextY});
				path[nextX][nextY] = path[tx][ty] + 1; 
				//어차피 1이라는 가정하에 여기까지 넘어보기 때문에 해당 요소에 1만 더해주면 이동 칸 수를 알 수 있음
				visit[nextX][nextY] = true;
			}
		}
	}
}