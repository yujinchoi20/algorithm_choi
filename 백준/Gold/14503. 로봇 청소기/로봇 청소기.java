import java.io.*;
import java.util.*;

public class Main {
	static int N, M, cnt = 0;
	static int r, c, d;
	static int[][] arr;
	
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken()); //y
		M = Integer.parseInt(st.nextToken()); //x
		
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		arr = new int[N+1][M+1];
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < M; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(r, c, d);
		System.out.println(cnt);
	}
	
	public static void dfs(int r, int c, int direc) {
		if(arr[r][c] == 0) {
			arr[r][c] = 2; //현재위치 청소
			cnt++;
		}
		
		//빈칸이 있을 경우
		boolean flag = false;
		int origin = direc; //현재 방향
		
		for(int i = 0; i < 4; i++) {
			int nd = (direc + 3) % 4; //반시계 방향
			int nr = r + dr[nd];
			int nc = c + dc[nd];
			
			if(nr > 0 && nr < N && nc > 0 && nc < M && arr[nr][nc] == 0) {
				dfs(nr, nc, nd);
				
				flag = true; //true일 때 밑에 if문 실행 안함.
				break;
			}
			
			direc = (direc + 3) % 4;
		}
		
		//빈칸이 없을 경우
		if(!flag) {
			int bd = (origin + 2) % 4; //후진
			int br = r + dr[bd];
			int bc = c + dc[bd];
			
			if(br > 0 && br < N && bc > 0 && bc < M && arr[br][bc] != 1) {
				dfs(br, bc, origin); //바라보는 방향은 그대로 유지 
			}
		}
	}
}