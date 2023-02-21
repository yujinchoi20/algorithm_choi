import java.io.*;
import java.util.*;

public class Main {
	static int f, s, g, u, d;
	static int cnt = 0;
	static int[] arr; 
	static Queue<Integer> queue = new LinkedList<Integer>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		f = Integer.parseInt(st.nextToken()); //건물 층수
		s = Integer.parseInt(st.nextToken()); //현재 층수
		g = Integer.parseInt(st.nextToken()); //도착 층수
		u = Integer.parseInt(st.nextToken()); //UP
		d = Integer.parseInt(st.nextToken()); //DOWN
		
		arr = new int[f + 1];
		System.out.println(bfs());
	}
	
	public static String bfs() {
		queue.add(s);
		arr[s] = 1;
		
		while(!queue.isEmpty()) {
			int tmp = queue.poll();
			if(tmp == g) return String.valueOf(arr[tmp] - 1); //엘리베이터로 g에 도착
			
			if(tmp + u <= f) {
				if(arr[tmp + u] == 0) {
					arr[tmp + u] = arr[tmp] + 1;
					queue.add(tmp + u);
				}
			}
			
			if(tmp - d > 0) {
				if(arr[tmp - d] == 0) {
					arr[tmp - d] = arr[tmp] + 1;
					queue.add(tmp - d);
				}
			}
		}
		
		return "use the stairs"; //계단으로 g에 도착 
	}
}