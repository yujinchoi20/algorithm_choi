import java.util.*;
import java.io.*;

class Ice {
    int x;
    int y;
 
    Ice(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Main {
	static int N, M;
	static int arr[][];
	static boolean visit[][];
	
	static int dx[] = {-1, 1, 0, 0};
	static int dy[] = {0, 0, -1, 1};
	static int nx, ny;
	static int num = 0, year = 0; //빙산 덩어리 개수, 시간(년)
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new int[N][M];
		visit = new boolean[N][M];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		while(sep() < 2) { //덩어리가 2개 미만일 경우에만 반복됨. 
			int num = sep();
			if(num == 0) {
				year = 0;
				break;
			}
			
			melt();
			year++;
		}
		System.out.println(year);
	}
	
	public static int sep() { //빙산 덩어리 구하는 메소드 
		boolean[][] visited = new boolean[N][M];
		int cnt = 0; //빙산 덩어리 갯수 
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++) {
				if(arr[i][j] != 0 && !visited[i][j]) {
					dfs(i, j, visited);
					cnt++;
				}
			}
		}
		
		return cnt++;
	}
	
	public static void dfs(int row, int col, boolean[][] visit) {
		visit[row][col] = true;
		
		for(int i = 0; i < 4; i++) {
			nx = row + dx[i];
			ny = col + dy[i];
			
			if(rangeChk() && arr[nx][ny] != 0 && !visit[nx][ny]) {
				dfs(nx, ny, visit);
			}
		}
	}
	
	public static void melt() {
		Queue<Ice> q = new LinkedList<>();
		boolean[][] visited = new boolean[N][M];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < M; j++){
				if(arr[i][j] != 0) {
					q.offer(new Ice(i, j));
					visited[i][j] = true;
				}
			}
		}
		
		while(!q.isEmpty()) {
			Ice ice = q.poll();
			int cnt = 0; //0의 개수, 바다인 면의 개수
			
			for(int i = 0; i < 4; i++) {
				nx = ice.x + dx[i];
				ny = ice.y + dy[i];
				
				if(rangeChk() && arr[nx][ny] == 0 && !visited[nx][ny]) {
					cnt++;
				}
			}
			
			if(arr[ice.x][ice.y] - cnt < 0) {
				arr[ice.x][ice.y] = 0;
			}
			else {
				arr[ice.x][ice.y] -= cnt;
			}
		}
	}
	
	
	public static boolean rangeChk() { //상하좌우오왼으로 이동했을 때 좌표의 범위 체크 
		if(nx >= 0 && ny >= 0 && nx < N && ny < M) return true;
		
		return false;
	}
}
