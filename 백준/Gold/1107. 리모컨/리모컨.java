import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] btn = new int[10];
		int cnt = Math.abs(100-N); //count의 초기값 
		
		if(N == 100) {
			cnt = 0;
		}
		if(M != 0) {
			st = new StringTokenizer(br.readLine());
			for(int i = 0; i < M; i++) {
				int input = Integer.parseInt(st.nextToken());
				btn[input] = 1;
			}
		}
		
		for(int i = 0; i <= 999999; i++) {
			String s = String.valueOf(i);
			int len = s.length();
			
			boolean flag = true;
			for(int j = 0; j < len; j++) {
				int idx = s.charAt(j) - '0';
				if(btn[idx] == 1) {
					flag = false;
					break;
				}
			}
			
			if(flag) {
				int minValue = Math.abs(N-i) + len;
				cnt = Math.min(cnt, minValue);
			}
		}
		System.out.println(cnt);
	}
}