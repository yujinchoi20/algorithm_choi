import java.io.*;
import java.util.*;

public class Main {
	static int n, m;
	static int a, b, x, y;
	static int[][] arr;
	static boolean[] visit;
	static int count = -1; //관계없는 촌수 일 경우 -1 출력
	static Queue<Integer> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		st = new StringTokenizer(br.readLine());
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		
		m = Integer.parseInt(br.readLine());
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		//시작점과 끝점을 지정 -> 시작점 == 끝점 실행 종료, cnt 출력
		q.add(a);
		dfs(a, b, 0);
		
		System.out.println(count);
	}
	
	public static void dfs(int start, int end, int cnt) {
		visit[start] = true;
		if(start == end) {
			count = cnt;
			return ;
		}
		
		for(int i = 1; i <= n; i++) {
			if(arr[start][i] == 1 && !visit[i]) {
				q.add(i);
				dfs(i, end, cnt+1);
			}
		}
	}
}
