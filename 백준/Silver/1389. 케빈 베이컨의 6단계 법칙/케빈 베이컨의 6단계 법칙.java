import java.io.*;
import java.util.*;

public class Main {
	static int N, M;
	static int[][] arr;
	static int sum;
	static final int INF = 987654321;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N+1][N+1];
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= N; j++) {
				arr[i][j] = INF;
				
				if(i == j) arr[i][j] = 0;
			}
		}
		
		for(int i = 1; i <= M; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			arr[A][B] = arr[B][A] = 1;
		}
		br.close();
		
		for(int k = 1; k <= N; k++) {
			for(int i = 1; i <= N; i++) {
				for(int j = 1; j <= N; j++) {
					if(arr[i][j] > arr[i][k] + arr[k][j]) arr[i][j] = arr[i][k] + arr[k][j];
				}
			}
		}
		
		int result = INF;
		int idx = 0;
		
		for(int i = 1; i <= N; i++) {
			sum = 0;
			for(int j = 1; j <= N; j++) {
				sum += arr[i][j];
			}
			
			if(result > sum) { //최솟값이 동일할 경우 가장 작은 수를 출력하기 위해 '이상'이 아닌 '초과'로 설정
				result = sum;
				idx = i;
			}
		}
		
		bw.write(idx+"\n");
		bw.flush();
		bw.close();
	}
}