import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int N;
	static char[][] candy;
	static int maxCnt = Integer.MIN_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = "";		
		N = Integer.parseInt(br.readLine());
		
		candy = new char[N][N];
		for(int i = 0; i < N; i++) {
			input = br.readLine();
			for(int j = 0; j < N; j++) {
				candy[i][j] = input.charAt(j);
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N - 1; j++) {
				if(candy[i][j] != candy[i][j+1]) {
					swap(i, j, i, j + 1);
					searchMax();
					swap(i, j, i, j + 1);
				}
			}
		}
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N - 1; j++) {
				if(candy[j][i] != candy[j+1][i]) {
					swap(j, i, j + 1, i);
					maxCnt = Math.max(searchMax(), maxCnt);
					swap(j, i, j + 1, i);
				}
			}
		}
		
		System.out.println(maxCnt);
	}
	
	public static void swap(int x1, int y1, int x2, int y2) {
		char tmp = candy[x1][y1];
		candy[x1][y1] = candy[x2][y2];
		candy[x2][y2] = tmp;
	}
	
	public static int searchMax() {
		for(int i = 0; i < N; i++) {
			int cnt = 1; 
			for(int j = 0; j < N-1; j++) {
				if(candy[i][j] == candy[i][j+1]) {
					cnt++;
				} else {
					cnt = 1;
				}
				maxCnt = Math.max(maxCnt, cnt);
			}
		}
		
		for(int i = 0; i < N; i++) {
			int cnt = 1;
			for(int j = 0; j < N - 1; j++) {
				if(candy[j][i] == candy[j+1][i]) {
					cnt++;
				} else {
					cnt = 1;
				}
				maxCnt = Math.max(maxCnt, cnt);
			}
		}
		
		return maxCnt;
	}
}