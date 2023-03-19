import java.io.*;
import java.util.*;

class tomato {
	int x;
	int y;
	
	tomato(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int M, N;
	static int[][] arr;
	static boolean[][] visit;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int nx, ny;
	
	static Queue<tomato> q = new LinkedList<>();
	static int date = 0;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		M = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		arr = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				if(arr[i][j] == 1) q.add(new tomato(i, j));
			}
		}
		
		System.out.println(bfs());
	}
	
	public static int bfs() {
		while(!q.isEmpty()) {
			tomato tmp = q.poll();
			int tx = tmp.x;
			int ty = tmp.y;
			
			for(int i = 0; i < 4; i++) {
				nx = tx + dx[i];
				ny = ty + dy[i];
				
				if(rangeChk()) {
					if(arr[nx][ny] == 0) {
						arr[nx][ny] = arr[tx][ty] + 1;
						q.add(new tomato(nx, ny));
					}
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] == 0) return -1;
				date = Math.max(date, arr[i][j]);
			}
		}
		
		if(date == 1) return 0;
		else return date - 1;
	}
	
	public static boolean rangeChk() {
		return (nx >= 0 && nx < N && ny >= 0 && ny < M);
	}
}