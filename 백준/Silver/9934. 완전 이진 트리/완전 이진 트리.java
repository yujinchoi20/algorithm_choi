import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int K, N;
	static int[] arr;
	static StringBuffer[] sb; //StringBuffer를 사용하여 해당 레벨에 존재하는 노드를 저장
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		K = Integer.parseInt(br.readLine());
		N = (int) Math.pow(2, K) - 1;
		arr = new int[N];
		sb = new StringBuffer[K];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i = 0; i < K; i++) {
			sb[i] = new StringBuffer();
		}
		
		dfs(0, 0, N-1);
		
		for(int i = 0; i < K; i++) {
			bw.write(sb[i].toString() + "\n");
		}
		bw.flush();
		bw.close();
		br.close();
	}
	
	public static void dfs(int level, int start, int end) { //레벨, 시작, 끝
		if(level == K) return;
		
		int mid = (start + end) / 2;
		sb[level].append(arr[mid] + " ");
		
		dfs(level + 1, start, mid - 1);
		dfs(level + 1, mid + 1, end);
	}
}