import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A, B, N;
		
		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		N = Integer.parseInt(st.nextToken());
		
		int re = A % B;
		
		for(int i = 0; i < N-1; i++) { //N이 아니라 N-1
			re *= 10;
			re %= B;
		}
		
		re *= 10;
		System.out.println(re/B);
	}
}