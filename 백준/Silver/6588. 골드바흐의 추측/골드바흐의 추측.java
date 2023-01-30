import java.io.*;

public class Main {
	static final int MAX = 1000000;
	static int[] arr = new int[MAX+1];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i = 2; i <= MAX; i++) {
			arr[i] = i;
		}
		
		for(int i = 2; i * i <= MAX; i++) {
			if(arr[i] == 0) continue;
			for(int j = i * i; j <= MAX; j+=i) {
				arr[j] = 0;
			}
		}
		
		while(true) {
			int N = Integer.parseInt(br.readLine());
			if(N == 0) break;
			
			//N에 대해서 가장 작은 소수를 구한뒤 (N - 소수)의 값이 소수인지 확인하면?
			for(int i = 2; i < N; i++) {
				if(arr[N - arr[i]] != 0) {
					bw.append(N + " = " + arr[i] + " + " + arr[N-arr[i]]).append('\n');
					break;
				}	
			}
		}
		
		bw.flush();
	}
}