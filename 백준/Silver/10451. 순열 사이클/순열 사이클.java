import java.io.*;
import java.util.*;

public class Main {
	static int T;
	static int N;
	static int[] arr;
	static boolean[] visit;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N + 1];
			visit = new boolean[N + 1];
			st = new StringTokenizer(br.readLine());
			
			for(int i = 1; i <= N; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for(int i = 1; i <= N; i++) {
				dfs(i);
			}

			sb.append(cnt).append('\n');
			cnt = 0;
		}
		
		System.out.println(sb);
	}
	
	public static void dfs(int start) {
		if(!visit[start]) {
			visit[start] = true;
			int tmp = arr[start];
			
			if(!visit[tmp]) {
				dfs(tmp);
			}
			else {
				cnt++;
			}
		}
	}
}