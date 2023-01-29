import java.io.*;

public class Main {
	static int N, cnt = 0;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		//2차원 배열을 사용해도 되지만, 
		//1차원 배열을 사용하여 배열의 요소를 열, 배열의 인덱스를 행으로 사용함.
		
		dfs(0);
		System.out.println(cnt);
	}
	
	public static void dfs(int dep) {
		if(dep == N) { //체스판을 다 채웠다면
			cnt++;
			return;
		}
		
		for(int i = 0; i < N; i++) { //여기서 i는 열을 의미함.
			arr[dep] = i;
			
			if(poss(dep)) { //새로운 체스를 놓을 곳이 있다면
				dfs(dep + 1);
			}
		}
	}
	
	public static boolean poss(int col) {
		for(int i = 0; i < col; i++) {
			if(arr[col] == arr[i]) { //같은 행이라면 false 반환
				return false;
			} 
			else if(Math.abs(col - i) == Math.abs(arr[col] - arr[i])) { //대각선 상에 존재한다면 false 반환
				return false;
			}
		}
		return true;
	}
}
