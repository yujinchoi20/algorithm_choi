import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		int N, K;
		int arr[];
		int sum = 0;
		int maxSum = Integer.MIN_VALUE;
		
		st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i <= N - K; i++) {
			sum = 0;
			for(int j = i; j < i + K; j++) {
				sum += arr[j];
			}
			
			maxSum = Math.max(maxSum, sum);
		}
		
		System.out.println(maxSum);
	}
}