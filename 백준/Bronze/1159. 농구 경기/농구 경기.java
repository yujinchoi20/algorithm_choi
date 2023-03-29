import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(br.readLine());
		char[] name = new char[N];
		int[] arr = new int[26];
		
		for(int i = 0; i < N; i++) {
			String str = br.readLine();
			name[i] = str.charAt(0);

			int idx = name[i] - 'a';
			arr[idx]++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(arr[i] >= 5) {
				sb.append((char)(i + 'a'));
			}
		}
		
		if(sb.length() == 0) System.out.println("PREDAJA");
		else System.out.println(sb);
	}
}