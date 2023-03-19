import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[] dx = {-1, 1, 0, 0}; //좌우
	static int[] dy = {0, 0, -1, 1}; //상하
	
	static char arr[][];
	static boolean visit[][];
	static int nx, ny, area = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str;
		
		N = Integer.parseInt(br.readLine());
		arr = new char[N][N];
		visit = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			str = br.readLine();
			for(int j = 0; j < N; j++) {
				arr[i][j] = str.charAt(j);
			}
		}

		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visit[i][j]) {
					dfs(i, j);
					area++;
				}
			}
		}	
		sb.append(area).append(" ");
		
		area = 0;
		visit = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] == 'R') {
					arr[i][j] = 'G';
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(!visit[i][j]) {
					dfs(i, j);
					area++;
				}
			}
		}	
		sb.append(area);
		
		System.out.println(sb);
	}
	
	public static void dfs(int row, int col) {
		visit[row][col] = true;
		
		for(int i = 0; i < 4; i++) {
			nx = row + dx[i];
			ny = col + dy[i];
			
			if(rangeChk() && !visit[nx][ny] && arr[row][col] == arr[nx][ny]) {
				dfs(nx, ny);
			}
		}
	}
	
	public static boolean rangeChk() {
		return (nx >= 0 && nx < N && ny >= 0 && ny < N);
	}
}