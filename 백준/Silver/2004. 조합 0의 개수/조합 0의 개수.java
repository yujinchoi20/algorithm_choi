import java.io.*;
import java.util.*;

public class Main {
	public static long five(long n) {
		int cnt = 0;
		while(n >= 5) {
			cnt += (n / 5);
			n /= 5;
		}
		return cnt;
	}
	
	public static long two(long n) {
		int cnt = 0;
		while(n >= 2) {
			cnt += (n / 2);
			n /= 2;
		}
		return cnt;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long n = Integer.parseInt(st.nextToken());
		long m = Integer.parseInt(st.nextToken());
		
		long cnt5 = five(n) - five(n - m) - five(m);
		long cnt2 = two(n) - two(n - m) - two(m);
		
		System.out.println(Math.min(cnt5, cnt2));
	}
}