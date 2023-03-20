import java.io.*;
import java.util.*;

class treasure{
	int x;
	int y;
	
	treasure(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int N, M;
	static char[][] arr;
	static boolean[][] visit;
	static int[][] time;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int nx, ny;
	static Queue<treasure> q = new LinkedList<>();
	
	static int hour = 0; //걸리는 시간 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String str;
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new char[N][M];
		
		for(int i = 0; i < N; i++) {
			str = br.readLine();
			for(int j = 0; j < M; j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] == 'L')
					bfs(i, j);
			}
		}
		
		System.out.println(hour);
	}
	
	public static void bfs(int row, int col) {
		time = new int[N][M];
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				time[i][j] = -1;
			}
		}
		
		time[row][col] = 0;
		q.add(new treasure(row, col));
		
		while(!q.isEmpty()) {
			treasure tmp = q.poll();
			int tx = tmp.x;
			int ty = tmp.y;
			
			for(int i = 0; i < 4; i++) {
				nx = tx + dx[i];
				ny = ty + dy[i];
				
				if(rangeChk() && time[nx][ny] == -1 && arr[nx][ny] == 'L') {
					time[nx][ny] = time[tx][ty] + 1;
					q.add(new treasure(nx, ny));
					hour = Math.max(hour, time[nx][ny]);
				}
			}
		}		
	}
	
	public static boolean rangeChk() {
		return (nx >= 0 && ny >= 0 && nx < N && ny < M);
	}
}