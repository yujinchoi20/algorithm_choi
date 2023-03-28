import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int cnt = 0;
		
		int N = Integer.parseInt(br.readLine());
		int M = Integer.parseInt(br.readLine());
		int[] arr = new int[N];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		
		int i = 0; 
		int j = N - 1;

		while(i < j) {
			if(arr[i] + arr[j] < M) {
				i++;
			}
			else if (arr[i] + arr[j] > M) {
				j--;
			}
			else if(arr[i] + arr[j] == M) {
				i++;
				j--;
				cnt++;
			}
		}
		
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}