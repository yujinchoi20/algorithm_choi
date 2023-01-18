import java.io.*;
import java.util.*;

public class Main {
	public static int s(int a, int b) {
		int r;
		while(b != 0) {
			r = a % b;
			a = b;
			b = r;
		}
		
		return a;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		int A, B, b;
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Integer.parseInt(st.nextToken());
		
		//최대공약수로 나누기 
		for(int i = 0; i < N - 1; i++) {
			B = Integer.parseInt(st.nextToken());
			b = s(A, B);
			System.out.println((A/b) + "/" + (B/b));
		}
	}
}