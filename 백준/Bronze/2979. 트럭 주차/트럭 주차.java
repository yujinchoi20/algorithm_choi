import java.io.*;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] arr = new int[101];
		int cost = 0;
		int maxTime = Integer.MIN_VALUE;
		int minTime = Integer.MAX_VALUE;
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		
		for(int i = 0; i < 3; i++) {
			st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			maxTime = Math.max(end, maxTime);
			minTime = Math.min(start, minTime);
			
			for(int j = start; j < end; j++) {
				arr[j]++;
			}
		}
		
		for(int i = minTime; i < maxTime; i++) {
			if(arr[i] == 1) {
				cost += (arr[i] * A);
			}
			else if(arr[i] == 2) {
				cost += (arr[i] * B);
			}
			else if(arr[i] == 3) {
				cost += (arr[i] * C);
			}
		}
		System.out.println(cost);
	}
}