import java.io.*;
import java.util.*;

//시간초과
public class Main {
	static int N, M;
	static int[][] arr;
	static boolean[] visit;
	static int cnt = 0; //output 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());;
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N+1][N+1];
		visit = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());

			arr[u][v] = 1;
			arr[v][u] = 1;
		}
		
		for(int i = 1; i <= N; i++) {
			if(!visit[i]) {
				dfs(i);
				cnt++;
			}
		}
		
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
	}
	
	public static void dfs(int idx) {
		if(visit[idx]) {
			return;
		}
		else {
			visit[idx] = true;
			
			for(int i = 1; i <= N; i++) {
				if(arr[idx][i] == 1) {
					dfs(i);
				}
			}
		}
	}
}