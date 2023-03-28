import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine();
		String result = ""; 
		
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i) - 'A';
			arr[idx]++;
		}
		
		int numOdd = 0; //홀수개인 알파벳 개수
		for(int i = 0; i < 26; i++) {
			if(arr[i] % 2 != 0) numOdd++;
		}
		
		if (numOdd > 1) {
			bw.write("I'm Sorry Hansoo");
		}
		else {
			//ex) AAABB
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i]/2; j++) {
					sb.append((char)(i + 65)); //다시 알파벳 대문자로 변경
				}
			}
			result += sb.toString(); //front -> AB
			String end = sb.reverse().toString(); //end -> BA
			
			sb = new StringBuilder();
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] % 2 == 1) {
					sb.append((char)(i + 65));
				}
			}
			result += sb.toString(); //mid -> A
			result += end;
			bw.write(result); // ABABA
		}
		bw.flush();
		bw.close();
		br.close();
	}
}
