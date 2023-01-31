import java.io.*;
import java.util.*;

public class Main {
	static int N, K;
	static int g, x, X;
	static int MAX = Integer.MIN_VALUE;
	static int[] arr = new int[1000001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			g = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken());
			arr[x] = g;
			
			if(MAX < x) MAX = x;
		}

		int sum = 0, max = 0;
		int d = 2 * K + 1; //k = 3, d = 7
		
		for(int i = 0; i <= 1000000; i++) {
			if(i >= d) sum -= arr[i - d]; //슬라이딩 윈도우 
			sum += arr[i];
			
			if(sum > max) max = sum;
		}
		
		System.out.println(max);
	}
}