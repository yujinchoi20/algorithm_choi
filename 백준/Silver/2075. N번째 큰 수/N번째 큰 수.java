import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[] arr;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		N = Integer.parseInt(br.readLine());
		arr = new int[N*N];
		
		for(int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = N * i; j < N + N * i; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[N*N - N]);
	}
}