import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[][] w;
	static boolean[] visit;
	static int result = Integer.MAX_VALUE;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		w = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 1; j <= N; j++) {
				w[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 1; i <= N; i++) {
			visit = new boolean[N+1];
			visit[i] = true;
			dfs(i, i, 0);
			visit[i] = false;
		}
		
		System.out.println(result);
	}
	
	public static void dfs(int start, int here, int price) {
		if(all()) {
			if(w[here][start] != 0) {
				//System.out.println(here+"->"+start+": "+w[here][start]);
				result = Math.min(result, price + w[here][start]);
			}
			return;
		}
		
		for(int i = 1; i <= N; i++) {
			if(!visit[i] && w[here][i] != 0) {
				//System.out.println(here+"->"+i+": "+w[here][i]);
				visit[i] = true;
				dfs(start, i, price + w[here][i]);
				visit[i] = false;
			}
		}
	}
	
	public static boolean all() {
		for(int i = 1; i <= N; i++) {
			if(!visit[i]) return false;
		}
		return true;
	}
}