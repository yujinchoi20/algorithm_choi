import java.io.*;
import java.util.*;

public class Main {
	static int N, M, V;
	static int[][] arr;
	static boolean[] visit_Dfs, visit_Bfs;
	static Queue<Integer> queue;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		V = Integer.parseInt(st.nextToken());
		
		arr = new int[1001][1001];
		visit_Dfs = new boolean[1001];
		visit_Bfs = new boolean[1001];
		
		//양방향
		int x, y;
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		System.out.print(V + " ");
		dfs(V);
		
		System.out.println();
		System.out.print(V + " ");
		bfs(V);
	}
	
	public static void dfs(int s) {
		visit_Dfs[s] = true;
		
		for(int i = 1; i <= N; i++) {
			if(arr[s][i] == 1 && !visit_Dfs[i]) {
				System.out.print(i + " ");
				dfs(i);
			}
		}
	}
	
	public static void bfs(int s) {
		visit_Bfs[s] = true;
		queue = new LinkedList<>();
		queue.add(s); //맨 뒤에 넣고
		
		int tmp;
		while(!queue.isEmpty()) {
			tmp = queue.poll(); //맨 앞에 있는 값 가져오기
			
			for(int i = 1; i <= N; i++) {
				if(arr[tmp][i] == 1 && !visit_Bfs[i]) {
					queue.add(i);
					visit_Bfs[i] = true;
					System.out.print(i + " ");
				}
			}
		}
	}
}
