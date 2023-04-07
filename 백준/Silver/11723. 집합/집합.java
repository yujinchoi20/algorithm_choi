import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int M = Integer.parseInt(br.readLine());
		int bit = 0;
		
		for(int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			int num;
			
			switch(str) {
			case "add":
				num = Integer.parseInt(st.nextToken());
				bit |= (1 << num - 1);
				break;
			case "remove":
				num = Integer.parseInt(st.nextToken());
				bit &= ~(1 << num - 1);
				break;
			case "check":
				num = Integer.parseInt(st.nextToken());
				sb.append((bit & (1 << num - 1)) != 0 ? 1 : 0).append("\n");
				break;
			case "toggle":
				num = Integer.parseInt(st.nextToken());
				bit ^= (1 << num - 1);
				break;
			case "all":
				bit |= (~0);
				break;
			case "empty":
				bit &= 0;
				break;
			}
		}
		System.out.println(sb);
		br.close();
	}
}