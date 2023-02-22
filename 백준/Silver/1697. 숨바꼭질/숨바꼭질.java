import java.io.*;
import java.util.*;

public class Main {
	static int N, K;
	static int cnt = 0;
	static int[] arr = new int[100001];
	static Queue<Integer> q = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		System.out.println(bfs(N) - 1);
	}
	
	public static int bfs(int n) {
		arr[n] = 1;
		q.add(n);
		
		while(!q.isEmpty()) {
			int tmp = q.poll();
			if(tmp == K) return arr[K];
			
			if(tmp - 1 >= 0 && arr[tmp - 1] == 0) {
				arr[tmp - 1] = arr[tmp] + 1;
				if((tmp - 1) == K) break; 
				q.add(tmp - 1);
			}
			
			if(tmp + 1 <= 100000 && arr[tmp + 1] == 0) {
				arr[tmp + 1] = arr[tmp] + 1;
				if((tmp + 1) == K) break; 
				q.add(tmp + 1);
			}
			
			if(tmp * 2 <= 100000 && arr[tmp * 2] == 0) {
				arr[tmp * 2] = arr[tmp] + 1;
				if((tmp * 2) == K) break; 
				q.add(tmp * 2);
			}
		}
		
		return arr[K];
	}
}