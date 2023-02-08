import java.io.*;
import java.util.*;

public class Main {
	static int T, N;
	static int[][] arr;
	static boolean[] visit;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		T = Integer.parseInt(br.readLine()); //컴퓨터 수
		N = Integer.parseInt(br.readLine()); //연결되어 있는 쌍의 수
		
		arr = new int[T+1][T+1];
		visit = new boolean[T+1];
		
		//1번을 기준으로 바이러스에 걸리게되는 컴퓨터 수를 구한다. 
		int x, y;
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		dfs(1);
		
		System.out.println(cnt);
	}
	
	public static void dfs(int s) { //s -> 시작점
		visit[s] = true;
		
		for(int i = 1; i <= T; i++) {
			if(arr[s][i] == 1 && !visit[i]) {
				cnt++;
				dfs(i);
			}
		}
	}
}