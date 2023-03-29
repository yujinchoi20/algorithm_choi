import java.io.*;
import java.util.Stack;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		for(int i = 0; i < N; i++) {
			Stack<Character> stack = new Stack<>();
			String str = br.readLine();
			
			stack.push(str.charAt(0));
			for(int j = 1; j < str.length(); j++) {
				if(stack.size() > 0) {
					if(stack.peek() == str.charAt(j)) {
						stack.pop();
					}
					else {
						stack.push(str.charAt(j));
					}
				}
				else {
					stack.push(str.charAt(j));
				}
			}
			
			if(stack.size() == 0) {
				cnt++;
			}
		}
		bw.write(cnt + "\n");
		bw.flush();
		bw.close();
		br.close();
	}
}