import java.io.*;
import java.util.StringTokenizer;

public class Main {
	static int n, m;
	static int p, c; //parent, child
	static int x, y;
	static int count = -1;
	static int[][] arr;
	static boolean[] visit;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		visit = new boolean[n+1];
		
		st = new StringTokenizer(br.readLine());
		p = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		m = Integer.parseInt(br.readLine());
		while(m-- > 0) {
			st = new StringTokenizer(br.readLine());
			x = Integer.parseInt(st.nextToken());
			y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
		}
		
		dfs(p, c, 0);
		
		bw.write(count+"");
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void dfs(int s, int e, int c) {
		visit[s] = true;
		
		if(s == e) {
			count = c;
			return ;
		}
		
		for(int i = 1; i <= n; i++) {
			if(arr[s][i] == 1 && !visit[i]) {
				dfs(i, e, c+1);
			}
		}
	}
}