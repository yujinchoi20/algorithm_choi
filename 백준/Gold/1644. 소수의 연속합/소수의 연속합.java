import java.io.*;
import java.util.*;

public class Main {
	static final int MAX = 4000000;
	static int N, cnt = 0;
	static int[] prime = new int[MAX+1];
	static ArrayList<Integer> primeArr = new ArrayList<>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		//소수 구하기
		for(int i = 1; i <= N; i++) {
			prime[i] = i;
		}
		
		for(int i = 2; i * i <= N; i++) {
			if(prime[i] == 0) continue;
			for(int j = i * i; j <= N; j += i) {
				prime[j] = 0;
			}
		}

		for(int i = 2; i <= N; i++) {
			if(prime[i] != 0) {
				primeArr.add(prime[i]);
			}
		}

		//연속합으로 정수를 구할 수 있는지 판별
		//슬라이딩 윈도우 알고리즘
		int start = 0, end = 0;
		int sum = 0, cnt = 0;
		
		while(true) {
			if(sum >= N) 
				sum -= primeArr.get(start++);
			else if(end == primeArr.size()) 
				break;
			else 
				sum += primeArr.get(end++);
			
			if(sum == N) 
				cnt++;
		}
		
		System.out.println(cnt);
	}

}
