import java.io.*;
import java.util.*;

public class Main {
	static int[] arr = new int[1000001];
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N, M;
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		for(int i = 2; i <= M; i++) { // 2~M까지 자기 자신을 대입 
			arr[i] = i;
		}
		
		for(int i = 2; i * i <= M; i++) {
			if(arr[i] == 0) continue; //소수라고 판별했기에 0을 대입 

			for(int j = i * i; j <= M; j+=i) {
				arr[j] = 0;
			}
		}
		
		for(int i = N; i <= M; i++) {
			if(arr[i] != 0) System.out.println(arr[i]);
		}
	}
}
