import java.util.*;
import java.io.*;

public class Main {
	static String[][] map;
	static boolean[][] visit;
	static Queue<Node> queue;
	
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	
	static int n = 12, m = 6;
	static int cnt = 0; //연쇄 카운트 
	static boolean isPush = false; //연쇄가 발생했는지 체크 
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new String[n][m];
	
		for(int i = 0; i < 12; i++) {
			String[] s = br.readLine().split("");
			for(int j = 0; j < 6; j++) {
				map[i][j] = s[j];
			}
		}
		
		while(true) {
			isPush = false;
			
			bfs();
			floor();
			
			if(isPush == false) {
				break;
			}
			cnt++;
		}
		
		System.out.println(cnt);
	}
	
	
	
	public static void bfs() {
		queue= new LinkedList<>();
		visit = new boolean[n][m];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(!map[i][j].equals(".") && !visit[i][j]) { //색이 채워져 있는 칸
					ArrayList<int[]> list = new ArrayList<>();
					
					queue.add(new Node(i, j, map[i][j]));
					list.add(new int[] {i, j});
					visit[i][j] = true;
					
					while(!queue.isEmpty()) {
						Node node = queue.poll();
						
						int tx = node.x;
						int ty = node.y;
						String tColor = node.color;
						
						for(int k = 0; k < 4; k++) {
							int nx = tx + dx[k];
							int ny = ty + dy[k];
							
							if(chkRange(nx, ny) && !visit[nx][ny] && map[nx][ny].equals(tColor)) {
								queue.add(new Node(nx, ny, map[nx][ny]));
								list.add(new int[] {nx, ny});
								visit[nx][ny] = true;
							}
						}
					}
					
					if(list.size() >= 4) {
						for(int k = 0; k < list.size(); k++) {
							int x = list.get(k)[0];
							int y = list.get(k)[1];
							
							map[x][y] = "."; //터트려 없애고 빈 칸으로 만듦
							
							isPush = true; //연쇄가 일어남
						}
					}
				}
			}
		}
	}
	
	public static void floor() {
		for(int i = 0; i < m; i++) {
			down(i);
		}
	}
	
	public static void down(int j) {
		Queue<Node> puyo = new LinkedList<>();
		int idx = 11;
		
		for(int i = 11; i >= 0; i--) {
			if(!map[i][j].equals(".")) {
				puyo.add(new Node(i, j, map[i][j]));
				map[i][j] = ".";
			}
		}
		
		while(!puyo.isEmpty()) {
			Node node = puyo.poll();
			String color = node.color;
			
			map[idx][j] = color;
			idx--;
		}
	}
	
	public static boolean chkRange(int x, int y) {
		return x >= 0 && x < n && y >= 0 && y < m;
	}
	
	static class Node {
		int x;
		int y;
		String color;
		
		public Node(int x, int y, String color) {
			this.x = x;
			this.y = y;
			this.color = color;
		}
	}
	
}