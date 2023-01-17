import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		//10은 2와 5의 곱으로 만들어 진다.
		int cnt = 0;
		while(N >= 5) {
			cnt += (N / 5);
			N /= 5;
		}
		
		System.out.println(cnt);		
	}
}