import java.io.*;
import java.util.*;

class point {
	int x;
	int y;
	int cnt;
	
	point(int x, int y){
		this.x = x;
		this.y = y;
		cnt = 0; //초기화 
	}
	
	point(int x, int y, int cnt){
		this.x = x;
		this.y = y;
		this.cnt = cnt;
	}
}

public class Main {
	static int I;
	static int x, y; //시작점, 끝점
	static int nx, ny; //nextX, nextY
	
	//나이트 이동 경로
	static int[] dx = {1, 2, 1, 2, -1, -2, -1, -2};
	static int[] dy = {2, 1, -2, -1, -2, -1, 2, 1};
	
	static boolean[][] visit;
	static point[] points = new point[2];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		while(T-- > 0) {
			I = Integer.parseInt(br.readLine());
			visit = new boolean[I][I];
			
			for(int i = 0; i < 2; i++) {
				st = new StringTokenizer(br.readLine());
				x = Integer.parseInt(st.nextToken());
				y = Integer.parseInt(st.nextToken());
				
				points[i] = new point(x, y);
			}
			
			sb.append(bfs()).append('\n');
		}
		
		System.out.println(sb);
	}
	
	public static int bfs() {
		Queue<point> queue = new LinkedList<>();
		queue.add(points[0]);
		visit[points[0].x][points[0].y] = true;
		
		while(!queue.isEmpty()) {
			point p = queue.poll();
			
			if(p.x == points[1].x && p.y == points[1].y) { //종료조건
				return p.cnt; 
			}
			
			for(int i = 0; i < 8; i++) {
				nx = p.x + dx[i];
				ny = p.y + dy[i];
				
				if(chk_Range() && !visit[nx][ny]) {
					visit[nx][ny] = true;
					queue.add(new point(nx, ny, p.cnt+1));
				}
			}
		}
		
		return -1;
	}
	
	public static boolean chk_Range() {
		return (nx >= 0 && nx < I && ny >= 0 && ny < I);
	}
}