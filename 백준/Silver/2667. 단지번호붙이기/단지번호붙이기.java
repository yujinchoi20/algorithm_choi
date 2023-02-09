import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[][] arr;
	static boolean[][] visit;
	static int dx[] = {0, 0, -1, 1};
	static int dy[] = {-1, 1, 0, 0};
	
	static int cnt = 0, num = 0;
	static int nx = 0, ny = 0;
	static List<Integer> list = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N][N];
		visit = new boolean[N][N];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			for(int j = 0; j < N; j++) {
				arr[i][j] = Character.getNumericValue(str.charAt(j));
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				if(arr[i][j] == 1 && !visit[i][j]) {
					cnt = 0;
					num++;
					dfs(i, j);
					
					list.add(cnt);
				}
			}
		}
		
		Collections.sort(list);
		bw.append(num + "\n");
		for(int n : list) {
			bw.append(n + "\n");
		}
		
		bw.flush();
		bw.close();
		
//		System.out.println(num);
//		for(int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i));
//		}
	}
	
	public static void dfs(int row, int col) {
		visit[row][col] = true;
		arr[row][col] = num;
		cnt++;
		
		for(int i = 0; i < 4; i++) { //상하좌우 살피기 
			nx = dx[i] + row;
			ny = dy[i] + col;
			
			if(range_Chk() && arr[nx][ny] == 1 && !visit[nx][ny]) {
				visit[nx][ny] = true;
				arr[nx][ny] = num;
				dfs(nx, ny);
			}
		}
	}
	
	public static boolean range_Chk() { //index 범위 확인 
		return (nx >= 0 && nx < N && ny >= 0 && ny < N);
	}
}