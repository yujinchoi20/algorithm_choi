import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static ArrayList<Integer> tree[];
	static boolean[] visit;
	static int[] result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		tree = new ArrayList[N+1];
		visit = new boolean[N+1];
		result = new int[N+1];
		
		for(int i = 0; i <= N; i++) {
			tree[i] = new ArrayList<>();
		}
		
		for(int i = 0; i < N - 1; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			tree[x].add(y); 
			tree[y].add(x);
		}
		
		dfs(1);
		
		for(int i = 2; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void dfs(int start) {
		visit[start] = true;
		
		for(int i : tree[start]) {	
			if(!visit[i]) {
				result[i] = start;
				dfs(i);
			}
		}
	}
}