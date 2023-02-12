import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int maxHeight = 0, max = 0, num = 0, nx, ny; 
	static int[][] arr = new int[101][101];
	static boolean[][] visit;
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < N; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				list.add(arr[i][j]);
			}
		}
		maxHeight = Collections.max(list);
		
		for(int h = 0; h < maxHeight; h++) {
			visit = new boolean[101][101];
			num = 0;
			
			for(int i = 0; i < N; i++) {
				for(int j = 0; j < N; j++) {
					if(arr[i][j] > h && !visit[i][j])
						num += dfs(i, j, h);
				}
			}
			
			max = Math.max(max, num);
		}
		
		System.out.println(max);
	}
	
	public static int dfs(int row, int col, int height) {
		visit[row][col] = true;
		
		for(int i = 0; i < 4; i++) {
			nx = row + dx[i];
			ny = col + dy[i];
			
			if(range_Chk() && arr[nx][ny] > height && !visit[nx][ny]) {
				dfs(nx, ny, height);
			}
		}
		
		return 1;
	}
	
	public static boolean range_Chk() { //index 범위 확인 
		return (nx >= 0 && nx < N && ny >= 0 && ny < N);
	}
}