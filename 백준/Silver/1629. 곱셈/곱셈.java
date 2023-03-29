import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		long A = Long.parseLong(st.nextToken());
		long B = Long.parseLong(st.nextToken());
		long C = Long.parseLong(st.nextToken());
		
		System.out.println(pow(A, B, C));
	}
	
	public static long pow(long a, long b, long c) {
		if(b == 0) return 1;
		if(b == 1) return a % c;
		
		long re = pow(a, b/2, c);
		if(b % 2 == 0) {
			return re * re % c;
		}
		else {
			return (re * re % c) * a % c;
		}
	}
}