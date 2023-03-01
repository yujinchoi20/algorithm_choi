import java.io.*;
import java.util.*;

public class Main {
	static int N, M, K;
	static int num = 0, cnt = 0;
	static int arr[][];
	static boolean[][] visit;
	
	static int[] dx = {-1, 1, 0, 0};
	static int[] dy = {0, 0, -1, 1};
	static int nx, ny;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		List<Integer> cntList = new ArrayList<>();
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visit = new boolean[N][M];
		
		for(int i = 0; i < K; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			for(int x = x1; x < x2; x++) {
				for(int y = y1; y < y2; y++) {
					arr[y][x] = 1;
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] == 0 && !visit[i][j]) {
					num += dfs(i, j);
				}
				if(cnt != 0) cntList.add(cnt);
				cnt = 0;
			}
		}
		
		Collections.sort(cntList);

		System.out.println(num);
		for(int i = 0; i < num; i++) {
			System.out.print(cntList.get(i) + " ");
		}
	}
	
	public static int dfs(int row, int col) {
		cnt++;
		visit[row][col] = true;
		
		for(int i = 0; i < 4; i++) {
			nx = row + dx[i];
			ny = col + dy[i];
			
			if(chk_Range() && !visit[nx][ny] && arr[nx][ny] == 0) {
				dfs(nx, ny);
			}
		}
		
		return 1;
	}
	
	public static boolean chk_Range() {
		return (nx >= 0 && nx < N && ny >= 0 && ny < M);
	}
}