import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	static int year;
	static int M, N;
	static int x, y;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		
		int T = Integer.parseInt(br.readLine());
		for(int i = 0; i < T; i++) {
			st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			x = Integer.parseInt(st.nextToken())-1;
			y = Integer.parseInt(st.nextToken())-1;

			boolean flag = false;
			for(int j = x; j < (N*M); j+=M) {
				if(j % N == y) {
					flag = true;
					year = j+1;
					break;
				}
			}
			if(flag) {
				sb.append(year).append("\n");
			} else {
				year = -1;
				sb.append(year).append("\n");
			}
		}
		bw.write(sb + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}