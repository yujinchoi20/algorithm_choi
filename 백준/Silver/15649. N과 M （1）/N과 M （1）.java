import java.io.*;
import java.util.*;

public class Main {
	static StringBuilder sb = new StringBuilder();
	static int N, M;
	static int[] output;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		visit = new boolean[N];
		output = new int[M];
		dfs(0, 0);
		
		System.out.println(sb);
	}
	
	public static void dfs(int dep, int start) {
		if(dep == M) {
			for(int v : output) {
				sb.append(v).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i = start; i < N; i++) {
			if(!visit[i]) {
				visit[i] = true;
				output[dep] = i + 1;
				dfs(dep + 1, 0);
				visit[i] = false;
			}
		}
	}

}
