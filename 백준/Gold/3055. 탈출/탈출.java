import java.util.*;
import java.io.*;

public class Main {
	static int r, c;
	static String[][] map;
	static int[][] count;
	static int[] dx = {1, -1, 0, 0};
	static int[] dy = {0, 0, 1, -1};
	static Queue<int[]> queue = new LinkedList<>();
	static Queue<int[]> water = new LinkedList<>();
	static int result = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		map = new String[r][c];
		count = new int[r][c];
		
		for(int i = 0; i < r; i++) {
			String[] s = br.readLine().split("");
			
			for(int j = 0; j < c; j++) {
				map[i][j] = s[j];
				
				if(map[i][j].equals("S")) {
					queue.add(new int[] {i, j, 0});
				} 
				if(map[i][j].equals("*")) {
					water.add(new int[] {i, j});
				}
			}
		}

		bfs();
		
		if(result == Integer.MAX_VALUE) {
			System.out.println("KAKTUS");
		} else {
			System.out.println(result);
		}
	}
	
	public static void bfs() {
		while(!queue.isEmpty()) {
			int len = water.size();
			
			for(int i = 0; i < len; i++) {
				int[] tmp = water.poll();
				int x = tmp[0];
				int y = tmp[1];
				
				for(int j = 0; j < 4; j++) {
					int tx = x + dx[j];
					int ty = y + dy[j];
					
					if(tx >= 0 && tx < r && ty >= 0 && ty < c && map[tx][ty].equals(".")) {
						map[tx][ty] = "*";
						water.add(new int[] {tx, ty});
					} 
				}
			}
			
			len = queue.size();
			for(int i = 0; i < len; i++) {
				int[] tmp = queue.poll();
				int x = tmp[0];
				int y = tmp[1];
				int minute = tmp[2];
				
				for(int j = 0; j < 4; j++) {
					int tx = x + dx[j];
					int ty = y + dy[j];
					
					if(tx >= 0 && tx < r && ty >= 0 && ty < c) {
						if(map[tx][ty].equals("D")) { //도착지점 
							result = Math.min(result, minute+1);
							return ;
						} else if(map[tx][ty].equals(".")) { //고슴도치가 이동할 수 있는 칸
							map[tx][ty] = "S";
							queue.add(new int[] {tx, ty, minute+1});
						}
					}
				}
			}
		}
	}
	
}