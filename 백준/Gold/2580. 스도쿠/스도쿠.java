import java.io.*;
import java.util.*;

public class Main {
	static int[][] arr = new int[9][9]; 
	static StringBuilder sb;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		for(int i = 0; i < 9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < 9; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		dfs(0, 0);
	}
	
	public static void dfs(int row, int col) {
		if(col == 9) { //세로순환이 끝났을 경우
			dfs(row + 1, 0);
			return;
		}
		
		if(row == 9) { //가로순환도 끝났을 경우 
			sb = new StringBuilder();
			
			for(int i = 0; i < 9; i++) {
				for(int j = 0; j < 9; j++) {
					sb.append(arr[i][j]).append(' ');
				}
				sb.append('\n');
			}
			
			System.out.println(sb);
			System.exit(0);
		}
		
		//----------------------------------------------------------
		//0은 새로 채워야 할 칸이기 때문에, 재귀호출을 통해 들어갈 숫자를 찾는다. 
		if(arr[row][col] == 0) {
			for(int i = 1; i <= 9; i++) {
				if(poss(row, col, i)) { //arr[row][col]에 i라는 숫자가 들어갈 수 있는지 판단되면 대입.
					arr[row][col] = i; 
					dfs(row, col + 1); //세로순환부터 하기 때문에 col + 1
				}
			}
			
			arr[row][col] = 0;
			
			return ;
		}
		
		dfs(row, col + 1); //세로순환 우선
		
		//만약 가로순환을 우선으로 할 경우 조건문(순서)과 재귀호출시 매개변수를 row + 1, col로 조정하면 됨. 
	}
	
	public static boolean poss(int row, int col, int value) { //arr[row][col] 자리에 value값이 들어 갈 수 있는지 판단하는 함수.
		for(int i = 0; i < 9; i++) { //행
			if(arr[row][i] == value) return false;
		}
		
		for(int i = 0; i < 9; i++) { //열
			if(arr[i][col] == value) return false;
		}
		
		//3x3안에서 중복되는 값이 있는지 확인함을 위함.
		int x = (row / 3) * 3;
		int y = (col / 3) * 3;
		
		//i, j의 시작이 x, y인 것을 주의하기! 
		for(int i = x; i < x + 3; i++) { //3 x 3
			for(int j = y; j < y + 3; j++) {
				if(arr[i][j] == value) return false;
			}
		}
		
		return true; //중복되는 값이 없다면 true를 반환하여 arr[row][col] = value를 대입함.
	}
}
