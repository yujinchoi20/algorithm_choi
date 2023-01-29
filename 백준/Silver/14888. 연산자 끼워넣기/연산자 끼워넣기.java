import java.io.*;
import java.util.*;

public class Main {
	static int N;
	static int[] arr, operator = new int[4];
	static int MAX = Integer.MIN_VALUE;
	static int MIN = Integer.MAX_VALUE;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		
		st = new StringTokenizer(br.readLine());		
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < 4; i++) {
			operator[i] = Integer.parseInt(st.nextToken());
		}
		
		dfs(arr[0], 1);
		
		System.out.println(MAX);
		System.out.println(MIN);
	}
	
	public static void dfs(int num, int idx) { //num 누적 결과값, idx 사용하는 숫자의 인덱스
		if(idx == N) {
			MAX = Math.max(MAX, num);
			MIN = Math.min(MIN, num);
			
			return;
		}
		
		for(int i = 0; i < 4; i++) {
			if(operator[i] > 0) { //사용가능한 연산자가 있을 경우
				operator[i]--; //연산자를 사용했으므로 -1
				
				if(i == 0) { //더하기
					dfs(num + arr[idx], idx + 1);
				}
				else if(i == 1) { //뺴기
					dfs(num - arr[idx], idx + 1);
				}
				else if(i == 2) { //곱하기
					dfs(num * arr[idx], idx + 1);
				}
				else if(i == 3) { //나누기
					dfs(num / arr[idx], idx + 1);
				}
				
				operator[i]++;
			}
		}
	}
}
