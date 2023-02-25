import java.io.*;
import java.util.*;

class location{
	int x;
	int y;
	
	location(int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static ArrayList<location> arr;
	static ArrayList<ArrayList<Integer>> loca;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		
		while(T-- > 0) {
			int N = Integer.parseInt(br.readLine());
			arr = new ArrayList<>();
			loca = new ArrayList<>();
			
			for(int i = 0; i < N + 2; i++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				arr.add(new location(x, y));
			}
			
			for(int i = 0; i < N + 2; i++) {
				loca.add(new ArrayList<>());
			}
			
			
			for(int i = 0; i < N + 2; i++) {
				for(int j = i + 1; j < N + 2; j++) {
					if(Math.abs(arr.get(i).x - arr.get(j).x) + Math.abs(arr.get(i).y - arr.get(j).y)<= 1000) {
						loca.get(i).add(j);
						loca.get(j).add(i);
					}
				}
			}

			System.out.println(bfs(loca, N) ? "happy" : "sad");
		}
	}
	
	public static boolean bfs(ArrayList<ArrayList<Integer>> loca, int N) {
		Queue<Integer> queue = new LinkedList<>();
		queue.add(0);
		
		boolean[] visit = new boolean[N+2];
		visit[0] = true;
		
//		System.out.println(loca);
		
		while(!queue.isEmpty()) {
//			System.out.println("-----------------------------------");
			int now = queue.poll();
//			System.out.println("now: " + now);
			if(now == N + 1) {
				return true;
			}
			
			for(int next: loca.get(now)) {
//				System.out.println(next);
				if(!visit[next]) {
					visit[next] = true;
					queue.add(next);
				}
//				System.out.println("queue: " + queue);
			}
		}
		
		return false;
	}
}
