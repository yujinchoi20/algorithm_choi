import java.util.*;
import java.io.*;

public class Main {
	static int n, m, v;
	static int x, y;
	static int[][] arr;
	static boolean[] visitDFS;
	static boolean[] visitBFS;
	static Queue<Integer> queue = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1];
		visitDFS = new boolean[n+1];
		visitBFS = new boolean[n+1];
		
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		System.out.print(v + " ");
		dfs(v);
		
		System.out.println();
		System.out.print(v + " ");
		bfs(v);
	}
	
	public static void dfs(int s) {
		visitDFS[s] = true;
		
		for(int i = 1; i <= n; i++) {
			if(arr[s][i] == 1 && !visitDFS[i]) {
				System.out.print(i + " ");
				dfs(i);
			}
		}
	}
	
	public static void bfs(int s) {
		visitBFS[s] = true;
		queue.add(v);
		
		while(!queue.isEmpty()) {
			int tmp = queue.poll();
			
			for(int i = 1; i <= n; i++) {
				if(arr[tmp][i] == 1 && !visitBFS[i]) {
					visitBFS[i] = true;
					queue.add(i);
					System.out.print(i + " ");
				}
			}
		}
	}
}